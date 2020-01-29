// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface ContAmtGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.ContAmtGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cont_amt_curr = 1 [(.fix.tag) = 521, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The contAmtCurr.
   */
  java.lang.String getContAmtCurr();
  /**
   * <code>string cont_amt_curr = 1 [(.fix.tag) = 521, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for contAmtCurr.
   */
  com.google.protobuf.ByteString
      getContAmtCurrBytes();

  /**
   * <code>.Common.ContAmtTypeEnum cont_amt_type = 2 [(.fix.tag) = 519, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for contAmtType.
   */
  int getContAmtTypeValue();
  /**
   * <code>.Common.ContAmtTypeEnum cont_amt_type = 2 [(.fix.tag) = 519, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The contAmtType.
   */
  org.fixprotocol.components.ContAmtTypeEnum getContAmtType();

  /**
   * <code>.fix.Decimal64 cont_amt_value = 3 [(.fix.tag) = 520, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the contAmtValue field is set.
   */
  boolean hasContAmtValue();
  /**
   * <code>.fix.Decimal64 cont_amt_value = 3 [(.fix.tag) = 520, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The contAmtValue.
   */
  org.fixprotocol.components.Fix.Decimal64 getContAmtValue();
  /**
   * <code>.fix.Decimal64 cont_amt_value = 3 [(.fix.tag) = 520, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getContAmtValueOrBuilder();
}