package model

import (
	"testing"
)

func TestOrder_UpdateTradedQuantityOnPendingLiveOrder(t *testing.T) {
	o := Order{}
	o.SetTargetStatus(OrderStatus_LIVE)

	o.AddExecution(*IasD(5), *IasD(6), "a")

	if o.Status != OrderStatus_LIVE && o.TargetStatus != OrderStatus_NONE {
		t.FailNow()
	}

}

func TestOrder_AddExecution(t *testing.T) {

	o := NewOrder("a", Side_BUY, IasD(40), IasD(20), 1, "oid", "oref")

	lastPrice := Decimal64{
		Mantissa: 10,
		Exponent: 1,
	}

	lastQnt := Decimal64{
		Mantissa: 5,
		Exponent: 0,
	}

	o.AddExecution(lastPrice, lastQnt, "a")

	if !o.RemainingQuantity.Equal(IasD(35)) {
		t.FailNow()
	}

	if !o.TradedQuantity.Equal(&lastQnt) {
		t.FailNow()
	}

	if !o.LastExecPrice.Equal(&lastPrice) {
		t.FailNow()
	}

	if o.LastExecSeqNo != 1 {
		t.FailNow()
	}

	result, _ := o.AvgTradePrice.AsDecimal().Float64()

	expectedAvgTrdPrice := 100.0
	if !floatEquals(result, expectedAvgTrdPrice) {
		t.Fatalf("Expected avg price %v, got %v", expectedAvgTrdPrice, result)
	}

	lastPrice = Decimal64{
		Mantissa: 80,
		Exponent: 0,
	}

	lastQnt = Decimal64{
		Mantissa: 5,
		Exponent: 0,
	}

	o.AddExecution(lastPrice, lastQnt, "b")

	if !o.RemainingQuantity.Equal(IasD(30)) {
		t.FailNow()
	}

	if !o.TradedQuantity.Equal(IasD(10)) {
		t.FailNow()
	}

	if !o.LastExecPrice.Equal(&lastPrice) {
		t.FailNow()
	}

	if o.LastExecSeqNo != 2 {
		t.FailNow()
	}

	result, _ = o.AvgTradePrice.AsDecimal().Float64()

	expectedAvgTrdPrice = 90.0
	if !floatEquals(result, expectedAvgTrdPrice) {
		t.Fatalf("Expected avg price %v, got %v", expectedAvgTrdPrice, result)
	}

}

var EPSILON = 0.00000001

func floatEquals(a, b float64) bool {
	if (a-b) < EPSILON && (b-a) < EPSILON {
		return true
	}
	return false
}
