// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface DerivativeInstrumentPartySubIDsGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.DerivativeInstrumentPartySubIDsGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The derivativeInstrumentPartySubId.
   */
  java.lang.String getDerivativeInstrumentPartySubId();
  /**
   * <code>string derivative_instrument_party_sub_id = 1 [(.fix.tag) = 1297, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for derivativeInstrumentPartySubId.
   */
  com.google.protobuf.ByteString
      getDerivativeInstrumentPartySubIdBytes();

  /**
   * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for derivativeInstrumentPartySubIdType.
   */
  int getDerivativeInstrumentPartySubIdTypeValue();
  /**
   * <code>.Common.DerivativeInstrumentPartySubIDTypeEnum derivative_instrument_party_sub_id_type = 2 [(.fix.tag) = 1298, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The derivativeInstrumentPartySubIdType.
   */
  org.fixprotocol.components.DerivativeInstrumentPartySubIDTypeEnum getDerivativeInstrumentPartySubIdType();
}
