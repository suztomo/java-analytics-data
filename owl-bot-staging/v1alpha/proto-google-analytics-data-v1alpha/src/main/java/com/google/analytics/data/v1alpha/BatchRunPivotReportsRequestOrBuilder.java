// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public interface BatchRunPivotReportsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.BatchRunPivotReportsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   * @return The entity.
   */
  com.google.analytics.data.v1alpha.Entity getEntity();
  /**
   * <pre>
   * A property whose events are tracked. This entity must be specified for the
   * batch. The entity within RunPivotReportRequest may either be unspecified or
   * consistent with this entity.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Entity entity = 1;</code>
   */
  com.google.analytics.data.v1alpha.EntityOrBuilder getEntityOrBuilder();

  /**
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.RunPivotReportRequest> 
      getRequestsList();
  /**
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  com.google.analytics.data.v1alpha.RunPivotReportRequest getRequests(int index);
  /**
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <pre>
   * Individual requests. Each request has a separate pivot report response.
   * Each batch request is allowed up to 5 requests.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.RunPivotReportRequest requests = 2;</code>
   */
  com.google.analytics.data.v1alpha.RunPivotReportRequestOrBuilder getRequestsOrBuilder(
      int index);
}