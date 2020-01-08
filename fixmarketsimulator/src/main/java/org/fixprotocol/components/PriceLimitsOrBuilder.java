// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface PriceLimitsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.PriceLimits)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.fix.Decimal64 high_limit_price = 1 [(.fix.tag) = 1149, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the highLimitPrice field is set.
   */
  boolean hasHighLimitPrice();
  /**
   * <code>.fix.Decimal64 high_limit_price = 1 [(.fix.tag) = 1149, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The highLimitPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getHighLimitPrice();
  /**
   * <code>.fix.Decimal64 high_limit_price = 1 [(.fix.tag) = 1149, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getHighLimitPriceOrBuilder();

  /**
   * <code>.fix.Decimal64 low_limit_price = 2 [(.fix.tag) = 1148, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the lowLimitPrice field is set.
   */
  boolean hasLowLimitPrice();
  /**
   * <code>.fix.Decimal64 low_limit_price = 2 [(.fix.tag) = 1148, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The lowLimitPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getLowLimitPrice();
  /**
   * <code>.fix.Decimal64 low_limit_price = 2 [(.fix.tag) = 1148, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getLowLimitPriceOrBuilder();

  /**
   * <code>.Common.PriceLimitTypeEnum price_limit_type = 3 [(.fix.tag) = 1306, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for priceLimitType.
   */
  int getPriceLimitTypeValue();
  /**
   * <code>.Common.PriceLimitTypeEnum price_limit_type = 3 [(.fix.tag) = 1306, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The priceLimitType.
   */
  org.fixprotocol.components.PriceLimitTypeEnum getPriceLimitType();

  /**
   * <code>.fix.Decimal64 trading_reference_price = 4 [(.fix.tag) = 1150, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the tradingReferencePrice field is set.
   */
  boolean hasTradingReferencePrice();
  /**
   * <code>.fix.Decimal64 trading_reference_price = 4 [(.fix.tag) = 1150, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The tradingReferencePrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getTradingReferencePrice();
  /**
   * <code>.fix.Decimal64 trading_reference_price = 4 [(.fix.tag) = 1150, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getTradingReferencePriceOrBuilder();
}
