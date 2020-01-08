// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.InstrumentExtension}
 */
public  final class InstrumentExtension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.InstrumentExtension)
    InstrumentExtensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstrumentExtension.newBuilder() to construct.
  private InstrumentExtension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstrumentExtension() {
    attrbGrp_ = java.util.Collections.emptyList();
    deliveryForm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InstrumentExtension();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstrumentExtension(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attrbGrp_ = new java.util.ArrayList<org.fixprotocol.components.AttrbGrp>();
              mutable_bitField0_ |= 0x00000001;
            }
            attrbGrp_.add(
                input.readMessage(org.fixprotocol.components.AttrbGrp.parser(), extensionRegistry));
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            deliveryForm_ = rawValue;
            break;
          }
          case 26: {
            org.fixprotocol.components.Fix.Decimal64.Builder subBuilder = null;
            if (pctAtRisk_ != null) {
              subBuilder = pctAtRisk_.toBuilder();
            }
            pctAtRisk_ = input.readMessage(org.fixprotocol.components.Fix.Decimal64.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pctAtRisk_);
              pctAtRisk_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attrbGrp_ = java.util.Collections.unmodifiableList(attrbGrp_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.internal_static_Common_InstrumentExtension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_InstrumentExtension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.InstrumentExtension.class, org.fixprotocol.components.InstrumentExtension.Builder.class);
  }

  public static final int ATTRB_GRP_FIELD_NUMBER = 1;
  private java.util.List<org.fixprotocol.components.AttrbGrp> attrbGrp_;
  /**
   * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.util.List<org.fixprotocol.components.AttrbGrp> getAttrbGrpList() {
    return attrbGrp_;
  }
  /**
   * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public java.util.List<? extends org.fixprotocol.components.AttrbGrpOrBuilder> 
      getAttrbGrpOrBuilderList() {
    return attrbGrp_;
  }
  /**
   * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public int getAttrbGrpCount() {
    return attrbGrp_.size();
  }
  /**
   * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public org.fixprotocol.components.AttrbGrp getAttrbGrp(int index) {
    return attrbGrp_.get(index);
  }
  /**
   * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public org.fixprotocol.components.AttrbGrpOrBuilder getAttrbGrpOrBuilder(
      int index) {
    return attrbGrp_.get(index);
  }

  public static final int DELIVERY_FORM_FIELD_NUMBER = 2;
  private int deliveryForm_;
  /**
   * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for deliveryForm.
   */
  public int getDeliveryFormValue() {
    return deliveryForm_;
  }
  /**
   * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The deliveryForm.
   */
  public org.fixprotocol.components.DeliveryFormEnum getDeliveryForm() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.DeliveryFormEnum result = org.fixprotocol.components.DeliveryFormEnum.valueOf(deliveryForm_);
    return result == null ? org.fixprotocol.components.DeliveryFormEnum.UNRECOGNIZED : result;
  }

  public static final int PCT_AT_RISK_FIELD_NUMBER = 3;
  private org.fixprotocol.components.Fix.Decimal64 pctAtRisk_;
  /**
   * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the pctAtRisk field is set.
   */
  public boolean hasPctAtRisk() {
    return pctAtRisk_ != null;
  }
  /**
   * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The pctAtRisk.
   */
  public org.fixprotocol.components.Fix.Decimal64 getPctAtRisk() {
    return pctAtRisk_ == null ? org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : pctAtRisk_;
  }
  /**
   * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  public org.fixprotocol.components.Fix.Decimal64OrBuilder getPctAtRiskOrBuilder() {
    return getPctAtRisk();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < attrbGrp_.size(); i++) {
      output.writeMessage(1, attrbGrp_.get(i));
    }
    if (deliveryForm_ != org.fixprotocol.components.DeliveryFormEnum.DELIVERY_FORM_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, deliveryForm_);
    }
    if (pctAtRisk_ != null) {
      output.writeMessage(3, getPctAtRisk());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attrbGrp_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attrbGrp_.get(i));
    }
    if (deliveryForm_ != org.fixprotocol.components.DeliveryFormEnum.DELIVERY_FORM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, deliveryForm_);
    }
    if (pctAtRisk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPctAtRisk());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.fixprotocol.components.InstrumentExtension)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.InstrumentExtension other = (org.fixprotocol.components.InstrumentExtension) obj;

    if (!getAttrbGrpList()
        .equals(other.getAttrbGrpList())) return false;
    if (deliveryForm_ != other.deliveryForm_) return false;
    if (hasPctAtRisk() != other.hasPctAtRisk()) return false;
    if (hasPctAtRisk()) {
      if (!getPctAtRisk()
          .equals(other.getPctAtRisk())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAttrbGrpCount() > 0) {
      hash = (37 * hash) + ATTRB_GRP_FIELD_NUMBER;
      hash = (53 * hash) + getAttrbGrpList().hashCode();
    }
    hash = (37 * hash) + DELIVERY_FORM_FIELD_NUMBER;
    hash = (53 * hash) + deliveryForm_;
    if (hasPctAtRisk()) {
      hash = (37 * hash) + PCT_AT_RISK_FIELD_NUMBER;
      hash = (53 * hash) + getPctAtRisk().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.InstrumentExtension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.InstrumentExtension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.InstrumentExtension parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.fixprotocol.components.InstrumentExtension prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Common.InstrumentExtension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.InstrumentExtension)
      org.fixprotocol.components.InstrumentExtensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_InstrumentExtension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_InstrumentExtension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.InstrumentExtension.class, org.fixprotocol.components.InstrumentExtension.Builder.class);
    }

    // Construct using org.fixprotocol.components.InstrumentExtension.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAttrbGrpFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attrbGrpBuilder_ == null) {
        attrbGrp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attrbGrpBuilder_.clear();
      }
      deliveryForm_ = 0;

      if (pctAtRiskBuilder_ == null) {
        pctAtRisk_ = null;
      } else {
        pctAtRisk_ = null;
        pctAtRiskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_InstrumentExtension_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.InstrumentExtension getDefaultInstanceForType() {
      return org.fixprotocol.components.InstrumentExtension.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.InstrumentExtension build() {
      org.fixprotocol.components.InstrumentExtension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.InstrumentExtension buildPartial() {
      org.fixprotocol.components.InstrumentExtension result = new org.fixprotocol.components.InstrumentExtension(this);
      int from_bitField0_ = bitField0_;
      if (attrbGrpBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attrbGrp_ = java.util.Collections.unmodifiableList(attrbGrp_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attrbGrp_ = attrbGrp_;
      } else {
        result.attrbGrp_ = attrbGrpBuilder_.build();
      }
      result.deliveryForm_ = deliveryForm_;
      if (pctAtRiskBuilder_ == null) {
        result.pctAtRisk_ = pctAtRisk_;
      } else {
        result.pctAtRisk_ = pctAtRiskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.fixprotocol.components.InstrumentExtension) {
        return mergeFrom((org.fixprotocol.components.InstrumentExtension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.InstrumentExtension other) {
      if (other == org.fixprotocol.components.InstrumentExtension.getDefaultInstance()) return this;
      if (attrbGrpBuilder_ == null) {
        if (!other.attrbGrp_.isEmpty()) {
          if (attrbGrp_.isEmpty()) {
            attrbGrp_ = other.attrbGrp_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttrbGrpIsMutable();
            attrbGrp_.addAll(other.attrbGrp_);
          }
          onChanged();
        }
      } else {
        if (!other.attrbGrp_.isEmpty()) {
          if (attrbGrpBuilder_.isEmpty()) {
            attrbGrpBuilder_.dispose();
            attrbGrpBuilder_ = null;
            attrbGrp_ = other.attrbGrp_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attrbGrpBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttrbGrpFieldBuilder() : null;
          } else {
            attrbGrpBuilder_.addAllMessages(other.attrbGrp_);
          }
        }
      }
      if (other.deliveryForm_ != 0) {
        setDeliveryFormValue(other.getDeliveryFormValue());
      }
      if (other.hasPctAtRisk()) {
        mergePctAtRisk(other.getPctAtRisk());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.fixprotocol.components.InstrumentExtension parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.InstrumentExtension) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.fixprotocol.components.AttrbGrp> attrbGrp_ =
      java.util.Collections.emptyList();
    private void ensureAttrbGrpIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attrbGrp_ = new java.util.ArrayList<org.fixprotocol.components.AttrbGrp>(attrbGrp_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.fixprotocol.components.AttrbGrp, org.fixprotocol.components.AttrbGrp.Builder, org.fixprotocol.components.AttrbGrpOrBuilder> attrbGrpBuilder_;

    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.util.List<org.fixprotocol.components.AttrbGrp> getAttrbGrpList() {
      if (attrbGrpBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attrbGrp_);
      } else {
        return attrbGrpBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public int getAttrbGrpCount() {
      if (attrbGrpBuilder_ == null) {
        return attrbGrp_.size();
      } else {
        return attrbGrpBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.AttrbGrp getAttrbGrp(int index) {
      if (attrbGrpBuilder_ == null) {
        return attrbGrp_.get(index);
      } else {
        return attrbGrpBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setAttrbGrp(
        int index, org.fixprotocol.components.AttrbGrp value) {
      if (attrbGrpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttrbGrpIsMutable();
        attrbGrp_.set(index, value);
        onChanged();
      } else {
        attrbGrpBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setAttrbGrp(
        int index, org.fixprotocol.components.AttrbGrp.Builder builderForValue) {
      if (attrbGrpBuilder_ == null) {
        ensureAttrbGrpIsMutable();
        attrbGrp_.set(index, builderForValue.build());
        onChanged();
      } else {
        attrbGrpBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder addAttrbGrp(org.fixprotocol.components.AttrbGrp value) {
      if (attrbGrpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttrbGrpIsMutable();
        attrbGrp_.add(value);
        onChanged();
      } else {
        attrbGrpBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder addAttrbGrp(
        int index, org.fixprotocol.components.AttrbGrp value) {
      if (attrbGrpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttrbGrpIsMutable();
        attrbGrp_.add(index, value);
        onChanged();
      } else {
        attrbGrpBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder addAttrbGrp(
        org.fixprotocol.components.AttrbGrp.Builder builderForValue) {
      if (attrbGrpBuilder_ == null) {
        ensureAttrbGrpIsMutable();
        attrbGrp_.add(builderForValue.build());
        onChanged();
      } else {
        attrbGrpBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder addAttrbGrp(
        int index, org.fixprotocol.components.AttrbGrp.Builder builderForValue) {
      if (attrbGrpBuilder_ == null) {
        ensureAttrbGrpIsMutable();
        attrbGrp_.add(index, builderForValue.build());
        onChanged();
      } else {
        attrbGrpBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder addAllAttrbGrp(
        java.lang.Iterable<? extends org.fixprotocol.components.AttrbGrp> values) {
      if (attrbGrpBuilder_ == null) {
        ensureAttrbGrpIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attrbGrp_);
        onChanged();
      } else {
        attrbGrpBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearAttrbGrp() {
      if (attrbGrpBuilder_ == null) {
        attrbGrp_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attrbGrpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder removeAttrbGrp(int index) {
      if (attrbGrpBuilder_ == null) {
        ensureAttrbGrpIsMutable();
        attrbGrp_.remove(index);
        onChanged();
      } else {
        attrbGrpBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.AttrbGrp.Builder getAttrbGrpBuilder(
        int index) {
      return getAttrbGrpFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.AttrbGrpOrBuilder getAttrbGrpOrBuilder(
        int index) {
      if (attrbGrpBuilder_ == null) {
        return attrbGrp_.get(index);  } else {
        return attrbGrpBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.util.List<? extends org.fixprotocol.components.AttrbGrpOrBuilder> 
         getAttrbGrpOrBuilderList() {
      if (attrbGrpBuilder_ != null) {
        return attrbGrpBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attrbGrp_);
      }
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.AttrbGrp.Builder addAttrbGrpBuilder() {
      return getAttrbGrpFieldBuilder().addBuilder(
          org.fixprotocol.components.AttrbGrp.getDefaultInstance());
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.AttrbGrp.Builder addAttrbGrpBuilder(
        int index) {
      return getAttrbGrpFieldBuilder().addBuilder(
          index, org.fixprotocol.components.AttrbGrp.getDefaultInstance());
    }
    /**
     * <code>repeated .Common.AttrbGrp attrb_grp = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public java.util.List<org.fixprotocol.components.AttrbGrp.Builder> 
         getAttrbGrpBuilderList() {
      return getAttrbGrpFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.fixprotocol.components.AttrbGrp, org.fixprotocol.components.AttrbGrp.Builder, org.fixprotocol.components.AttrbGrpOrBuilder> 
        getAttrbGrpFieldBuilder() {
      if (attrbGrpBuilder_ == null) {
        attrbGrpBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.fixprotocol.components.AttrbGrp, org.fixprotocol.components.AttrbGrp.Builder, org.fixprotocol.components.AttrbGrpOrBuilder>(
                attrbGrp_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attrbGrp_ = null;
      }
      return attrbGrpBuilder_;
    }

    private int deliveryForm_ = 0;
    /**
     * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The enum numeric value on the wire for deliveryForm.
     */
    public int getDeliveryFormValue() {
      return deliveryForm_;
    }
    /**
     * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The enum numeric value on the wire for deliveryForm to set.
     * @return This builder for chaining.
     */
    public Builder setDeliveryFormValue(int value) {
      deliveryForm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The deliveryForm.
     */
    public org.fixprotocol.components.DeliveryFormEnum getDeliveryForm() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.DeliveryFormEnum result = org.fixprotocol.components.DeliveryFormEnum.valueOf(deliveryForm_);
      return result == null ? org.fixprotocol.components.DeliveryFormEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @param value The deliveryForm to set.
     * @return This builder for chaining.
     */
    public Builder setDeliveryForm(org.fixprotocol.components.DeliveryFormEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      deliveryForm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DeliveryFormEnum delivery_form = 2 [(.fix.tag) = 668, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeliveryForm() {
      
      deliveryForm_ = 0;
      onChanged();
      return this;
    }

    private org.fixprotocol.components.Fix.Decimal64 pctAtRisk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder> pctAtRiskBuilder_;
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return Whether the pctAtRisk field is set.
     */
    public boolean hasPctAtRisk() {
      return pctAtRiskBuilder_ != null || pctAtRisk_ != null;
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     * @return The pctAtRisk.
     */
    public org.fixprotocol.components.Fix.Decimal64 getPctAtRisk() {
      if (pctAtRiskBuilder_ == null) {
        return pctAtRisk_ == null ? org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : pctAtRisk_;
      } else {
        return pctAtRiskBuilder_.getMessage();
      }
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setPctAtRisk(org.fixprotocol.components.Fix.Decimal64 value) {
      if (pctAtRiskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pctAtRisk_ = value;
        onChanged();
      } else {
        pctAtRiskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder setPctAtRisk(
        org.fixprotocol.components.Fix.Decimal64.Builder builderForValue) {
      if (pctAtRiskBuilder_ == null) {
        pctAtRisk_ = builderForValue.build();
        onChanged();
      } else {
        pctAtRiskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder mergePctAtRisk(org.fixprotocol.components.Fix.Decimal64 value) {
      if (pctAtRiskBuilder_ == null) {
        if (pctAtRisk_ != null) {
          pctAtRisk_ =
            org.fixprotocol.components.Fix.Decimal64.newBuilder(pctAtRisk_).mergeFrom(value).buildPartial();
        } else {
          pctAtRisk_ = value;
        }
        onChanged();
      } else {
        pctAtRiskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public Builder clearPctAtRisk() {
      if (pctAtRiskBuilder_ == null) {
        pctAtRisk_ = null;
        onChanged();
      } else {
        pctAtRisk_ = null;
        pctAtRiskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.Fix.Decimal64.Builder getPctAtRiskBuilder() {
      
      onChanged();
      return getPctAtRiskFieldBuilder().getBuilder();
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    public org.fixprotocol.components.Fix.Decimal64OrBuilder getPctAtRiskOrBuilder() {
      if (pctAtRiskBuilder_ != null) {
        return pctAtRiskBuilder_.getMessageOrBuilder();
      } else {
        return pctAtRisk_ == null ?
            org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : pctAtRisk_;
      }
    }
    /**
     * <code>.fix.Decimal64 pct_at_risk = 3 [(.fix.tag) = 869, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_4_4];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder> 
        getPctAtRiskFieldBuilder() {
      if (pctAtRiskBuilder_ == null) {
        pctAtRiskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder>(
                getPctAtRisk(),
                getParentForChildren(),
                isClean());
        pctAtRisk_ = null;
      }
      return pctAtRiskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Common.InstrumentExtension)
  }

  // @@protoc_insertion_point(class_scope:Common.InstrumentExtension)
  private static final org.fixprotocol.components.InstrumentExtension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.InstrumentExtension();
  }

  public static org.fixprotocol.components.InstrumentExtension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstrumentExtension>
      PARSER = new com.google.protobuf.AbstractParser<InstrumentExtension>() {
    @java.lang.Override
    public InstrumentExtension parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstrumentExtension(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstrumentExtension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstrumentExtension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.InstrumentExtension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

