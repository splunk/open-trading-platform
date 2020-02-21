// Code generated by protoc-gen-go. DO NOT EDIT.
// source: order.proto

package model

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
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

type Side int32

const (
	Side_BUY  Side = 0
	Side_SELL Side = 1
)

var Side_name = map[int32]string{
	0: "BUY",
	1: "SELL",
}

var Side_value = map[string]int32{
	"BUY":  0,
	"SELL": 1,
}

func (x Side) String() string {
	return proto.EnumName(Side_name, int32(x))
}

func (Side) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{0}
}

type OrderStatus int32

const (
	OrderStatus_NONE      OrderStatus = 0
	OrderStatus_LIVE      OrderStatus = 1
	OrderStatus_FILLED    OrderStatus = 2
	OrderStatus_CANCELLED OrderStatus = 3
)

var OrderStatus_name = map[int32]string{
	0: "NONE",
	1: "LIVE",
	2: "FILLED",
	3: "CANCELLED",
}

var OrderStatus_value = map[string]int32{
	"NONE":      0,
	"LIVE":      1,
	"FILLED":    2,
	"CANCELLED": 3,
}

func (x OrderStatus) String() string {
	return proto.EnumName(OrderStatus_name, int32(x))
}

func (OrderStatus) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{1}
}

type Order struct {
	Version              int32       `protobuf:"varint,1,opt,name=version,proto3" json:"version,omitempty"`
	Id                   string      `protobuf:"bytes,2,opt,name=id,proto3" json:"id,omitempty"`
	Side                 Side        `protobuf:"varint,3,opt,name=side,proto3,enum=model.Side" json:"side,omitempty"`
	Quantity             *Decimal64  `protobuf:"bytes,4,opt,name=quantity,proto3" json:"quantity,omitempty"`
	Price                *Decimal64  `protobuf:"bytes,5,opt,name=price,proto3" json:"price,omitempty"`
	ListingId            int32       `protobuf:"varint,6,opt,name=listingId,proto3" json:"listingId,omitempty"`
	RemainingQuantity    *Decimal64  `protobuf:"bytes,7,opt,name=remainingQuantity,proto3" json:"remainingQuantity,omitempty"`
	TradedQuantity       *Decimal64  `protobuf:"bytes,8,opt,name=tradedQuantity,proto3" json:"tradedQuantity,omitempty"`
	AvgTradePrice        *Decimal64  `protobuf:"bytes,9,opt,name=avgTradePrice,proto3" json:"avgTradePrice,omitempty"`
	Status               OrderStatus `protobuf:"varint,10,opt,name=status,proto3,enum=model.OrderStatus" json:"status,omitempty"`
	TargetStatus         OrderStatus `protobuf:"varint,11,opt,name=targetStatus,proto3,enum=model.OrderStatus" json:"targetStatus,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *Order) Reset()         { *m = Order{} }
func (m *Order) String() string { return proto.CompactTextString(m) }
func (*Order) ProtoMessage()    {}
func (*Order) Descriptor() ([]byte, []int) {
	return fileDescriptor_cd01338c35d87077, []int{0}
}

func (m *Order) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Order.Unmarshal(m, b)
}
func (m *Order) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Order.Marshal(b, m, deterministic)
}
func (m *Order) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Order.Merge(m, src)
}
func (m *Order) XXX_Size() int {
	return xxx_messageInfo_Order.Size(m)
}
func (m *Order) XXX_DiscardUnknown() {
	xxx_messageInfo_Order.DiscardUnknown(m)
}

var xxx_messageInfo_Order proto.InternalMessageInfo

func (m *Order) GetVersion() int32 {
	if m != nil {
		return m.Version
	}
	return 0
}

func (m *Order) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *Order) GetSide() Side {
	if m != nil {
		return m.Side
	}
	return Side_BUY
}

func (m *Order) GetQuantity() *Decimal64 {
	if m != nil {
		return m.Quantity
	}
	return nil
}

func (m *Order) GetPrice() *Decimal64 {
	if m != nil {
		return m.Price
	}
	return nil
}

func (m *Order) GetListingId() int32 {
	if m != nil {
		return m.ListingId
	}
	return 0
}

func (m *Order) GetRemainingQuantity() *Decimal64 {
	if m != nil {
		return m.RemainingQuantity
	}
	return nil
}

func (m *Order) GetTradedQuantity() *Decimal64 {
	if m != nil {
		return m.TradedQuantity
	}
	return nil
}

func (m *Order) GetAvgTradePrice() *Decimal64 {
	if m != nil {
		return m.AvgTradePrice
	}
	return nil
}

func (m *Order) GetStatus() OrderStatus {
	if m != nil {
		return m.Status
	}
	return OrderStatus_NONE
}

func (m *Order) GetTargetStatus() OrderStatus {
	if m != nil {
		return m.TargetStatus
	}
	return OrderStatus_NONE
}

func init() {
	proto.RegisterEnum("model.Side", Side_name, Side_value)
	proto.RegisterEnum("model.OrderStatus", OrderStatus_name, OrderStatus_value)
	proto.RegisterType((*Order)(nil), "model.Order")
}

func init() { proto.RegisterFile("order.proto", fileDescriptor_cd01338c35d87077) }

var fileDescriptor_cd01338c35d87077 = []byte{
	// 358 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x74, 0x92, 0x4f, 0x6b, 0xdb, 0x40,
	0x10, 0xc5, 0xab, 0xff, 0xd6, 0xa8, 0x36, 0xf2, 0x9c, 0xb6, 0xa5, 0x50, 0xd1, 0x43, 0x11, 0xa6,
	0xf8, 0xe0, 0x16, 0xd3, 0x43, 0x29, 0xd4, 0xb6, 0x0a, 0x06, 0x61, 0x27, 0x72, 0x12, 0x48, 0x6e,
	0x8a, 0x77, 0x11, 0x0b, 0x96, 0xe4, 0xac, 0xd6, 0x86, 0x7c, 0xd7, 0x7c, 0x98, 0xa0, 0x95, 0xed,
	0xc4, 0x09, 0x3a, 0x89, 0x79, 0xef, 0xf7, 0x46, 0xbb, 0x3b, 0x03, 0x5e, 0x29, 0x28, 0x13, 0xc3,
	0xad, 0x28, 0x65, 0x89, 0x56, 0x5e, 0x52, 0xb6, 0xf9, 0xdc, 0x57, 0x9f, 0x75, 0x99, 0xe7, 0x65,
	0xd1, 0x38, 0xdf, 0x9e, 0x0c, 0xb0, 0x96, 0x35, 0x89, 0x04, 0x9c, 0x3d, 0x13, 0x15, 0x2f, 0x0b,
	0xa2, 0x05, 0x5a, 0x68, 0x25, 0xc7, 0x12, 0x7b, 0xa0, 0x73, 0x4a, 0xf4, 0x40, 0x0b, 0xdd, 0x44,
	0xe7, 0x14, 0xbf, 0x82, 0x59, 0x71, 0xca, 0x88, 0x11, 0x68, 0x61, 0x6f, 0xe4, 0x0d, 0x55, 0xd7,
	0xe1, 0x8a, 0x53, 0x96, 0x28, 0x03, 0x7f, 0x40, 0xe7, 0x61, 0x97, 0x16, 0x92, 0xcb, 0x47, 0x62,
	0x06, 0x5a, 0xe8, 0x8d, 0xfc, 0x03, 0x34, 0x63, 0x6b, 0x9e, 0xa7, 0x9b, 0xf1, 0xaf, 0xe4, 0x44,
	0xe0, 0x77, 0xb0, 0xb6, 0x82, 0xaf, 0x19, 0xb1, 0x5a, 0xd0, 0xc6, 0xc6, 0x2f, 0xe0, 0x6e, 0x78,
	0x25, 0x79, 0x91, 0xcd, 0x29, 0xb1, 0xd5, 0x11, 0x5f, 0x04, 0xfc, 0x0b, 0x7d, 0xc1, 0xf2, 0x94,
	0x17, 0xbc, 0xc8, 0x2e, 0x8f, 0x3f, 0x77, 0x5a, 0x3a, 0xbe, 0x47, 0xf1, 0x37, 0xf4, 0xa4, 0x48,
	0x29, 0xa3, 0xa7, 0x70, 0xa7, 0x25, 0xfc, 0x86, 0xc3, 0x31, 0x74, 0xd3, 0x7d, 0x76, 0x55, 0x8b,
	0x17, 0xea, 0x1e, 0x6e, 0x4b, 0xf0, 0x1c, 0xc3, 0x01, 0xd8, 0x95, 0x4c, 0xe5, 0xae, 0x22, 0xa0,
	0x1e, 0x12, 0x0f, 0x01, 0x35, 0x8e, 0x95, 0x72, 0x92, 0x03, 0x81, 0x63, 0xf8, 0x28, 0x53, 0x91,
	0x31, 0xd9, 0xe8, 0xc4, 0x6b, 0x4d, 0x9c, 0x71, 0x83, 0x4f, 0x60, 0xd6, 0x73, 0x41, 0x07, 0x8c,
	0xc9, 0xf5, 0xad, 0xff, 0x01, 0x3b, 0x60, 0xae, 0xa2, 0x38, 0xf6, 0xb5, 0xc1, 0x1f, 0xf0, 0x5e,
	0xe5, 0x6a, 0x63, 0xb1, 0x5c, 0x44, 0x0d, 0x12, 0xcf, 0x6f, 0x22, 0x5f, 0x43, 0x00, 0xfb, 0xff,
	0x3c, 0x8e, 0xa3, 0x99, 0xaf, 0x63, 0x17, 0xdc, 0xe9, 0xbf, 0xc5, 0x34, 0x52, 0xa5, 0x31, 0x71,
	0xee, 0x9a, 0x9d, 0xba, 0xb7, 0xd5, 0x1e, 0xfd, 0x7c, 0x0e, 0x00, 0x00, 0xff, 0xff, 0xb5, 0xff,
	0x2c, 0xbd, 0x70, 0x02, 0x00, 0x00,
}
