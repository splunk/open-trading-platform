package main

import (
	"context"
	"database/sql"
	"errors"

	"github.com/emicklei/go-restful/v3/log"
	core "github.com/envoyproxy/go-control-plane/envoy/api/v2/core"
	auth "github.com/envoyproxy/go-control-plane/envoy/service/auth/v2"
	envoytype "github.com/envoyproxy/go-control-plane/envoy/type"
	"github.com/ettec/otp-common/bootstrap"
	"github.com/ettech/open-trading-platform/go/authorization-service/api/loginservice"
	"github.com/gogo/googleapis/google/rpc"
	"github.com/google/uuid"
	_ "github.com/lib/pq"
	"github.com/signalfx/splunk-otel-go/distro"
	"github.com/sirupsen/logrus"
	"go.opentelemetry.io/otel"
	"go.opentelemetry.io/otel/trace"
	oteltrace "go.opentelemetry.io/otel/trace"
	"google.golang.org/genproto/googleapis/rpc/status"
	"google.golang.org/grpc"

	"net"
	"os"
	"os/signal"
	"strings"
	"syscall"
)

type user struct {
	id              string
	desk            string
	permissionFlags string
	token           string
}

var globalAPMService string

type authService struct {
	users map[string]user
}

func (a *authService) Login(_ context.Context, params *loginservice.LoginParams) (*loginservice.Token, error) {
	//ctx := context.TODO()
	ctx, span := otel.Tracer("github.com/my/repo").Start(context.Background(), "Login")
	defer span.End()
	spanCtx := trace.SpanContextFromContext(ctx)
	logrus.WithFields(LogrusFields(spanCtx)).Info("logging in")

	if user, ok := a.users[params.User]; ok {
		return &loginservice.Token{
			Token: user.token,
			Desk:  user.desk,
		}, nil
	}

	return nil, errors.New("user not found")
}

func (a *authService) Check(_ context.Context, req *auth.CheckRequest) (*auth.CheckResponse, error) {

	ctx := context.TODO()
	ctx, span := otel.Tracer("github.com/my/repo").Start(context.Background(), "Check")
	defer span.End()
	spanCtx := trace.SpanContextFromContext(ctx)
	path, ok := req.Attributes.Request.Http.Headers[":path"]
	if ok && strings.HasPrefix(path, "/loginservice.LoginService") {
		logrus.WithFields(LogrusFields(spanCtx)).Info("permitted login for path", "path", path)
		return newOkResponse(), nil
	}

	authHeader, ok := req.Attributes.Request.Http.Headers["auth-token"]
	log.Printf("authHeader: %v", authHeader)
	if !ok {
		return newPermissionDeniedResponse("auth-token header is required"), nil
	}

	username, ok := req.Attributes.Request.Http.Headers["user-name"]
	if !ok {
		return newUnauthenticatedResponse("No user-name found on request"), nil
	}

	user, ok := a.users[username]
	if !ok {
		return newUnauthenticatedResponse("user not found"), nil
	}

	if user.token != authHeader {
		return newUnauthenticatedResponse("invalid token"), nil
	}

	// Authorization
	if ok && strings.HasPrefix(path, "/executionvenue.ExecutionVenue") {
		if strings.Contains(user.permissionFlags, "T") {
			return newOkResponse(), nil
		} else {
			return newPermissionDeniedResponse("trading permissions required"), nil
		}
	}

	return newOkResponse(), nil
}

func newOkResponse() *auth.CheckResponse {
	return &auth.CheckResponse{
		Status: &status.Status{
			Code: int32(rpc.OK),
		},
		HttpResponse: &auth.CheckResponse_OkResponse{
			OkResponse: &auth.OkHttpResponse{
				//Headers: []*envoy_api_v2_core.HeaderValueOption{
				Headers: []*core.HeaderValueOption{
					{
						//Header: &envoy_api_v2_core.HeaderValue{
						Header: &core.HeaderValue{
							Key:   "authorised",
							Value: "true",
						},
					},
				},
			},
		},
	}
}

func newPermissionDeniedResponse(message string) *auth.CheckResponse {
	return &auth.CheckResponse{
		Status: &status.Status{
			Code: int32(rpc.PERMISSION_DENIED),
		},
		HttpResponse: &auth.CheckResponse_DeniedResponse{
			DeniedResponse: &auth.DeniedHttpResponse{
				Status: &envoytype.HttpStatus{
					Code: envoytype.StatusCode_Unauthorized,
				},
				Body: message,
			},
		},
	}
}

func newUnauthenticatedResponse(message string) *auth.CheckResponse {
	return &auth.CheckResponse{
		Status: &status.Status{
			Code: int32(rpc.UNAUTHENTICATED),
		},
		HttpResponse: &auth.CheckResponse_DeniedResponse{
			DeniedResponse: &auth.DeniedHttpResponse{
				Status: &envoytype.HttpStatus{
					Code: envoytype.StatusCode_Unauthorized,
				},
				Body: message,
			},
		},
	}
}

