// Code generated by MockGen. DO NOT EDIT.
// Source: github.com/ettech/open-trading-platform/go/market-data/market-data-service/marketdatasource (interfaces: GatewayStreamSource)

// Package mocks is a generated GoMock package.
package mocks

import (
	context "context"
	reflect "reflect"
	time "time"

	marketdata "github.com/ettec/otp-common/marketdata"
	gomock "github.com/golang/mock/gomock"
)

// MockGatewayStreamSource is a mock of GatewayStreamSource interface.
type MockGatewayStreamSource struct {
	ctrl     *gomock.Controller
	recorder *MockGatewayStreamSourceMockRecorder
}

// MockGatewayStreamSourceMockRecorder is the mock recorder for MockGatewayStreamSource.
type MockGatewayStreamSourceMockRecorder struct {
	mock *MockGatewayStreamSource
}

// NewMockGatewayStreamSource creates a new mock instance.
func NewMockGatewayStreamSource(ctrl *gomock.Controller) *MockGatewayStreamSource {
	mock := &MockGatewayStreamSource{ctrl: ctrl}
	mock.recorder = &MockGatewayStreamSourceMockRecorder{mock}
	return mock
}

// EXPECT returns an object that allows the caller to indicate expected use.
func (m *MockGatewayStreamSource) EXPECT() *MockGatewayStreamSourceMockRecorder {
	return m.recorder
}

// NewQuoteStreamFromMdSource mocks base method.
func (m *MockGatewayStreamSource) NewQuoteStreamFromMdSource(arg0 context.Context, arg1, arg2 string, arg3 time.Duration, arg4 int) (marketdata.QuoteStream, error) {
	m.ctrl.T.Helper()
	ret := m.ctrl.Call(m, "NewQuoteStreamFromMdSource", arg0, arg1, arg2, arg3, arg4)
	ret0, _ := ret[0].(marketdata.QuoteStream)
	ret1, _ := ret[1].(error)
	return ret0, ret1
}

// NewQuoteStreamFromMdSource indicates an expected call of NewQuoteStreamFromMdSource.
func (mr *MockGatewayStreamSourceMockRecorder) NewQuoteStreamFromMdSource(arg0, arg1, arg2, arg3, arg4 interface{}) *gomock.Call {
	mr.mock.ctrl.T.Helper()
	return mr.mock.ctrl.RecordCallWithMethodType(mr.mock, "NewQuoteStreamFromMdSource", reflect.TypeOf((*MockGatewayStreamSource)(nil).NewQuoteStreamFromMdSource), arg0, arg1, arg2, arg3, arg4)
}