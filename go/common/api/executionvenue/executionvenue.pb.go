// Code generated by protoc-gen-go. DO NOT EDIT.
// source: executionvenue.proto

package executionvenue

import (
	context "context"
	fmt "fmt"
	"github.com/ettec/open-trading-platform/go/model"
	proto "github.com/golang/protobuf/proto"
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

type CreateAndRouteOrderParams struct {
	OrderSide            model.Side       `protobuf:"varint,1,opt,name=orderSide,proto3,enum=model.Side" json:"orderSide,omitempty"`
	Quantity             *model.Decimal64 `protobuf:"bytes,2,opt,name=quantity,proto3" json:"quantity,omitempty"`
	Price                *model.Decimal64 `protobuf:"bytes,3,opt,name=price,proto3" json:"price,omitempty"`
	Listing              *model.Listing   `protobuf:"bytes,4,opt,name=listing,proto3" json:"listing,omitempty"`
	OriginatorId         string           `protobuf:"bytes,5,opt,name=originatorId,proto3" json:"originatorId,omitempty"`
	OriginatorRef        string           `protobuf:"bytes,6,opt,name=originatorRef,proto3" json:"originatorRef,omitempty"`
	XXX_NoUnkeyedLiteral struct{}         `json:"-"`
	XXX_unrecognized     []byte           `json:"-"`
	XXX_sizecache        int32            `json:"-"`
}

func (m *CreateAndRouteOrderParams) Reset()         { *m = CreateAndRouteOrderParams{} }
func (m *CreateAndRouteOrderParams) String() string { return proto.CompactTextString(m) }
func (*CreateAndRouteOrderParams) ProtoMessage()    {}
func (*CreateAndRouteOrderParams) Descriptor() ([]byte, []int) {
	return fileDescriptor_30da1a85cda8249c, []int{0}
}

func (m *CreateAndRouteOrderParams) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateAndRouteOrderParams.Unmarshal(m, b)
}
func (m *CreateAndRouteOrderParams) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateAndRouteOrderParams.Marshal(b, m, deterministic)
}
func (m *CreateAndRouteOrderParams) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateAndRouteOrderParams.Merge(m, src)
}
func (m *CreateAndRouteOrderParams) XXX_Size() int {
	return xxx_messageInfo_CreateAndRouteOrderParams.Size(m)
}
func (m *CreateAndRouteOrderParams) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateAndRouteOrderParams.DiscardUnknown(m)
}

var xxx_messageInfo_CreateAndRouteOrderParams proto.InternalMessageInfo

func (m *CreateAndRouteOrderParams) GetOrderSide() model.Side {
	if m != nil {
		return m.OrderSide
	}
	return model.Side_BUY
}

func (m *CreateAndRouteOrderParams) GetQuantity() *model.Decimal64 {
	if m != nil {
		return m.Quantity
	}
	return nil
}

func (m *CreateAndRouteOrderParams) GetPrice() *model.Decimal64 {
	if m != nil {
		return m.Price
	}
	return nil
}

func (m *CreateAndRouteOrderParams) GetListing() *model.Listing {
	if m != nil {
		return m.Listing
	}
	return nil
}

func (m *CreateAndRouteOrderParams) GetOriginatorId() string {
	if m != nil {
		return m.OriginatorId
	}
	return ""
}

func (m *CreateAndRouteOrderParams) GetOriginatorRef() string {
	if m != nil {
		return m.OriginatorRef
	}
	return ""
}

type OrderId struct {
	OrderId              string   `protobuf:"bytes,1,opt,name=orderId,proto3" json:"orderId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *OrderId) Reset()         { *m = OrderId{} }
func (m *OrderId) String() string { return proto.CompactTextString(m) }
func (*OrderId) ProtoMessage()    {}
func (*OrderId) Descriptor() ([]byte, []int) {
	return fileDescriptor_30da1a85cda8249c, []int{1}
}

func (m *OrderId) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OrderId.Unmarshal(m, b)
}
func (m *OrderId) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OrderId.Marshal(b, m, deterministic)
}
func (m *OrderId) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OrderId.Merge(m, src)
}
func (m *OrderId) XXX_Size() int {
	return xxx_messageInfo_OrderId.Size(m)
}
func (m *OrderId) XXX_DiscardUnknown() {
	xxx_messageInfo_OrderId.DiscardUnknown(m)
}

var xxx_messageInfo_OrderId proto.InternalMessageInfo

func (m *OrderId) GetOrderId() string {
	if m != nil {
		return m.OrderId
	}
	return ""
}

type CancelOrderParams struct {
	OrderId              string         `protobuf:"bytes,1,opt,name=orderId,proto3" json:"orderId,omitempty"`
	Listing              *model.Listing `protobuf:"bytes,2,opt,name=listing,proto3" json:"listing,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *CancelOrderParams) Reset()         { *m = CancelOrderParams{} }
func (m *CancelOrderParams) String() string { return proto.CompactTextString(m) }
func (*CancelOrderParams) ProtoMessage()    {}
func (*CancelOrderParams) Descriptor() ([]byte, []int) {
	return fileDescriptor_30da1a85cda8249c, []int{2}
}

func (m *CancelOrderParams) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CancelOrderParams.Unmarshal(m, b)
}
func (m *CancelOrderParams) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CancelOrderParams.Marshal(b, m, deterministic)
}
func (m *CancelOrderParams) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CancelOrderParams.Merge(m, src)
}
func (m *CancelOrderParams) XXX_Size() int {
	return xxx_messageInfo_CancelOrderParams.Size(m)
}
func (m *CancelOrderParams) XXX_DiscardUnknown() {
	xxx_messageInfo_CancelOrderParams.DiscardUnknown(m)
}

