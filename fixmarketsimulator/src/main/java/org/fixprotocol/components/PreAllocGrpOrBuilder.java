// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface PreAllocGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.PreAllocGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string alloc_account = 1 [(.fix.tag) = 79, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The allocAccount.
   */
  java.lang.String getAllocAccount();
  /**
   * <code>string alloc_account = 1 [(.fix.tag) = 79, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for allocAccount.
   */
  com.google.protobuf.ByteString
      getAllocAccountBytes();

  /**
   * <code>.Common.AllocAcctIDSourceEnum alloc_acct_id_source = 2 [(.fix.tag) = 661, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for allocAcctIdSource.
   */
  int getAllocAcctIdSourceValue();
  /**
   * <code>.Common.AllocAcctIDSourceEnum alloc_acct_id_source = 2 [(.fix.tag) = 661, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The allocAcctIdSource.
   */
  org.fixprotocol.components.AllocAcctIDSourceEnum getAllocAcctIdSource();

  /**
   * <code>.fix.Decimal64 alloc_qty = 3 [(.fix.tag) = 80, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the allocQty field is set.
   */
  boolean hasAllocQty();
  /**
   * <code>.fix.Decimal64 alloc_qty = 3 [(.fix.tag) = 80, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The allocQty.
   */
  org.fixprotocol.components.Fix.Decimal64 getAllocQty();
  /**
   * <code>.fix.Decimal64 alloc_qty = 3 [(.fix.tag) = 80, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getAllocQtyOrBuilder();

  /**
   * <code>string alloc_settl_currency = 4 [(.fix.tag) = 736, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The allocSettlCurrency.
   */
  java.lang.String getAllocSettlCurrency();
  /**
   * <code>string alloc_settl_currency = 4 [(.fix.tag) = 736, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for allocSettlCurrency.
   */
  com.google.protobuf.ByteString
      getAllocSettlCurrencyBytes();

  /**
   * <code>string individual_alloc_id = 5 [(.fix.tag) = 467, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The individualAllocId.
   */
  java.lang.String getIndividualAllocId();
  /**
   * <code>string individual_alloc_id = 5 [(.fix.tag) = 467, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for individualAllocId.
   */
  com.google.protobuf.ByteString
      getIndividualAllocIdBytes();

  /**
   * <code>repeated .Common.NestedParties nested_parties = 6 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.NestedParties> 
      getNestedPartiesList();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 6 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedParties getNestedParties(int index);
  /**
   * <code>repeated .Common.NestedParties nested_parties = 6 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getNestedPartiesCount();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 6 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.NestedPartiesOrBuilder> 
      getNestedPartiesOrBuilderList();
  /**
   * <code>repeated .Common.NestedParties nested_parties = 6 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NestedPartiesOrBuilder getNestedPartiesOrBuilder(
      int index);
}