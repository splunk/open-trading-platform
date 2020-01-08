// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.DerivativeInstrumentAttribute}
 */
public  final class DerivativeInstrumentAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.DerivativeInstrumentAttribute)
    DerivativeInstrumentAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DerivativeInstrumentAttribute.newBuilder() to construct.
  private DerivativeInstrumentAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DerivativeInstrumentAttribute() {
    derivativeInstrAttribType_ = 0;
    derivativeInstrAttribValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DerivativeInstrumentAttribute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DerivativeInstrumentAttribute(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            derivativeInstrAttribType_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            derivativeInstrAttribValue_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.DerivativeInstrumentAttribute.class, org.fixprotocol.components.DerivativeInstrumentAttribute.Builder.class);
  }

  public static final int DERIVATIVE_INSTR_ATTRIB_TYPE_FIELD_NUMBER = 1;
  private int derivativeInstrAttribType_;
  /**
   * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for derivativeInstrAttribType.
   */
  public int getDerivativeInstrAttribTypeValue() {
    return derivativeInstrAttribType_;
  }
  /**
   * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The derivativeInstrAttribType.
   */
  public org.fixprotocol.components.DerivativeInstrAttribTypeEnum getDerivativeInstrAttribType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.DerivativeInstrAttribTypeEnum result = org.fixprotocol.components.DerivativeInstrAttribTypeEnum.valueOf(derivativeInstrAttribType_);
    return result == null ? org.fixprotocol.components.DerivativeInstrAttribTypeEnum.UNRECOGNIZED : result;
  }

  public static final int DERIVATIVE_INSTR_ATTRIB_VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object derivativeInstrAttribValue_;
  /**
   * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The derivativeInstrAttribValue.
   */
  public java.lang.String getDerivativeInstrAttribValue() {
    java.lang.Object ref = derivativeInstrAttribValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      derivativeInstrAttribValue_ = s;
      return s;
    }
  }
  /**
   * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for derivativeInstrAttribValue.
   */
  public com.google.protobuf.ByteString
      getDerivativeInstrAttribValueBytes() {
    java.lang.Object ref = derivativeInstrAttribValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      derivativeInstrAttribValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (derivativeInstrAttribType_ != org.fixprotocol.components.DerivativeInstrAttribTypeEnum.DERIVATIVE_INSTR_ATTRIB_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, derivativeInstrAttribType_);
    }
    if (!getDerivativeInstrAttribValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, derivativeInstrAttribValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (derivativeInstrAttribType_ != org.fixprotocol.components.DerivativeInstrAttribTypeEnum.DERIVATIVE_INSTR_ATTRIB_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, derivativeInstrAttribType_);
    }
    if (!getDerivativeInstrAttribValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, derivativeInstrAttribValue_);
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
    if (!(obj instanceof org.fixprotocol.components.DerivativeInstrumentAttribute)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.DerivativeInstrumentAttribute other = (org.fixprotocol.components.DerivativeInstrumentAttribute) obj;

    if (derivativeInstrAttribType_ != other.derivativeInstrAttribType_) return false;
    if (!getDerivativeInstrAttribValue()
        .equals(other.getDerivativeInstrAttribValue())) return false;
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
    hash = (37 * hash) + DERIVATIVE_INSTR_ATTRIB_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + derivativeInstrAttribType_;
    hash = (37 * hash) + DERIVATIVE_INSTR_ATTRIB_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getDerivativeInstrAttribValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.DerivativeInstrumentAttribute parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.DerivativeInstrumentAttribute prototype) {
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
   * Protobuf type {@code Common.DerivativeInstrumentAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.DerivativeInstrumentAttribute)
      org.fixprotocol.components.DerivativeInstrumentAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.DerivativeInstrumentAttribute.class, org.fixprotocol.components.DerivativeInstrumentAttribute.Builder.class);
    }

    // Construct using org.fixprotocol.components.DerivativeInstrumentAttribute.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      derivativeInstrAttribType_ = 0;

      derivativeInstrAttribValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_DerivativeInstrumentAttribute_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentAttribute getDefaultInstanceForType() {
      return org.fixprotocol.components.DerivativeInstrumentAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentAttribute build() {
      org.fixprotocol.components.DerivativeInstrumentAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.DerivativeInstrumentAttribute buildPartial() {
      org.fixprotocol.components.DerivativeInstrumentAttribute result = new org.fixprotocol.components.DerivativeInstrumentAttribute(this);
      result.derivativeInstrAttribType_ = derivativeInstrAttribType_;
      result.derivativeInstrAttribValue_ = derivativeInstrAttribValue_;
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
      if (other instanceof org.fixprotocol.components.DerivativeInstrumentAttribute) {
        return mergeFrom((org.fixprotocol.components.DerivativeInstrumentAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.DerivativeInstrumentAttribute other) {
      if (other == org.fixprotocol.components.DerivativeInstrumentAttribute.getDefaultInstance()) return this;
      if (other.derivativeInstrAttribType_ != 0) {
        setDerivativeInstrAttribTypeValue(other.getDerivativeInstrAttribTypeValue());
      }
      if (!other.getDerivativeInstrAttribValue().isEmpty()) {
        derivativeInstrAttribValue_ = other.derivativeInstrAttribValue_;
        onChanged();
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
      org.fixprotocol.components.DerivativeInstrumentAttribute parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.DerivativeInstrumentAttribute) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int derivativeInstrAttribType_ = 0;
    /**
     * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The enum numeric value on the wire for derivativeInstrAttribType.
     */
    public int getDerivativeInstrAttribTypeValue() {
      return derivativeInstrAttribType_;
    }
    /**
     * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The enum numeric value on the wire for derivativeInstrAttribType to set.
     * @return This builder for chaining.
     */
    public Builder setDerivativeInstrAttribTypeValue(int value) {
      derivativeInstrAttribType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The derivativeInstrAttribType.
     */
    public org.fixprotocol.components.DerivativeInstrAttribTypeEnum getDerivativeInstrAttribType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.DerivativeInstrAttribTypeEnum result = org.fixprotocol.components.DerivativeInstrAttribTypeEnum.valueOf(derivativeInstrAttribType_);
      return result == null ? org.fixprotocol.components.DerivativeInstrAttribTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The derivativeInstrAttribType to set.
     * @return This builder for chaining.
     */
    public Builder setDerivativeInstrAttribType(org.fixprotocol.components.DerivativeInstrAttribTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      derivativeInstrAttribType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.DerivativeInstrAttribTypeEnum derivative_instr_attrib_type = 1 [(.fix.tag) = 1313, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return This builder for chaining.
     */
    public Builder clearDerivativeInstrAttribType() {
      
      derivativeInstrAttribType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object derivativeInstrAttribValue_ = "";
    /**
     * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The derivativeInstrAttribValue.
     */
    public java.lang.String getDerivativeInstrAttribValue() {
      java.lang.Object ref = derivativeInstrAttribValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        derivativeInstrAttribValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The bytes for derivativeInstrAttribValue.
     */
    public com.google.protobuf.ByteString
        getDerivativeInstrAttribValueBytes() {
      java.lang.Object ref = derivativeInstrAttribValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        derivativeInstrAttribValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The derivativeInstrAttribValue to set.
     * @return This builder for chaining.
     */
    public Builder setDerivativeInstrAttribValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      derivativeInstrAttribValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return This builder for chaining.
     */
    public Builder clearDerivativeInstrAttribValue() {
      
      derivativeInstrAttribValue_ = getDefaultInstance().getDerivativeInstrAttribValue();
      onChanged();
      return this;
    }
    /**
     * <code>string derivative_instr_attrib_value = 2 [(.fix.tag) = 1314, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The bytes for derivativeInstrAttribValue to set.
     * @return This builder for chaining.
     */
    public Builder setDerivativeInstrAttribValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      derivativeInstrAttribValue_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Common.DerivativeInstrumentAttribute)
  }

  // @@protoc_insertion_point(class_scope:Common.DerivativeInstrumentAttribute)
  private static final org.fixprotocol.components.DerivativeInstrumentAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.DerivativeInstrumentAttribute();
  }

  public static org.fixprotocol.components.DerivativeInstrumentAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DerivativeInstrumentAttribute>
      PARSER = new com.google.protobuf.AbstractParser<DerivativeInstrumentAttribute>() {
    @java.lang.Override
    public DerivativeInstrumentAttribute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DerivativeInstrumentAttribute(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DerivativeInstrumentAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DerivativeInstrumentAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.DerivativeInstrumentAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