var xxx_messageInfo_CancelOrderParams proto.InternalMessageInfo

func (m *CancelOrderParams) GetOrderId() string {
	if m != nil {
		return m.OrderId
	}
	return ""
}

func (m *CancelOrderParams) GetListing() *model.Listing {
	if m != nil {
		return m.Listing
	}
	return nil
}

func init() {
	proto.RegisterType((*CreateAndRouteOrderParams)(nil), "executionvenue.CreateAndRouteOrderParams")
	proto.RegisterType((*OrderId)(nil), "executionvenue.OrderId")
	proto.RegisterType((*CancelOrderParams)(nil), "executionvenue.CancelOrderParams")
}

func init() { proto.RegisterFile("executionvenue.proto", fileDescriptor_30da1a85cda8249c) }

var fileDescriptor_30da1a85cda8249c = []byte{
	// 343 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x7c, 0x92, 0x4f, 0x4f, 0xea, 0x40,
	0x14, 0xc5, 0x29, 0xef, 0x01, 0x8f, 0x5b, 0x68, 0x1e, 0xa3, 0x89, 0x63, 0x57, 0x58, 0x8d, 0x29,
	0x89, 0xe9, 0x02, 0x8d, 0x6b, 0x0d, 0xb2, 0x20, 0x31, 0xd1, 0x8c, 0x89, 0x2e, 0x5c, 0x8d, 0xed,
	0x95, 0x4c, 0xd2, 0xce, 0xe0, 0x30, 0x35, 0xf2, 0x2d, 0xfc, 0x26, 0x7e, 0x45, 0xc3, 0xb4, 0xc8,
	0x1f, 0xc5, 0x5d, 0xef, 0x39, 0xbf, 0x99, 0xf4, 0xcc, 0xb9, 0xb0, 0x8b, 0x6f, 0x18, 0xe7, 0x46,
	0x28, 0xf9, 0x8a, 0x32, 0xc7, 0x68, 0xa2, 0x95, 0x51, 0xc4, 0x5b, 0x57, 0xfd, 0x76, 0x2a, 0xa6,
	0x46, 0xc8, 0x71, 0x61, 0xfb, 0xae, 0xd2, 0x09, 0xea, 0x72, 0xe8, 0x64, 0x2a, 0xc1, 0x34, 0x56,
	0x59, 0xa6, 0x64, 0x21, 0x05, 0xef, 0x55, 0xd8, 0x1f, 0x68, 0xe4, 0x06, 0x2f, 0x65, 0xc2, 0x54,
	0x6e, 0xf0, 0x66, 0x7e, 0xe0, 0x96, 0x6b, 0x9e, 0x4d, 0x49, 0x0f, 0x9a, 0xf6, 0xfc, 0x9d, 0x48,
	0x90, 0x3a, 0x5d, 0x27, 0xf4, 0xfa, 0x6e, 0x64, 0x2f, 0x89, 0xe6, 0x12, 0x5b, 0xba, 0xe4, 0x04,
	0xfe, 0xbd, 0xe4, 0x5c, 0x1a, 0x61, 0x66, 0xb4, 0xda, 0x75, 0x42, 0xb7, 0xff, 0xbf, 0x24, 0xaf,
	0x30, 0x16, 0x19, 0x4f, 0xcf, 0xcf, 0xd8, 0x17, 0x41, 0x8e, 0xa1, 0x36, 0xd1, 0x22, 0x46, 0xfa,
	0x67, 0x0b, 0x5a, 0xd8, 0x24, 0x84, 0x46, 0x99, 0x87, 0xfe, 0xb5, 0xa4, 0x57, 0x92, 0xd7, 0x85,
	0xca, 0x16, 0x36, 0x09, 0xa0, 0xa5, 0xb4, 0x18, 0x0b, 0xc9, 0x8d, 0xd2, 0xa3, 0x84, 0xd6, 0xba,
	0x4e, 0xd8, 0x64, 0x6b, 0x1a, 0x39, 0x82, 0xf6, 0x72, 0x66, 0xf8, 0x4c, 0xeb, 0x16, 0x5a, 0x17,
	0x83, 0x43, 0x68, 0xd8, 0x37, 0x18, 0x25, 0x84, 0x42, 0x43, 0x15, 0x9f, 0x36, 0x7d, 0x93, 0x2d,
	0xc6, 0xe0, 0x01, 0x3a, 0x03, 0x2e, 0x63, 0x4c, 0x57, 0x9f, 0x6b, 0x2b, 0xbe, 0x9a, 0xa3, 0xfa,
	0x6b, 0x8e, 0xfe, 0x87, 0x03, 0xde, 0x70, 0x51, 0xe9, 0xfd, 0xbc, 0x52, 0xf2, 0x08, 0x3b, 0x3f,
	0x54, 0x44, 0x7a, 0xd1, 0xc6, 0x42, 0x6c, 0xed, 0xd1, 0xdf, 0xdb, 0x44, 0xcb, 0x80, 0x41, 0x85,
	0x5c, 0x80, 0xbb, 0x12, 0x84, 0x1c, 0x7c, 0xbb, 0x74, 0x33, 0xa5, 0xdf, 0x2a, 0x7f, 0x7d, 0x98,
	0x4d, 0xcc, 0x2c, 0xa8, 0x3c, 0xd5, 0xed, 0x26, 0x9d, 0x7e, 0x06, 0x00, 0x00, 0xff, 0xff, 0x49,
	0x65, 0xaa, 0xa0, 0xa0, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// ExecutionVenueClient is the client API for ExecutionVenue service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type ExecutionVenueClient interface {
	CreateAndRouteOrder(ctx context.Context, in *CreateAndRouteOrderParams, opts ...grpc.CallOption) (*OrderId, error)
	CancelOrder(ctx context.Context, in *CancelOrderParams, opts ...grpc.CallOption) (*model.Empty, error)
}

