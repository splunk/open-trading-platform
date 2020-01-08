// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.PosAmtTypeEnum}
 */
public enum PosAmtTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>POS_AMT_TYPE_UNSPECIFIED = 0;</code>
   */
  POS_AMT_TYPE_UNSPECIFIED(0),
  /**
   * <code>POS_AMT_TYPE_CASH_AMOUNT = 1 [(.fix.enum_value) = "CASH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_CASH_AMOUNT(1),
  /**
   * <code>POS_AMT_TYPE_CASH_RESIDUAL_AMOUNT = 2 [(.fix.enum_value) = "CRES", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_CASH_RESIDUAL_AMOUNT(2),
  /**
   * <code>POS_AMT_TYPE_FINAL_MARK_TO_MARKET_AMOUNT = 3 [(.fix.enum_value) = "FMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_FINAL_MARK_TO_MARKET_AMOUNT(3),
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_MARK_TO_MARKET_AMOUNT = 4 [(.fix.enum_value) = "IMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_INCREMENTAL_MARK_TO_MARKET_AMOUNT(4),
  /**
   * <code>POS_AMT_TYPE_PREMIUM_AMOUNT = 5 [(.fix.enum_value) = "PREM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_PREMIUM_AMOUNT(5),
  /**
   * <code>POS_AMT_TYPE_START_OF_DAY_MARK_TO_MARKET_AMOUNT = 6 [(.fix.enum_value) = "SMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_START_OF_DAY_MARK_TO_MARKET_AMOUNT(6),
  /**
   * <code>POS_AMT_TYPE_TRADE_VARIATION_AMOUNT = 7 [(.fix.enum_value) = "TVAR", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_TRADE_VARIATION_AMOUNT(7),
  /**
   * <code>POS_AMT_TYPE_VALUE_ADJUSTED_AMOUNT = 8 [(.fix.enum_value) = "VADJ", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  POS_AMT_TYPE_VALUE_ADJUSTED_AMOUNT(8),
  /**
   * <code>POS_AMT_TYPE_SETTLEMENT_VALUE = 9 [(.fix.enum_value) = "SETL", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 4];</code>
   */
  POS_AMT_TYPE_SETTLEMENT_VALUE(9),
  /**
   * <code>POS_AMT_TYPE_ACCRUED_COUPON_AMOUNT = 10 [(.fix.enum_value) = "ACPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_ACCRUED_COUPON_AMOUNT(10),
  /**
   * <code>POS_AMT_TYPE_COLLATERALIZED_MARK_TO_MARKET = 11 [(.fix.enum_value) = "CMTM", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_COLLATERALIZED_MARK_TO_MARKET(11),
  /**
   * <code>POS_AMT_TYPE_COMPENSATION_AMOUNT = 12 [(.fix.enum_value) = "DLV", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_COMPENSATION_AMOUNT(12),
  /**
   * <code>POS_AMT_TYPE_COUPON_AMOUNT = 13 [(.fix.enum_value) = "CPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_COUPON_AMOUNT(13),
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_ACCRUED_COUPON = 14 [(.fix.enum_value) = "IACPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_INCREMENTAL_ACCRUED_COUPON(14),
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET = 15 [(.fix.enum_value) = "ICMTM", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET(15),
  /**
   * <code>POS_AMT_TYPE_INITIAL_TRADE_COUPON_AMOUNT = 16 [(.fix.enum_value) = "ICPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_INITIAL_TRADE_COUPON_AMOUNT(16),
  /**
   * <code>POS_AMT_TYPE_TOTAL_BANKED_AMOUNT = 17 [(.fix.enum_value) = "BANK", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_TOTAL_BANKED_AMOUNT(17),
  /**
   * <code>POS_AMT_TYPE_TOTAL_COLLATERALIZED_AMOUNT = 18 [(.fix.enum_value) = "COLAT", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  POS_AMT_TYPE_TOTAL_COLLATERALIZED_AMOUNT(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>POS_AMT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int POS_AMT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>POS_AMT_TYPE_CASH_AMOUNT = 1 [(.fix.enum_value) = "CASH", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_CASH_AMOUNT_VALUE = 1;
  /**
   * <code>POS_AMT_TYPE_CASH_RESIDUAL_AMOUNT = 2 [(.fix.enum_value) = "CRES", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_CASH_RESIDUAL_AMOUNT_VALUE = 2;
  /**
   * <code>POS_AMT_TYPE_FINAL_MARK_TO_MARKET_AMOUNT = 3 [(.fix.enum_value) = "FMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_FINAL_MARK_TO_MARKET_AMOUNT_VALUE = 3;
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_MARK_TO_MARKET_AMOUNT = 4 [(.fix.enum_value) = "IMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_INCREMENTAL_MARK_TO_MARKET_AMOUNT_VALUE = 4;
  /**
   * <code>POS_AMT_TYPE_PREMIUM_AMOUNT = 5 [(.fix.enum_value) = "PREM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_PREMIUM_AMOUNT_VALUE = 5;
  /**
   * <code>POS_AMT_TYPE_START_OF_DAY_MARK_TO_MARKET_AMOUNT = 6 [(.fix.enum_value) = "SMTM", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_START_OF_DAY_MARK_TO_MARKET_AMOUNT_VALUE = 6;
  /**
   * <code>POS_AMT_TYPE_TRADE_VARIATION_AMOUNT = 7 [(.fix.enum_value) = "TVAR", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_TRADE_VARIATION_AMOUNT_VALUE = 7;
  /**
   * <code>POS_AMT_TYPE_VALUE_ADJUSTED_AMOUNT = 8 [(.fix.enum_value) = "VADJ", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int POS_AMT_TYPE_VALUE_ADJUSTED_AMOUNT_VALUE = 8;
  /**
   * <code>POS_AMT_TYPE_SETTLEMENT_VALUE = 9 [(.fix.enum_value) = "SETL", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 4];</code>
   */
  public static final int POS_AMT_TYPE_SETTLEMENT_VALUE_VALUE = 9;
  /**
   * <code>POS_AMT_TYPE_ACCRUED_COUPON_AMOUNT = 10 [(.fix.enum_value) = "ACPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_ACCRUED_COUPON_AMOUNT_VALUE = 10;
  /**
   * <code>POS_AMT_TYPE_COLLATERALIZED_MARK_TO_MARKET = 11 [(.fix.enum_value) = "CMTM", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_COLLATERALIZED_MARK_TO_MARKET_VALUE = 11;
  /**
   * <code>POS_AMT_TYPE_COMPENSATION_AMOUNT = 12 [(.fix.enum_value) = "DLV", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_COMPENSATION_AMOUNT_VALUE = 12;
  /**
   * <code>POS_AMT_TYPE_COUPON_AMOUNT = 13 [(.fix.enum_value) = "CPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_COUPON_AMOUNT_VALUE = 13;
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_ACCRUED_COUPON = 14 [(.fix.enum_value) = "IACPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_INCREMENTAL_ACCRUED_COUPON_VALUE = 14;
  /**
   * <code>POS_AMT_TYPE_INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET = 15 [(.fix.enum_value) = "ICMTM", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET_VALUE = 15;
  /**
   * <code>POS_AMT_TYPE_INITIAL_TRADE_COUPON_AMOUNT = 16 [(.fix.enum_value) = "ICPN", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_INITIAL_TRADE_COUPON_AMOUNT_VALUE = 16;
  /**
   * <code>POS_AMT_TYPE_TOTAL_BANKED_AMOUNT = 17 [(.fix.enum_value) = "BANK", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_TOTAL_BANKED_AMOUNT_VALUE = 17;
  /**
   * <code>POS_AMT_TYPE_TOTAL_COLLATERALIZED_AMOUNT = 18 [(.fix.enum_value) = "COLAT", (.fix.enum_added) = VERSION_FIX_5_0SP1, (.fix.enum_added_ep) = 83];</code>
   */
  public static final int POS_AMT_TYPE_TOTAL_COLLATERALIZED_AMOUNT_VALUE = 18;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PosAmtTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PosAmtTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return POS_AMT_TYPE_UNSPECIFIED;
      case 1: return POS_AMT_TYPE_CASH_AMOUNT;
      case 2: return POS_AMT_TYPE_CASH_RESIDUAL_AMOUNT;
      case 3: return POS_AMT_TYPE_FINAL_MARK_TO_MARKET_AMOUNT;
      case 4: return POS_AMT_TYPE_INCREMENTAL_MARK_TO_MARKET_AMOUNT;
      case 5: return POS_AMT_TYPE_PREMIUM_AMOUNT;
      case 6: return POS_AMT_TYPE_START_OF_DAY_MARK_TO_MARKET_AMOUNT;
      case 7: return POS_AMT_TYPE_TRADE_VARIATION_AMOUNT;
      case 8: return POS_AMT_TYPE_VALUE_ADJUSTED_AMOUNT;
      case 9: return POS_AMT_TYPE_SETTLEMENT_VALUE;
      case 10: return POS_AMT_TYPE_ACCRUED_COUPON_AMOUNT;
      case 11: return POS_AMT_TYPE_COLLATERALIZED_MARK_TO_MARKET;
      case 12: return POS_AMT_TYPE_COMPENSATION_AMOUNT;
      case 13: return POS_AMT_TYPE_COUPON_AMOUNT;
      case 14: return POS_AMT_TYPE_INCREMENTAL_ACCRUED_COUPON;
      case 15: return POS_AMT_TYPE_INCREMENTAL_COLLATERALIZED_MARK_TO_MARKET;
      case 16: return POS_AMT_TYPE_INITIAL_TRADE_COUPON_AMOUNT;
      case 17: return POS_AMT_TYPE_TOTAL_BANKED_AMOUNT;
      case 18: return POS_AMT_TYPE_TOTAL_COLLATERALIZED_AMOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PosAmtTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PosAmtTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PosAmtTypeEnum>() {
          public PosAmtTypeEnum findValueByNumber(int number) {
            return PosAmtTypeEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(59);
  }

  private static final PosAmtTypeEnum[] VALUES = values();

  public static PosAmtTypeEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PosAmtTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.PosAmtTypeEnum)
}