const (
	DatabaseConnectionString = "DB_CONN_STRING"
	DatabaseDriverName       = "DB_DRIVER_NAME"
	SplunkServiceName        = "OTEL_SERVICE_NAME" // will be used to grab the env variable with the Env to use
)

func main() {

	sdk, err := distro.Run()
	if err != nil {
		panic(err)
	}
	// Flush all spans before the application exits
	defer func() {
		if err := sdk.Shutdown(context.Background()); err != nil {
			panic(err)
		}
	}()
	//Set splunk APM data

	globalAPMService = bootstrap.GetEnvVar(SplunkServiceName)

	//get Tracer into the context
	//ctx := context.TODO()
	ctx, span := otel.Tracer("github.com/my/repo").Start(context.Background(), "main")
	defer span.End()
	spanCtx := trace.SpanContextFromContext(ctx)

	// Ensure logrus behaves like TTY is disabled
	logrus.SetFormatter(&logrus.TextFormatter{
		DisableColors: true,
		FullTimestamp: true,
	})

	dbString := bootstrap.GetEnvVar(DatabaseConnectionString)
	dbDriverName := bootstrap.GetEnvVar(DatabaseDriverName)

	db, err := sql.Open(dbDriverName, dbString)
	if err != nil {
		logrus.WithFields(LogrusFields(spanCtx)).Panicf("failed to open database connection: %v", err)
	}
	defer func() {
		if err := db.Close(); err != nil {
			logrus.Error("error when closing database connection", "error", err)

		}
	}()

	err = db.Ping()
	if err != nil {
		logrus.WithFields(LogrusFields(spanCtx)).Panicf("could not establish a connection with the database: %v", err)
	}
	// location for db span
	r, err := db.Query("SELECT id, desk, permissionflags FROM users.users")
	if err != nil {
		logrus.WithFields(LogrusFields(spanCtx)).Panicf("failed to get users from database")
	}

	users := map[string]user{}
	for r.Next() {
		u := user{}
		err := r.Scan(&u.id, &u.desk, &u.permissionFlags)
		if err != nil {
			logrus.WithFields(LogrusFields(spanCtx)).Panicf("failed to scan user row: %v", err)
		}
		u.token = uuid.New().String()
		users[u.id] = u
	}

	logrus.WithFields(LogrusFields(spanCtx)).Info("loaded users", "userCount", len(users))

	authServer := &authService{users: users}

	go func() {

		loginPort := "50551"
		lis, err := net.Listen("tcp", ":"+loginPort)
		if err != nil {
			logrus.WithFields(LogrusFields(spanCtx)).Panicf("failed to listen: %v", err)
		}

		logrus.WithFields(LogrusFields(spanCtx)).Info("authentication server listening", "listenAddress", lis.Addr())
		authenticationGrpcServer := grpc.NewServer()
		loginservice.RegisterLoginServiceServer(authenticationGrpcServer, authServer)

		sigCh := make(chan os.Signal, 1)
		signal.Notify(sigCh,
			syscall.SIGKILL,
			syscall.SIGTERM,
			syscall.SIGQUIT)
		go func() {
			<-sigCh
			authenticationGrpcServer.GracefulStop()
		}()

		logrus.WithFields(LogrusFields(spanCtx)).Info("starting authentication server", "port", loginPort)
		if err := authenticationGrpcServer.Serve(lis); err != nil {
			logrus.WithFields(LogrusFields(spanCtx)).Panicf("Failed to start authentication server: %v", err)
		}
	}()

	authPort := "4000"
	lis, err := net.Listen("tcp", ":"+authPort)
	if err != nil {
		logrus.WithFields(LogrusFields(spanCtx)).Panicf("failed to listen: %v", err)
	}

	logrus.WithFields(LogrusFields(spanCtx)).Info("authorisation server listening", "listenAddress", lis.Addr())
	grpcServer := grpc.NewServer()

	auth.RegisterAuthorizationServer(grpcServer, authServer)

	sigCh := make(chan os.Signal, 1)
	signal.Notify(sigCh,
		syscall.SIGKILL,
		syscall.SIGTERM,
		syscall.SIGQUIT)
	go func() {
		<-sigCh
		grpcServer.GracefulStop()
	}()

	logrus.WithFields(LogrusFields(spanCtx)).Info("starting authorization server", "port", authPort)
	if err := grpcServer.Serve(lis); err != nil {
		logrus.WithFields(LogrusFields(spanCtx)).Panicf("Failed to start authorization server: %v", err)
	}

}

func LogrusFields(spanCtx oteltrace.SpanContext) logrus.Fields {

	if !spanCtx.IsValid() || globalAPMService == "" { // no trace info in spanctx or no env set
		return logrus.Fields{}
	}
	return logrus.Fields{
		"span_id":      spanCtx.SpanID().String(),
		"trace_id":     spanCtx.TraceID().String(),
		"trace_flags":  spanCtx.TraceFlags().String(),
		"service.name": globalAPMService,
		//"Deployment.environment": globalAPMService,
	}
}
