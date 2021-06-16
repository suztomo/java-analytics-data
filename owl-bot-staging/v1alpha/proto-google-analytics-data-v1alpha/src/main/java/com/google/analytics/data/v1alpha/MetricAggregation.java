// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 * <pre>
 * Represents aggregation of metrics.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.data.v1alpha.MetricAggregation}
 */
public enum MetricAggregation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified operator.
   * </pre>
   *
   * <code>METRIC_AGGREGATION_UNSPECIFIED = 0;</code>
   */
  METRIC_AGGREGATION_UNSPECIFIED(0),
  /**
   * <pre>
   * SUM operator.
   * </pre>
   *
   * <code>TOTAL = 1;</code>
   */
  TOTAL(1),
  /**
   * <pre>
   * Minimum operator.
   * </pre>
   *
   * <code>MINIMUM = 5;</code>
   */
  MINIMUM(5),
  /**
   * <pre>
   * Maximum operator.
   * </pre>
   *
   * <code>MAXIMUM = 6;</code>
   */
  MAXIMUM(6),
  /**
   * <pre>
   * Count operator.
   * </pre>
   *
   * <code>COUNT = 4;</code>
   */
  COUNT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified operator.
   * </pre>
   *
   * <code>METRIC_AGGREGATION_UNSPECIFIED = 0;</code>
   */
  public static final int METRIC_AGGREGATION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * SUM operator.
   * </pre>
   *
   * <code>TOTAL = 1;</code>
   */
  public static final int TOTAL_VALUE = 1;
  /**
   * <pre>
   * Minimum operator.
   * </pre>
   *
   * <code>MINIMUM = 5;</code>
   */
  public static final int MINIMUM_VALUE = 5;
  /**
   * <pre>
   * Maximum operator.
   * </pre>
   *
   * <code>MAXIMUM = 6;</code>
   */
  public static final int MAXIMUM_VALUE = 6;
  /**
   * <pre>
   * Count operator.
   * </pre>
   *
   * <code>COUNT = 4;</code>
   */
  public static final int COUNT_VALUE = 4;


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
  public static MetricAggregation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MetricAggregation forNumber(int value) {
    switch (value) {
      case 0: return METRIC_AGGREGATION_UNSPECIFIED;
      case 1: return TOTAL;
      case 5: return MINIMUM;
      case 6: return MAXIMUM;
      case 4: return COUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetricAggregation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetricAggregation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetricAggregation>() {
          public MetricAggregation findValueByNumber(int number) {
            return MetricAggregation.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MetricAggregation[] VALUES = values();

  public static MetricAggregation valueOf(
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

  private MetricAggregation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.data.v1alpha.MetricAggregation)
}
