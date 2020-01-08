// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface InstrmtLegSecListGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.InstrmtLegSecListGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the instrumentLeg field is set.
   */
  boolean hasInstrumentLeg();
  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The instrumentLeg.
   */
  org.fixprotocol.components.InstrumentLeg getInstrumentLeg();
  /**
   * <code>.Common.InstrumentLeg instrument_leg = 1 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.InstrumentLegOrBuilder getInstrumentLegOrBuilder();

  /**
   * <code>.Common.LegBenchmarkCurveData leg_benchmark_curve_data = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the legBenchmarkCurveData field is set.
   */
  boolean hasLegBenchmarkCurveData();
  /**
   * <code>.Common.LegBenchmarkCurveData leg_benchmark_curve_data = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legBenchmarkCurveData.
   */
  org.fixprotocol.components.LegBenchmarkCurveData getLegBenchmarkCurveData();
  /**
   * <code>.Common.LegBenchmarkCurveData leg_benchmark_curve_data = 2 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegBenchmarkCurveDataOrBuilder getLegBenchmarkCurveDataOrBuilder();

  /**
   * <code>.Common.LegSettlTypeEnum leg_settl_type = 3 [(.fix.tag) = 587, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legSettlType.
   */
  int getLegSettlTypeValue();
  /**
   * <code>.Common.LegSettlTypeEnum leg_settl_type = 3 [(.fix.tag) = 587, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSettlType.
   */
  org.fixprotocol.components.LegSettlTypeEnum getLegSettlType();

  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.LegStipulations> 
      getLegStipulationsList();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegStipulations getLegStipulations(int index);
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getLegStipulationsCount();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.LegStipulationsOrBuilder> 
      getLegStipulationsOrBuilderList();
  /**
   * <code>repeated .Common.LegStipulations leg_stipulations = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.LegStipulationsOrBuilder getLegStipulationsOrBuilder(
      int index);

  /**
   * <code>.Common.LegSwapTypeEnum leg_swap_type = 5 [(.fix.tag) = 690, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for legSwapType.
   */
  int getLegSwapTypeValue();
  /**
   * <code>.Common.LegSwapTypeEnum leg_swap_type = 5 [(.fix.tag) = 690, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The legSwapType.
   */
  org.fixprotocol.components.LegSwapTypeEnum getLegSwapType();
}
