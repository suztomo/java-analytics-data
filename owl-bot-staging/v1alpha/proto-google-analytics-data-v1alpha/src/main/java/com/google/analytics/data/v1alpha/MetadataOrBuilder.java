// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Resource name of this metadata.
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.DimensionMetadata> 
      getDimensionsList();
  /**
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  com.google.analytics.data.v1alpha.DimensionMetadata getDimensions(int index);
  /**
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder> 
      getDimensionsOrBuilderList();
  /**
   * <pre>
   * The dimension descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.DimensionMetadata dimensions = 1;</code>
   */
  com.google.analytics.data.v1alpha.DimensionMetadataOrBuilder getDimensionsOrBuilder(
      int index);

  /**
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.MetricMetadata> 
      getMetricsList();
  /**
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  com.google.analytics.data.v1alpha.MetricMetadata getMetrics(int index);
  /**
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.MetricMetadataOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <pre>
   * The metric descriptions.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.MetricMetadata metrics = 2;</code>
   */
  com.google.analytics.data.v1alpha.MetricMetadataOrBuilder getMetricsOrBuilder(
      int index);
}