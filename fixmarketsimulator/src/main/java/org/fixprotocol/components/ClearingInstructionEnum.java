// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.ClearingInstructionEnum}
 */
public enum ClearingInstructionEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CLEARING_INSTRUCTION_UNSPECIFIED = 0;</code>
   */
  CLEARING_INSTRUCTION_UNSPECIFIED(0),
  /**
   * <code>CLEARING_INSTRUCTION_AUTOMATIC_GIVE_UP_MODE = 1 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_AUTOMATIC_GIVE_UP_MODE(1),
  /**
   * <code>CLEARING_INSTRUCTION_AUTOMATIC_POSTING_MODE = 2 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_AUTOMATIC_POSTING_MODE(2),
  /**
   * <code>CLEARING_INSTRUCTION_BILATERAL_NETTING_ONLY = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_BILATERAL_NETTING_ONLY(3),
  /**
   * <code>CLEARING_INSTRUCTION_CLEAR_AGAINST_CENTRAL_COUNTERPARTY = 4 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_CLEAR_AGAINST_CENTRAL_COUNTERPARTY(4),
  /**
   * <code>CLEARING_INSTRUCTION_EXCLUDE_FROM_ALL_NETTING = 5 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_EXCLUDE_FROM_ALL_NETTING(5),
  /**
   * <code>CLEARING_INSTRUCTION_EXCLUDE_FROM_CENTRAL_COUNTERPARTY = 6 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_EXCLUDE_FROM_CENTRAL_COUNTERPARTY(6),
  /**
   * <code>CLEARING_INSTRUCTION_EX_CLEARING = 7 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_EX_CLEARING(7),
  /**
   * <code>CLEARING_INSTRUCTION_MANUAL_MODE = 8 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_MANUAL_MODE(8),
  /**
   * <code>CLEARING_INSTRUCTION_MULTILATERAL_NETTING = 9 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_MULTILATERAL_NETTING(9),
  /**
   * <code>CLEARING_INSTRUCTION_PROCESS_NORMALLY = 10 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_PROCESS_NORMALLY(10),
  /**
   * <code>CLEARING_INSTRUCTION_SPECIAL_TRADE = 11 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  CLEARING_INSTRUCTION_SPECIAL_TRADE(11),
  /**
   * <code>CLEARING_INSTRUCTION_CUSTOMER_TRADE = 12 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  CLEARING_INSTRUCTION_CUSTOMER_TRADE(12),
  /**
   * <code>CLEARING_INSTRUCTION_QUALIFIED_SERVICE_REPRESENTATIVE_QSR = 13 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  CLEARING_INSTRUCTION_QUALIFIED_SERVICE_REPRESENTATIVE_QSR(13),
  /**
   * <code>CLEARING_INSTRUCTION_SELF_CLEARING = 14 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  CLEARING_INSTRUCTION_SELF_CLEARING(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CLEARING_INSTRUCTION_UNSPECIFIED = 0;</code>
   */
  public static final int CLEARING_INSTRUCTION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CLEARING_INSTRUCTION_AUTOMATIC_GIVE_UP_MODE = 1 [(.fix.enum_value) = "10", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_AUTOMATIC_GIVE_UP_MODE_VALUE = 1;
  /**
   * <code>CLEARING_INSTRUCTION_AUTOMATIC_POSTING_MODE = 2 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_AUTOMATIC_POSTING_MODE_VALUE = 2;
  /**
   * <code>CLEARING_INSTRUCTION_BILATERAL_NETTING_ONLY = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_BILATERAL_NETTING_ONLY_VALUE = 3;
  /**
   * <code>CLEARING_INSTRUCTION_CLEAR_AGAINST_CENTRAL_COUNTERPARTY = 4 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_CLEAR_AGAINST_CENTRAL_COUNTERPARTY_VALUE = 4;
  /**
   * <code>CLEARING_INSTRUCTION_EXCLUDE_FROM_ALL_NETTING = 5 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_EXCLUDE_FROM_ALL_NETTING_VALUE = 5;
  /**
   * <code>CLEARING_INSTRUCTION_EXCLUDE_FROM_CENTRAL_COUNTERPARTY = 6 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_EXCLUDE_FROM_CENTRAL_COUNTERPARTY_VALUE = 6;
  /**
   * <code>CLEARING_INSTRUCTION_EX_CLEARING = 7 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_EX_CLEARING_VALUE = 7;
  /**
   * <code>CLEARING_INSTRUCTION_MANUAL_MODE = 8 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_MANUAL_MODE_VALUE = 8;
  /**
   * <code>CLEARING_INSTRUCTION_MULTILATERAL_NETTING = 9 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_MULTILATERAL_NETTING_VALUE = 9;
  /**
   * <code>CLEARING_INSTRUCTION_PROCESS_NORMALLY = 10 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_PROCESS_NORMALLY_VALUE = 10;
  /**
   * <code>CLEARING_INSTRUCTION_SPECIAL_TRADE = 11 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int CLEARING_INSTRUCTION_SPECIAL_TRADE_VALUE = 11;
  /**
   * <code>CLEARING_INSTRUCTION_CUSTOMER_TRADE = 12 [(.fix.enum_value) = "12", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int CLEARING_INSTRUCTION_CUSTOMER_TRADE_VALUE = 12;
  /**
   * <code>CLEARING_INSTRUCTION_QUALIFIED_SERVICE_REPRESENTATIVE_QSR = 13 [(.fix.enum_value) = "11", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int CLEARING_INSTRUCTION_QUALIFIED_SERVICE_REPRESENTATIVE_QSR_VALUE = 13;
  /**
   * <code>CLEARING_INSTRUCTION_SELF_CLEARING = 14 [(.fix.enum_value) = "13", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int CLEARING_INSTRUCTION_SELF_CLEARING_VALUE = 14;


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
  public static ClearingInstructionEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClearingInstructionEnum forNumber(int value) {
    switch (value) {
      case 0: return CLEARING_INSTRUCTION_UNSPECIFIED;
      case 1: return CLEARING_INSTRUCTION_AUTOMATIC_GIVE_UP_MODE;
      case 2: return CLEARING_INSTRUCTION_AUTOMATIC_POSTING_MODE;
      case 3: return CLEARING_INSTRUCTION_BILATERAL_NETTING_ONLY;
      case 4: return CLEARING_INSTRUCTION_CLEAR_AGAINST_CENTRAL_COUNTERPARTY;
      case 5: return CLEARING_INSTRUCTION_EXCLUDE_FROM_ALL_NETTING;
      case 6: return CLEARING_INSTRUCTION_EXCLUDE_FROM_CENTRAL_COUNTERPARTY;
      case 7: return CLEARING_INSTRUCTION_EX_CLEARING;
      case 8: return CLEARING_INSTRUCTION_MANUAL_MODE;
      case 9: return CLEARING_INSTRUCTION_MULTILATERAL_NETTING;
      case 10: return CLEARING_INSTRUCTION_PROCESS_NORMALLY;
      case 11: return CLEARING_INSTRUCTION_SPECIAL_TRADE;
      case 12: return CLEARING_INSTRUCTION_CUSTOMER_TRADE;
      case 13: return CLEARING_INSTRUCTION_QUALIFIED_SERVICE_REPRESENTATIVE_QSR;
      case 14: return CLEARING_INSTRUCTION_SELF_CLEARING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClearingInstructionEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClearingInstructionEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClearingInstructionEnum>() {
          public ClearingInstructionEnum findValueByNumber(int number) {
            return ClearingInstructionEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(96);
  }

  private static final ClearingInstructionEnum[] VALUES = values();

  public static ClearingInstructionEnum valueOf(
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

  private ClearingInstructionEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.ClearingInstructionEnum)
}

