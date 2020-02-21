// Code generated by protoc-gen-go. DO NOT EDIT.
// source: modelcommon.proto

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

type Empty struct {
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Empty) Reset()         { *m = Empty{} }
func (m *Empty) String() string { return proto.CompactTextString(m) }
func (*Empty) ProtoMessage()    {}
func (*Empty) Descriptor() ([]byte, []int) {
	return fileDescriptor_46ab2d819cd00111, []int{0}
}

func (m *Empty) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Empty.Unmarshal(m, b)
}
func (m *Empty) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Empty.Marshal(b, m, deterministic)
}
func (m *Empty) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Empty.Merge(m, src)
}
func (m *Empty) XXX_Size() int {
	return xxx_messageInfo_Empty.Size(m)
}
func (m *Empty) XXX_DiscardUnknown() {
	xxx_messageInfo_Empty.DiscardUnknown(m)
}

var xxx_messageInfo_Empty proto.InternalMessageInfo

type Decimal64 struct {
	Mantissa             int64    `protobuf:"fixed64,1,opt,name=mantissa,proto3" json:"mantissa,omitempty"`
	Exponent             int32    `protobuf:"fixed32,2,opt,name=exponent,proto3" json:"exponent,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *Decimal64) Reset()         { *m = Decimal64{} }
func (m *Decimal64) String() string { return proto.CompactTextString(m) }
func (*Decimal64) ProtoMessage()    {}
func (*Decimal64) Descriptor() ([]byte, []int) {
	return fileDescriptor_46ab2d819cd00111, []int{1}
}

func (m *Decimal64) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Decimal64.Unmarshal(m, b)
}
func (m *Decimal64) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Decimal64.Marshal(b, m, deterministic)
}
func (m *Decimal64) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Decimal64.Merge(m, src)
}
func (m *Decimal64) XXX_Size() int {
	return xxx_messageInfo_Decimal64.Size(m)
}
func (m *Decimal64) XXX_DiscardUnknown() {
	xxx_messageInfo_Decimal64.DiscardUnknown(m)
}

var xxx_messageInfo_Decimal64 proto.InternalMessageInfo

func (m *Decimal64) GetMantissa() int64 {
	if m != nil {
		return m.Mantissa
	}
	return 0
}

func (m *Decimal64) GetExponent() int32 {
	if m != nil {
		return m.Exponent
	}
	return 0
}

func init() {
	proto.RegisterType((*Empty)(nil), "model.Empty")
	proto.RegisterType((*Decimal64)(nil), "model.Decimal64")
}

func init() { proto.RegisterFile("modelcommon.proto", fileDescriptor_46ab2d819cd00111) }

var fileDescriptor_46ab2d819cd00111 = []byte{
	// 119 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xcc, 0xcd, 0x4f, 0x49,
	0xcd, 0x49, 0xce, 0xcf, 0xcd, 0xcd, 0xcf, 0xd3, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x62, 0x05,
	0x0b, 0x29, 0xb1, 0x73, 0xb1, 0xba, 0xe6, 0x16, 0x94, 0x54, 0x2a, 0x39, 0x73, 0x71, 0xba, 0xa4,
	0x26, 0x67, 0xe6, 0x26, 0xe6, 0x98, 0x99, 0x08, 0x49, 0x71, 0x71, 0xe4, 0x26, 0xe6, 0x95, 0x64,
	0x16, 0x17, 0x27, 0x4a, 0x30, 0x2a, 0x30, 0x6a, 0x08, 0x04, 0xc1, 0xf9, 0x20, 0xb9, 0xd4, 0x8a,
	0x82, 0xfc, 0xbc, 0xd4, 0xbc, 0x12, 0x09, 0x26, 0x05, 0x46, 0x0d, 0xfe, 0x20, 0x38, 0xdf, 0x89,
	0x3d, 0x0a, 0x62, 0x6c, 0x12, 0x1b, 0xd8, 0x12, 0x63, 0x40, 0x00, 0x00, 0x00, 0xff, 0xff, 0xe4,
	0x13, 0xf7, 0xde, 0x79, 0x00, 0x00, 0x00,
}
