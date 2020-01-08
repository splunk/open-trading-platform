// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.TimeInForceRules}
 */
public  final class TimeInForceRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.TimeInForceRules)
    TimeInForceRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeInForceRules.newBuilder() to construct.
  private TimeInForceRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeInForceRules() {
    timeInForce_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeInForceRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TimeInForceRules(
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

            timeInForce_ = rawValue;
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
    return org.fixprotocol.components.Common.internal_static_Common_TimeInForceRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_TimeInForceRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.TimeInForceRules.class, org.fixprotocol.components.TimeInForceRules.Builder.class);
  }

  public static final int TIME_IN_FORCE_FIELD_NUMBER = 1;
  private int timeInForce_;
  /**
   * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for timeInForce.
   */
  public int getTimeInForceValue() {
    return timeInForce_;
  }
  /**
   * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The timeInForce.
   */
  public org.fixprotocol.components.TimeInForceEnum getTimeInForce() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.TimeInForceEnum result = org.fixprotocol.components.TimeInForceEnum.valueOf(timeInForce_);
    return result == null ? org.fixprotocol.components.TimeInForceEnum.UNRECOGNIZED : result;
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
    if (timeInForce_ != org.fixprotocol.components.TimeInForceEnum.TIME_IN_FORCE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, timeInForce_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeInForce_ != org.fixprotocol.components.TimeInForceEnum.TIME_IN_FORCE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, timeInForce_);
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
    if (!(obj instanceof org.fixprotocol.components.TimeInForceRules)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.TimeInForceRules other = (org.fixprotocol.components.TimeInForceRules) obj;

    if (timeInForce_ != other.timeInForce_) return false;
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
    hash = (37 * hash) + TIME_IN_FORCE_FIELD_NUMBER;
    hash = (53 * hash) + timeInForce_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.TimeInForceRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TimeInForceRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.TimeInForceRules parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.TimeInForceRules prototype) {
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
   * Protobuf type {@code Common.TimeInForceRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.TimeInForceRules)
      org.fixprotocol.components.TimeInForceRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_TimeInForceRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_TimeInForceRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.TimeInForceRules.class, org.fixprotocol.components.TimeInForceRules.Builder.class);
    }

    // Construct using org.fixprotocol.components.TimeInForceRules.newBuilder()
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
      timeInForce_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_TimeInForceRules_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.TimeInForceRules getDefaultInstanceForType() {
      return org.fixprotocol.components.TimeInForceRules.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.TimeInForceRules build() {
      org.fixprotocol.components.TimeInForceRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.TimeInForceRules buildPartial() {
      org.fixprotocol.components.TimeInForceRules result = new org.fixprotocol.components.TimeInForceRules(this);
      result.timeInForce_ = timeInForce_;
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
      if (other instanceof org.fixprotocol.components.TimeInForceRules) {
        return mergeFrom((org.fixprotocol.components.TimeInForceRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.TimeInForceRules other) {
      if (other == org.fixprotocol.components.TimeInForceRules.getDefaultInstance()) return this;
      if (other.timeInForce_ != 0) {
        setTimeInForceValue(other.getTimeInForceValue());
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
      org.fixprotocol.components.TimeInForceRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.TimeInForceRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int timeInForce_ = 0;
    /**
     * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The enum numeric value on the wire for timeInForce.
     */
    public int getTimeInForceValue() {
      return timeInForce_;
    }
    /**
     * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The enum numeric value on the wire for timeInForce to set.
     * @return This builder for chaining.
     */
    public Builder setTimeInForceValue(int value) {
      timeInForce_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The timeInForce.
     */
    public org.fixprotocol.components.TimeInForceEnum getTimeInForce() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.TimeInForceEnum result = org.fixprotocol.components.TimeInForceEnum.valueOf(timeInForce_);
      return result == null ? org.fixprotocol.components.TimeInForceEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The timeInForce to set.
     * @return This builder for chaining.
     */
    public Builder setTimeInForce(org.fixprotocol.components.TimeInForceEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      timeInForce_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.TimeInForceEnum time_in_force = 1 [(.fix.tag) = 59, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeInForce() {
      
      timeInForce_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Common.TimeInForceRules)
  }

  // @@protoc_insertion_point(class_scope:Common.TimeInForceRules)
  private static final org.fixprotocol.components.TimeInForceRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.TimeInForceRules();
  }

  public static org.fixprotocol.components.TimeInForceRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeInForceRules>
      PARSER = new com.google.protobuf.AbstractParser<TimeInForceRules>() {
    @java.lang.Override
    public TimeInForceRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TimeInForceRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TimeInForceRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeInForceRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.TimeInForceRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

