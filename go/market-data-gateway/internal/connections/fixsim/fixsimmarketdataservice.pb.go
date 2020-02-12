// Code generated by protoc-gen-go. DO NOT EDIT.
// source: fixsimmarketdataservice.proto

package fixsim

import (
	marketdata "github.com/ettec/open-trading-platform/go/market-data-gateway/internal/fix/marketdata"
	context "context"
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	empty "github.com/golang/protobuf/ptypes/empty"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type ConnectRequest struct {
	PartyId              string   `protobuf:"bytes,1,opt,name=partyId,proto3" json:"partyId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *ConnectRequest) Reset()         { *m = ConnectRequest{} }
func (m *ConnectRequest) String() string { return proto.CompactTextString(m) }
func (*ConnectRequest) ProtoMessage()    {}
func (*ConnectRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_bce990059aaa8241, []int{0}
}

func (m *ConnectRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ConnectRequest.Unmarshal(m, b)
}
func (m *ConnectRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ConnectRequest.Marshal(b, m, deterministic)
}
func (m *ConnectRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ConnectRequest.Merge(m, src)
}
func (m *ConnectRequest) XXX_Size() int {
	return xxx_messageInfo_ConnectRequest.Size(m)
}
func (m *ConnectRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ConnectRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ConnectRequest proto.InternalMessageInfo

func (m *ConnectRequest) GetPartyId() string {
	if m != nil {
		return m.PartyId
	}
	return ""
}

func init() {
	proto.RegisterType((*ConnectRequest)(nil), "marketdataservice.ConnectRequest")
}

func init() { proto.RegisterFile("fixsimmarketdataservice.proto", fileDescriptor_bce990059aaa8241) }

var fileDescriptor_bce990059aaa8241 = []byte{
	// 260 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x91, 0xb1, 0x4e, 0xc3, 0x30,
	0x10, 0x86, 0x9b, 0xa5, 0x55, 0x3d, 0x20, 0xf0, 0x00, 0x55, 0x50, 0x25, 0xc8, 0x54, 0x31, 0xb8,
	0xa8, 0xac, 0x4c, 0x50, 0x90, 0x3a, 0xb0, 0x24, 0x5b, 0x37, 0xc7, 0xbd, 0xb4, 0x27, 0xe2, 0x38,
	0x9c, 0x2f, 0x28, 0x7d, 0x36, 0x5e, 0x0e, 0x11, 0xb7, 0x2a, 0xd0, 0x6e, 0x3e, 0xff, 0xbf, 0xfc,
	0x7d, 0xd6, 0x89, 0x71, 0x81, 0xad, 0x47, 0x6b, 0x35, 0xbd, 0x03, 0xaf, 0x34, 0x6b, 0x0f, 0xf4,
	0x89, 0x06, 0x54, 0x4d, 0x8e, 0x9d, 0xbc, 0x38, 0x0a, 0xe2, 0xf3, 0xc3, 0x55, 0x28, 0xc5, 0xd7,
	0x6b, 0xe7, 0xd6, 0x25, 0x4c, 0xbb, 0x29, 0x6f, 0x8a, 0x29, 0xd8, 0x9a, 0xb7, 0x21, 0x4c, 0xee,
	0xc4, 0xd9, 0xb3, 0xab, 0x2a, 0x30, 0x9c, 0xc2, 0x47, 0x03, 0x9e, 0xe5, 0x48, 0x0c, 0x6a, 0x4d,
	0xbc, 0x5d, 0xac, 0x46, 0xd1, 0x4d, 0x34, 0x19, 0xa6, 0xfb, 0x71, 0xf6, 0x15, 0x89, 0xab, 0x57,
	0x6c, 0x33, 0xb4, 0x6f, 0x1d, 0x63, 0xae, 0x59, 0x67, 0x01, 0x2b, 0xe7, 0x62, 0x98, 0x35, 0xb9,
	0x37, 0x84, 0x39, 0xc8, 0xb1, 0x3a, 0x14, 0x7e, 0x1d, 0x77, 0x84, 0xf8, 0x52, 0x05, 0x23, 0xb5,
	0x37, 0x52, 0x2f, 0x3f, 0x46, 0x49, 0x4f, 0x2e, 0xc5, 0x60, 0x67, 0x23, 0x6f, 0xd5, 0xf1, 0xa7,
	0xff, 0x9a, 0xc6, 0x93, 0xd3, 0x98, 0x45, 0x65, 0x08, 0x2c, 0x54, 0xac, 0xcb, 0x14, 0x0a, 0x02,
	0xbf, 0x49, 0x7a, 0xf7, 0xd1, 0xd3, 0xa3, 0x98, 0x19, 0x67, 0x15, 0x30, 0x83, 0xd9, 0xa8, 0x02,
	0xdb, 0xf0, 0xbe, 0x47, 0xdb, 0x94, 0x9a, 0x1d, 0xfd, 0xe3, 0x01, 0x29, 0x5d, 0xe3, 0xb2, 0x1f,
	0x16, 0x90, 0xf7, 0x3b, 0xd7, 0x87, 0xef, 0x00, 0x00, 0x00, 0xff, 0xff, 0x6f, 0x4b, 0xda, 0x21,
	0x91, 0x01, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// FixSimMarketDataServiceClient is the client API for FixSimMarketDataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type FixSimMarketDataServiceClient interface {
	Subscribe(ctx context.Context, in *marketdata.MarketDataRequest, opts ...grpc.CallOption) (*empty.Empty, error)
	Connect(ctx context.Context, in *ConnectRequest, opts ...grpc.CallOption) (FixSimMarketDataService_ConnectClient, error)
}

type fixSimMarketDataServiceClient struct {
	cc *grpc.ClientConn
}

func NewFixSimMarketDataServiceClient(cc *grpc.ClientConn) FixSimMarketDataServiceClient {
	return &fixSimMarketDataServiceClient{cc}
}

func (c *fixSimMarketDataServiceClient) Subscribe(ctx context.Context, in *marketdata.MarketDataRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/marketdataservice.FixSimMarketDataService/Subscribe", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fixSimMarketDataServiceClient) Connect(ctx context.Context, in *ConnectRequest, opts ...grpc.CallOption) (FixSimMarketDataService_ConnectClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FixSimMarketDataService_serviceDesc.Streams[0], "/marketdataservice.FixSimMarketDataService/connect", opts...)
	if err != nil {
		return nil, err
	}
	x := &fixSimMarketDataServiceConnectClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type FixSimMarketDataService_ConnectClient interface {
	Recv() (*marketdata.MarketDataIncrementalRefresh, error)
	grpc.ClientStream
}

type fixSimMarketDataServiceConnectClient struct {
	grpc.ClientStream
}

func (x *fixSimMarketDataServiceConnectClient) Recv() (*marketdata.MarketDataIncrementalRefresh, error) {
	m := new(marketdata.MarketDataIncrementalRefresh)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// FixSimMarketDataServiceServer is the server API for FixSimMarketDataService service.
type FixSimMarketDataServiceServer interface {
	Subscribe(context.Context, *marketdata.MarketDataRequest) (*empty.Empty, error)
	Connect(*ConnectRequest, FixSimMarketDataService_ConnectServer) error
}

// UnimplementedFixSimMarketDataServiceServer can be embedded to have forward compatible implementations.
type UnimplementedFixSimMarketDataServiceServer struct {
}

func (*UnimplementedFixSimMarketDataServiceServer) Subscribe(ctx context.Context, req *marketdata.MarketDataRequest) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Subscribe not implemented")
}
func (*UnimplementedFixSimMarketDataServiceServer) Connect(req *ConnectRequest, srv FixSimMarketDataService_ConnectServer) error {
	return status.Errorf(codes.Unimplemented, "method connect not implemented")
}

func RegisterFixSimMarketDataServiceServer(s *grpc.Server, srv FixSimMarketDataServiceServer) {
	s.RegisterService(&_FixSimMarketDataService_serviceDesc, srv)
}

func _FixSimMarketDataService_Subscribe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(marketdata.MarketDataRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FixSimMarketDataServiceServer).Subscribe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/marketdataservice.FixSimMarketDataService/Subscribe",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FixSimMarketDataServiceServer).Subscribe(ctx, req.(*marketdata.MarketDataRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FixSimMarketDataService_Connect_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(ConnectRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(FixSimMarketDataServiceServer).Connect(m, &fixSimMarketDataServiceConnectServer{stream})
}

type FixSimMarketDataService_ConnectServer interface {
	Send(*marketdata.MarketDataIncrementalRefresh) error
	grpc.ServerStream
}

type fixSimMarketDataServiceConnectServer struct {
	grpc.ServerStream
}

func (x *fixSimMarketDataServiceConnectServer) Send(m *marketdata.MarketDataIncrementalRefresh) error {
	return x.ServerStream.SendMsg(m)
}

var _FixSimMarketDataService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "marketdataservice.FixSimMarketDataService",
	HandlerType: (*FixSimMarketDataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Subscribe",
			Handler:    _FixSimMarketDataService_Subscribe_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "connect",
			Handler:       _FixSimMarketDataService_Connect_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "fixsimmarketdataservice.proto",
}