type executionVenueClient struct {
	cc *grpc.ClientConn
}

func NewExecutionVenueClient(cc *grpc.ClientConn) ExecutionVenueClient {
	return &executionVenueClient{cc}
}

func (c *executionVenueClient) CreateAndRouteOrder(ctx context.Context, in *CreateAndRouteOrderParams, opts ...grpc.CallOption) (*OrderId, error) {
	out := new(OrderId)
	err := c.cc.Invoke(ctx, "/executionvenue.ExecutionVenue/CreateAndRouteOrder", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *executionVenueClient) CancelOrder(ctx context.Context, in *CancelOrderParams, opts ...grpc.CallOption) (*model.Empty, error) {
	out := new(model.Empty)
	err := c.cc.Invoke(ctx, "/executionvenue.ExecutionVenue/CancelOrder", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ExecutionVenueServer is the server API for ExecutionVenue service.
type ExecutionVenueServer interface {
	CreateAndRouteOrder(context.Context, *CreateAndRouteOrderParams) (*OrderId, error)
	CancelOrder(context.Context, *CancelOrderParams) (*model.Empty, error)
}

// UnimplementedExecutionVenueServer can be embedded to have forward compatible implementations.
type UnimplementedExecutionVenueServer struct {
}

func (*UnimplementedExecutionVenueServer) CreateAndRouteOrder(ctx context.Context, req *CreateAndRouteOrderParams) (*OrderId, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateAndRouteOrder not implemented")
}
func (*UnimplementedExecutionVenueServer) CancelOrder(ctx context.Context, req *CancelOrderParams) (*model.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CancelOrder not implemented")
}

func RegisterExecutionVenueServer(s *grpc.Server, srv ExecutionVenueServer) {
	s.RegisterService(&_ExecutionVenue_serviceDesc, srv)
}

func _ExecutionVenue_CreateAndRouteOrder_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateAndRouteOrderParams)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ExecutionVenueServer).CreateAndRouteOrder(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/executionvenue.ExecutionVenue/CreateAndRouteOrder",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ExecutionVenueServer).CreateAndRouteOrder(ctx, req.(*CreateAndRouteOrderParams))
	}
	return interceptor(ctx, in, info, handler)
}

func _ExecutionVenue_CancelOrder_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CancelOrderParams)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ExecutionVenueServer).CancelOrder(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/executionvenue.ExecutionVenue/CancelOrder",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ExecutionVenueServer).CancelOrder(ctx, req.(*CancelOrderParams))
	}
	return interceptor(ctx, in, info, handler)
}

var _ExecutionVenue_serviceDesc = grpc.ServiceDesc{
	ServiceName: "executionvenue.ExecutionVenue",
	HandlerType: (*ExecutionVenueServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateAndRouteOrder",
			Handler:    _ExecutionVenue_CreateAndRouteOrder_Handler,
		},
		{
			MethodName: "CancelOrder",
			Handler:    _ExecutionVenue_CancelOrder_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "executionvenue.proto",
}
