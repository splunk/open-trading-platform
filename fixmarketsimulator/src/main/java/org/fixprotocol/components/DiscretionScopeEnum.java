// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DiscretionScopeEnum}
 */
public enum DiscretionScopeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DISCRETION_SCOPE_UNSPECIFIED = 0;</code>
   */
  DISCRETION_SCOPE_UNSPECIFIED(0),
  /**
   * <code>DISCRETION_SCOPE_GLOBAL = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_SCOPE_GLOBAL(1),
  /**
   * <code>DISCRETION_SCOPE_LOCAL = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_SCOPE_LOCAL(2),
  /**
   * <code>DISCRETION_SCOPE_NATIONAL = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_SCOPE_NATIONAL(3),
  /**
   * <code>DISCRETION_SCOPE_NATIONAL_EXCLUDING_LOCAL = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DISCRETION_SCOPE_NATIONAL_EXCLUDING_LOCAL(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DISCRETION_SCOPE_UNSPECIFIED = 0;</code>
   */
  public static final int DISCRETION_SCOPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DISCRETION_SCOPE_GLOBAL = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_SCOPE_GLOBAL_VALUE = 1;
  /**
   * <code>DISCRETION_SCOPE_LOCAL = 2 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_SCOPE_LOCAL_VALUE = 2;
  /**
   * <code>DISCRETION_SCOPE_NATIONAL = 3 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_SCOPE_NATIONAL_VALUE = 3;
  /**
   * <code>DISCRETION_SCOPE_NATIONAL_EXCLUDING_LOCAL = 4 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DISCRETION_SCOPE_NATIONAL_EXCLUDING_LOCAL_VALUE = 4;


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
  public static DiscretionScopeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DiscretionScopeEnum forNumber(int value) {
    switch (value) {
      case 0: return DISCRETION_SCOPE_UNSPECIFIED;
      case 1: return DISCRETION_SCOPE_GLOBAL;
      case 2: return DISCRETION_SCOPE_LOCAL;
      case 3: return DISCRETION_SCOPE_NATIONAL;
      case 4: return DISCRETION_SCOPE_NATIONAL_EXCLUDING_LOCAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiscretionScopeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiscretionScopeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiscretionScopeEnum>() {
          public DiscretionScopeEnum findValueByNumber(int number) {
            return DiscretionScopeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(7);
  }

  private static final DiscretionScopeEnum[] VALUES = values();

  public static DiscretionScopeEnum valueOf(
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

  private DiscretionScopeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DiscretionScopeEnum)
}

