// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface InstrmtLegExecGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.InstrmtLegExecGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the instrumentLeg field is set.
   */
  boolean hasInstrumentLeg();
  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The instrumentLeg.
   */
  org.fixprotocol.components.InstrumentLeg getInstrumentLeg();
  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.InstrumentLegOrBuilder getInstrumentLegOrBuilder();

  /**
   * <code>.fix.Decimal64 leg_calculated_ccy_last_qty = 2 [(.fix.tag) = 1074, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legCalculatedCcyLastQty field is set.
   */
  boolean hasLegCalculatedCcyLastQty();
  /**
   * <code>.fix.Decimal64 leg_calculated_ccy_last_qty = 2 [(.fix.tag) = 1074, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legCalculatedCcyLastQty.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegCalculatedCcyLastQty();
  /**
   * <code>.fix.Decimal64 leg_calculated_ccy_last_qty = 2 [(.fix.tag) = 1074, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegCalculatedCcyLastQtyOrBuilder();

  /**
   * <code>.Common.LegCoveredOrUncoveredEnum leg_covered_or_uncovered = 3 [(.fix.tag) = 565, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legCoveredOrUncovered.
   */
  int getLegCoveredOrUncoveredValue();
  /**
   * <code>.Common.LegCoveredOrUncoveredEnum leg_covered_or_uncovered = 3 [(.fix.tag) = 565, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legCoveredOrUncovered.
   */
  org.fixprotocol.components.LegCoveredOrUncoveredEnum getLegCoveredOrUncovered();

  /**
   * <code>.fix.Decimal64 leg_gross_trade_amt = 4 [(.fix.tag) = 1075, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legGrossTradeAmt field is set.
   */
  boolean hasLegGrossTradeAmt();
  /**
   * <code>.fix.Decimal64 leg_gross_trade_amt = 4 [(.fix.tag) = 1075, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legGrossTradeAmt.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegGrossTradeAmt();
  /**
   * <code>.fix.Decimal64 leg_gross_trade_amt = 4 [(.fix.tag) = 1075, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegGrossTradeAmtOrBuilder();

  /**
   * <code>.fix.Decimal64 leg_last_forward_points = 5 [(.fix.tag) = 1073, (.fix.type) = DATATYPE_PRICE_OFFSET, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legLastForwardPoints field is set.
   */
  boolean hasLegLastForwardPoints();
  /**
   * <code>.fix.Decimal64 leg_last_forward_points = 5 [(.fix.tag) = 1073, (.fix.type) = DATATYPE_PRICE_OFFSET, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legLastForwardPoints.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegLastForwardPoints();
  /**
   * <code>.fix.Decimal64 leg_last_forward_points = 5 [(.fix.tag) = 1073, (.fix.type) = DATATYPE_PRICE_OFFSET, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegLastForwardPointsOrBuilder();

  /**
   * <code>.fix.Decimal64 leg_last_px = 6 [(.fix.tag) = 637, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legLastPx field is set.
   */
  boolean hasLegLastPx();
  /**
   * <code>.fix.Decimal64 leg_last_px = 6 [(.fix.tag) = 637, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legLastPx.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegLastPx();
  /**
   * <code>.fix.Decimal64 leg_last_px = 6 [(.fix.tag) = 637, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegLastPxOrBuilder();

  /**
   * <code>.fix.Decimal64 leg_order_qty = 7 [(.fix.tag) = 685, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legOrderQty field is set.
   */
  boolean hasLegOrderQty();
  /**
   * <code>.fix.Decimal64 leg_order_qty = 7 [(.fix.tag) = 685, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legOrderQty.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegOrderQty();
  /**
   * <code>.fix.Decimal64 leg_order_qty = 7 [(.fix.tag) = 685, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegOrderQtyOrBuilder();

  /**
   * <code>.Common.LegPositionEffectEnum leg_position_effect = 8 [(.fix.tag) = 564, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legPositionEffect.
   */
  int getLegPositionEffectValue();
  /**
   * <code>.Common.LegPositionEffectEnum leg_position_effect = 8 [(.fix.tag) = 564, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legPositionEffect.
   */
  org.fixprotocol.components.LegPositionEffectEnum getLegPositionEffect();

  /**
   * <code>.fix.Decimal64 leg_qty = 9 [(.fix.tag) = 687, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legQty field is set.
   */
  boolean hasLegQty();
  /**
   * <code>.fix.Decimal64 leg_qty = 9 [(.fix.tag) = 687, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legQty.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegQty();
  /**
   * <code>.fix.Decimal64 leg_qty = 9 [(.fix.tag) = 687, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegQtyOrBuilder();

  /**
   * <code>string leg_ref_id = 10 [(.fix.tag) = 654, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legRefId.
   */
  java.lang.String getLegRefId();
  /**
   * <code>string leg_ref_id = 10 [(.fix.tag) = 654, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for legRefId.
   */
  com.google.protobuf.ByteString
      getLegRefIdBytes();

  /**
   * <code>string leg_settl_currency = 11 [(.fix.tag) = 675, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSettlCurrency.
   */
  java.lang.String getLegSettlCurrency();
  /**
   * <code>string leg_settl_currency = 11 [(.fix.tag) = 675, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for legSettlCurrency.
   */
  com.google.protobuf.ByteString
      getLegSettlCurrencyBytes();

  /**
   * <code>sfixed32 leg_settl_date = 12 [(.fix.tag) = 588, (.fix.type) = DATATYPE_LOCAL_MKT_DATE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSettlDate.
   */
  int getLegSettlDate();

  /**
   * <code>.Common.LegSettlTypeEnum leg_settl_type = 13 [(.fix.tag) = 587, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legSettlType.
   */
  int getLegSettlTypeValue();
  /**
   * <code>.Common.LegSettlTypeEnum leg_settl_type = 13 [(.fix.tag) = 587, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSettlType.
   */
  org.fixprotocol.components.LegSettlTypeEnum getLegSettlType();

  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 14 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.LegStipulations> 
      getLegStipulationsList();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 14 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegStipulations getLegStipulations(int index);
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 14 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getLegStipulationsCount();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 14 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.LegStipulationsOrBuilder> 
      getLegStipulationsOrBuilderList();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 14 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegStipulationsOrBuilder getLegStipulationsOrBuilder(
      int index);

  /**
   * <code>.Common.LegSwapTypeEnum leg_swap_type = 15 [(.fix.tag) = 690, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legSwapType.
   */
  int getLegSwapTypeValue();
  /**
   * <code>.Common.LegSwapTypeEnum leg_swap_type = 15 [(.fix.tag) = 690, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSwapType.
   */
  org.fixprotocol.components.LegSwapTypeEnum getLegSwapType();

  /**
   * <code>string leg_alloc_id = 16 [(.fix.tag) = 1366, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The legAllocId.
   */
  java.lang.String getLegAllocId();
  /**
   * <code>string leg_alloc_id = 16 [(.fix.tag) = 1366, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for legAllocId.
   */
  com.google.protobuf.ByteString
      getLegAllocIdBytes();

  /**
   * <code>.fix.Decimal64 leg_currency_ratio = 17 [(.fix.tag) = 1383, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the legCurrencyRatio field is set.
   */
  boolean hasLegCurrencyRatio();
  /**
   * <code>.fix.Decimal64 leg_currency_ratio = 17 [(.fix.tag) = 1383, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The legCurrencyRatio.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegCurrencyRatio();
  /**
   * <code>.fix.Decimal64 leg_currency_ratio = 17 [(.fix.tag) = 1383, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegCurrencyRatioOrBuilder();

  /**
   * <code>.fix.Decimal64 leg_dividend_yield = 18 [(.fix.tag) = 1381, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the legDividendYield field is set.
   */
  boolean hasLegDividendYield();
  /**
   * <code>.fix.Decimal64 leg_dividend_yield = 18 [(.fix.tag) = 1381, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The legDividendYield.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegDividendYield();
  /**
   * <code>.fix.Decimal64 leg_dividend_yield = 18 [(.fix.tag) = 1381, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegDividendYieldOrBuilder();

  /**
   * <code>repeated .Common.LegExecInstEnum leg_exec_inst = 19 [(.fix.tag) = 1384, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return A list containing the legExecInst.
   */
  java.util.List<org.fixprotocol.components.LegExecInstEnum> getLegExecInstList();
  /**
   * <code>repeated .Common.LegExecInstEnum leg_exec_inst = 19 [(.fix.tag) = 1384, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The count of legExecInst.
   */
  int getLegExecInstCount();
  /**
   * <code>repeated .Common.LegExecInstEnum leg_exec_inst = 19 [(.fix.tag) = 1384, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @param index The index of the element to return.
   * @return The legExecInst at the given index.
   */
  org.fixprotocol.components.LegExecInstEnum getLegExecInst(int index);
  /**
   * <code>repeated .Common.LegExecInstEnum leg_exec_inst = 19 [(.fix.tag) = 1384, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return A list containing the enum numeric values on the wire for legExecInst.
   */
  java.util.List<java.lang.Integer>
  getLegExecInstValueList();
  /**
   * <code>repeated .Common.LegExecInstEnum leg_exec_inst = 19 [(.fix.tag) = 1384, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of legExecInst at the given index.
   */
  int getLegExecInstValue(int index);

  /**
   * <code>.fix.Decimal64 leg_last_qty = 20 [(.fix.tag) = 1418, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the legLastQty field is set.
   */
  boolean hasLegLastQty();
  /**
   * <code>.fix.Decimal64 leg_last_qty = 20 [(.fix.tag) = 1418, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The legLastQty.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegLastQty();
  /**
   * <code>.fix.Decimal64 leg_last_qty = 20 [(.fix.tag) = 1418, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegLastQtyOrBuilder();

  /**
   * <code>repeated .Common.LegPreAllocGrp leg_pre_alloc_grp = 21 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.LegPreAllocGrp> 
      getLegPreAllocGrpList();
  /**
   * <code>repeated .Common.LegPreAllocGrp leg_pre_alloc_grp = 21 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.LegPreAllocGrp getLegPreAllocGrp(int index);
  /**
   * <code>repeated .Common.LegPreAllocGrp leg_pre_alloc_grp = 21 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getLegPreAllocGrpCount();
  /**
   * <code>repeated .Common.LegPreAllocGrp leg_pre_alloc_grp = 21 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.LegPreAllocGrpOrBuilder> 
      getLegPreAllocGrpOrBuilderList();
  /**
   * <code>repeated .Common.LegPreAllocGrp leg_pre_alloc_grp = 21 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.LegPreAllocGrpOrBuilder getLegPreAllocGrpOrBuilder(
      int index);

  /**
   * <code>.fix.Decimal64 leg_volatility = 22 [(.fix.tag) = 1379, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the legVolatility field is set.
   */
  boolean hasLegVolatility();
  /**
   * <code>.fix.Decimal64 leg_volatility = 22 [(.fix.tag) = 1379, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The legVolatility.
   */
  org.fixprotocol.components.Fix.Decimal64 getLegVolatility();
  /**
   * <code>.fix.Decimal64 leg_volatility = 22 [(.fix.tag) = 1379, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLegVolatilityOrBuilder();

  /**
   * <code>repeated .Common.NestedParties3 nested_parties3 = 23 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.NestedParties3> 
      getNestedParties3List();
  /**
   * <code>repeated .Common.NestedParties3 nested_parties3 = 23 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.NestedParties3 getNestedParties3(int index);
  /**
   * <code>repeated .Common.NestedParties3 nested_parties3 = 23 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getNestedParties3Count();
  /**
   * <code>repeated .Common.NestedParties3 nested_parties3 = 23 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.NestedParties3OrBuilder> 
      getNestedParties3OrBuilderList();
  /**
   * <code>repeated .Common.NestedParties3 nested_parties3 = 23 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.NestedParties3OrBuilder getNestedParties3OrBuilder(
      int index);
}
