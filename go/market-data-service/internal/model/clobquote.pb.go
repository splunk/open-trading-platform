// Code generated by protoc-gen-go. DO NOT EDIT.
// source: clobquote.proto

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

type ClobLine struct {
	Size                 *Decimal64 `protobuf:"bytes,1,opt,name=size,proto3" json:"size,omitempty"`
	Price                *Decimal64 `protobuf:"bytes,2,opt,name=price,proto3" json:"price,omitempty"`
	EntryId              string     `protobuf:"bytes,3,opt,name=entryId,proto3" json:"entryId,omitempty"`
	XXX_NoUnkeyedLiteral struct{}   `json:"-"`
	XXX_unrecognized     []byte     `json:"-"`
	XXX_sizecache        int32      `json:"-"`
}

func (m *ClobLine) Reset()         { *m = ClobLine{} }
func (m *ClobLine) String() string { return proto.CompactTextString(m) }
func (*ClobLine) ProtoMessage()    {}
func (*ClobLine) Descriptor() ([]byte, []int) {
	return fileDescriptor_eff833333d312bfe, []int{0}
}

func (m *ClobLine) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ClobLine.Unmarshal(m, b)
}
func (m *ClobLine) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ClobLine.Marshal(b, m, deterministic)
}
func (m *ClobLine) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ClobLine.Merge(m, src)
}
func (m *ClobLine) XXX_Size() int {
	return xxx_messageInfo_ClobLine.Size(m)
}
func (m *ClobLine) XXX_DiscardUnknown() {
	xxx_messageInfo_ClobLine.DiscardUnknown(m)
}

var xxx_messageInfo_ClobLine proto.InternalMessageInfo

func (m *ClobLine) GetSize() *Decimal64 {
	if m != nil {
		return m.Size
	}
	return nil
}

func (m *ClobLine) GetPrice() *Decimal64 {
	if m != nil {
		return m.Price
	}
	return nil
}

func (m *ClobLine) GetEntryId() string {
	if m != nil {
		return m.EntryId
	}
	return ""
}

type ClobQuote struct {
	ListingId            int32       `protobuf:"varint,1,opt,name=listingId,proto3" json:"listingId,omitempty"`
	Bids                 []*ClobLine `protobuf:"bytes,2,rep,name=bids,proto3" json:"bids,omitempty"`
	Offers               []*ClobLine `protobuf:"bytes,3,rep,name=offers,proto3" json:"offers,omitempty"`
	XXX_NoUnkeyedLiteral struct{}    `json:"-"`
	XXX_unrecognized     []byte      `json:"-"`
	XXX_sizecache        int32       `json:"-"`
}

func (m *ClobQuote) Reset()         { *m = ClobQuote{} }
func (m *ClobQuote) String() string { return proto.CompactTextString(m) }
func (*ClobQuote) ProtoMessage()    {}
func (*ClobQuote) Descriptor() ([]byte, []int) {
	return fileDescriptor_eff833333d312bfe, []int{1}
}

func (m *ClobQuote) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ClobQuote.Unmarshal(m, b)
}
func (m *ClobQuote) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ClobQuote.Marshal(b, m, deterministic)
}
func (m *ClobQuote) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ClobQuote.Merge(m, src)
}
func (m *ClobQuote) XXX_Size() int {
	return xxx_messageInfo_ClobQuote.Size(m)
}
func (m *ClobQuote) XXX_DiscardUnknown() {
	xxx_messageInfo_ClobQuote.DiscardUnknown(m)
}

var xxx_messageInfo_ClobQuote proto.InternalMessageInfo

func (m *ClobQuote) GetListingId() int32 {
	if m != nil {
		return m.ListingId
	}
	return 0
}

func (m *ClobQuote) GetBids() []*ClobLine {
	if m != nil {
		return m.Bids
	}
	return nil
}

func (m *ClobQuote) GetOffers() []*ClobLine {
	if m != nil {
		return m.Offers
	}
	return nil
}

func init() {
	proto.RegisterType((*ClobLine)(nil), "model.ClobLine")
	proto.RegisterType((*ClobQuote)(nil), "model.ClobQuote")
}

func init() { proto.RegisterFile("clobquote.proto", fileDescriptor_eff833333d312bfe) }

var fileDescriptor_eff833333d312bfe = []byte{
	// 217 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xe2, 0x4f, 0xce, 0xc9, 0x4f,
	0x2a, 0x2c, 0xcd, 0x2f, 0x49, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x62, 0xcd, 0xcd, 0x4f,
	0x49, 0xcd, 0x91, 0x12, 0x04, 0x53, 0xc9, 0xf9, 0xb9, 0xb9, 0xf9, 0x79, 0x10, 0x19, 0xa5, 0x22,
	0x2e, 0x0e, 0xe7, 0x9c, 0xfc, 0x24, 0x9f, 0xcc, 0xbc, 0x54, 0x21, 0x15, 0x2e, 0x96, 0xe2, 0xcc,
	0xaa, 0x54, 0x09, 0x46, 0x05, 0x46, 0x0d, 0x6e, 0x23, 0x01, 0x3d, 0xb0, 0x6a, 0x3d, 0x97, 0xd4,
	0xe4, 0xcc, 0xdc, 0xc4, 0x1c, 0x33, 0x93, 0x20, 0xb0, 0xac, 0x90, 0x1a, 0x17, 0x6b, 0x41, 0x51,
	0x66, 0x72, 0xaa, 0x04, 0x13, 0x0e, 0x65, 0x10, 0x69, 0x21, 0x09, 0x2e, 0xf6, 0xd4, 0xbc, 0x92,
	0xa2, 0x4a, 0xcf, 0x14, 0x09, 0x66, 0x05, 0x46, 0x0d, 0xce, 0x20, 0x18, 0x57, 0xa9, 0x9c, 0x8b,
	0x13, 0x64, 0x67, 0x20, 0xc8, 0x81, 0x42, 0x32, 0x5c, 0x9c, 0x39, 0x99, 0xc5, 0x25, 0x99, 0x79,
	0xe9, 0x9e, 0x29, 0x60, 0x9b, 0x59, 0x83, 0x10, 0x02, 0x42, 0xca, 0x5c, 0x2c, 0x49, 0x99, 0x29,
	0xc5, 0x12, 0x4c, 0x0a, 0xcc, 0x1a, 0xdc, 0x46, 0xfc, 0x50, 0xbb, 0x60, 0x2e, 0x0e, 0x02, 0x4b,
	0x0a, 0xa9, 0x73, 0xb1, 0xe5, 0xa7, 0xa5, 0xa5, 0x16, 0x15, 0x4b, 0x30, 0x63, 0x57, 0x06, 0x95,
	0x76, 0x62, 0x8f, 0x82, 0x04, 0x44, 0x12, 0x1b, 0xd8, 0xf3, 0xc6, 0x80, 0x00, 0x00, 0x00, 0xff,
	0xff, 0xf5, 0xaa, 0x18, 0xe7, 0x29, 0x01, 0x00, 0x00,
}
