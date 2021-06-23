/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/analytics_data_api.proto

package com.google.analytics.data.v1alpha;

public final class AnalyticsDataApiProto {
  private AnalyticsDataApiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_GetMetadataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_GetMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunRealtimeReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunRealtimeReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/analytics/data/v1alpha/analytic"
          + "s_data_api.proto\022\035google.analytics.data."
          + "v1alpha\032(google/analytics/data/v1alpha/d"
          + "ata.proto\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\"\352\001\n\010Metadata\022\014\n\004name\030\003 \001(\t\022D\n\ndimen"
          + "sions\030\001 \003(\01320.google.analytics.data.v1al"
          + "pha.DimensionMetadata\022>\n\007metrics\030\002 \003(\0132-"
          + ".google.analytics.data.v1alpha.MetricMet"
          + "adata:J\352AG\n%analyticsdata.googleapis.com"
          + "/Metadata\022\036properties/{property}/metadat"
          + "a\"\311\005\n\020RunReportRequest\0225\n\006entity\030\001 \001(\0132%"
          + ".google.analytics.data.v1alpha.Entity\022<\n"
          + "\ndimensions\030\002 \003(\0132(.google.analytics.dat"
          + "a.v1alpha.Dimension\0226\n\007metrics\030\003 \003(\0132%.g"
          + "oogle.analytics.data.v1alpha.Metric\022=\n\013d"
          + "ate_ranges\030\004 \003(\0132(.google.analytics.data"
          + ".v1alpha.DateRange\022\016\n\006offset\030\005 \001(\003\022\r\n\005li"
          + "mit\030\006 \001(\003\022M\n\023metric_aggregations\030\007 \003(\01620"
          + ".google.analytics.data.v1alpha.MetricAgg"
          + "regation\022I\n\020dimension_filter\030\010 \001(\0132/.goo"
          + "gle.analytics.data.v1alpha.FilterExpress"
          + "ion\022F\n\rmetric_filter\030\t \001(\0132/.google.anal"
          + "ytics.data.v1alpha.FilterExpression\0229\n\to"
          + "rder_bys\030\n \003(\0132&.google.analytics.data.v"
          + "1alpha.OrderBy\022\025\n\rcurrency_code\030\013 \001(\t\022>\n"
          + "\013cohort_spec\030\014 \001(\0132).google.analytics.da"
          + "ta.v1alpha.CohortSpec\022\027\n\017keep_empty_rows"
          + "\030\r \001(\010\022\035\n\025return_property_quota\030\016 \001(\010\"\221\004"
          + "\n\021RunReportResponse\022I\n\021dimension_headers"
          + "\030\013 \003(\0132..google.analytics.data.v1alpha.D"
          + "imensionHeader\022C\n\016metric_headers\030\001 \003(\0132+"
          + ".google.analytics.data.v1alpha.MetricHea"
          + "der\0220\n\004rows\030\002 \003(\0132\".google.analytics.dat"
          + "a.v1alpha.Row\0222\n\006totals\030\010 \003(\0132\".google.a"
          + "nalytics.data.v1alpha.Row\0224\n\010maximums\030\t "
          + "\003(\0132\".google.analytics.data.v1alpha.Row\022"
          + "4\n\010minimums\030\n \003(\0132\".google.analytics.dat"
          + "a.v1alpha.Row\022\021\n\trow_count\030\014 \001(\005\022A\n\010meta"
          + "data\030\006 \001(\0132/.google.analytics.data.v1alp"
          + "ha.ResponseMetaData\022D\n\016property_quota\030\007 "
          + "\001(\0132,.google.analytics.data.v1alpha.Prop"
          + "ertyQuota\"\333\004\n\025RunPivotReportRequest\0225\n\006e"
          + "ntity\030\001 \001(\0132%.google.analytics.data.v1al"
          + "pha.Entity\022<\n\ndimensions\030\002 \003(\0132(.google."
          + "analytics.data.v1alpha.Dimension\0226\n\007metr"
          + "ics\030\003 \003(\0132%.google.analytics.data.v1alph"
          + "a.Metric\022I\n\020dimension_filter\030\004 \001(\0132/.goo"
          + "gle.analytics.data.v1alpha.FilterExpress"
          + "ion\022F\n\rmetric_filter\030\005 \001(\0132/.google.anal"
          + "ytics.data.v1alpha.FilterExpression\0224\n\006p"
          + "ivots\030\006 \003(\0132$.google.analytics.data.v1al"
          + "pha.Pivot\022=\n\013date_ranges\030\007 \003(\0132(.google."
          + "analytics.data.v1alpha.DateRange\022\025\n\rcurr"
          + "ency_code\030\010 \001(\t\022>\n\013cohort_spec\030\t \001(\0132).g"
          + "oogle.analytics.data.v1alpha.CohortSpec\022"
          + "\027\n\017keep_empty_rows\030\n \001(\010\022\035\n\025return_prope"
          + "rty_quota\030\013 \001(\010\"\336\003\n\026RunPivotReportRespon"
          + "se\022A\n\rpivot_headers\030\001 \003(\0132*.google.analy"
          + "tics.data.v1alpha.PivotHeader\022I\n\021dimensi"
          + "on_headers\030\007 \003(\0132..google.analytics.data"
          + ".v1alpha.DimensionHeader\022C\n\016metric_heade"
          + "rs\030\002 \003(\0132+.google.analytics.data.v1alpha"
          + ".MetricHeader\0220\n\004rows\030\003 \003(\0132\".google.ana"
          + "lytics.data.v1alpha.Row\0226\n\naggregates\030\004 "
          + "\003(\0132\".google.analytics.data.v1alpha.Row\022"
          + "A\n\010metadata\030\005 \001(\0132/.google.analytics.dat"
          + "a.v1alpha.ResponseMetaData\022D\n\016property_q"
          + "uota\030\006 \001(\0132,.google.analytics.data.v1alp"
          + "ha.PropertyQuota\"\222\001\n\026BatchRunReportsRequ"
          + "est\0225\n\006entity\030\001 \001(\0132%.google.analytics.d"
          + "ata.v1alpha.Entity\022A\n\010requests\030\002 \003(\0132/.g"
          + "oogle.analytics.data.v1alpha.RunReportRe"
          + "quest\"\\\n\027BatchRunReportsResponse\022A\n\007repo"
          + "rts\030\001 \003(\01320.google.analytics.data.v1alph"
          + "a.RunReportResponse\"\234\001\n\033BatchRunPivotRep"
          + "ortsRequest\0225\n\006entity\030\001 \001(\0132%.google.ana"
          + "lytics.data.v1alpha.Entity\022F\n\010requests\030\002"
          + " \003(\01324.google.analytics.data.v1alpha.Run"
          + "PivotReportRequest\"l\n\034BatchRunPivotRepor"
          + "tsResponse\022L\n\rpivot_reports\030\001 \003(\01325.goog"
          + "le.analytics.data.v1alpha.RunPivotReport"
          + "Response\"Q\n\022GetMetadataRequest\022;\n\004name\030\001"
          + " \001(\tB-\340A\002\372A\'\n%analyticsdata.googleapis.c"
          + "om/Metadata\"\355\003\n\030RunRealtimeReportRequest"
          + "\022\020\n\010property\030\001 \001(\t\022<\n\ndimensions\030\002 \003(\0132("
          + ".google.analytics.data.v1alpha.Dimension"
          + "\0226\n\007metrics\030\003 \003(\0132%.google.analytics.dat"
          + "a.v1alpha.Metric\022\r\n\005limit\030\004 \001(\003\022I\n\020dimen"
          + "sion_filter\030\005 \001(\0132/.google.analytics.dat"
          + "a.v1alpha.FilterExpression\022F\n\rmetric_fil"
          + "ter\030\006 \001(\0132/.google.analytics.data.v1alph"
          + "a.FilterExpression\022M\n\023metric_aggregation"
          + "s\030\007 \003(\01620.google.analytics.data.v1alpha."
          + "MetricAggregation\0229\n\torder_bys\030\010 \003(\0132&.g"
          + "oogle.analytics.data.v1alpha.OrderBy\022\035\n\025"
          + "return_property_quota\030\t \001(\010\"\326\003\n\031RunRealt"
          + "imeReportResponse\022I\n\021dimension_headers\030\001"
          + " \003(\0132..google.analytics.data.v1alpha.Dim"
          + "ensionHeader\022C\n\016metric_headers\030\002 \003(\0132+.g"
          + "oogle.analytics.data.v1alpha.MetricHeade"
          + "r\0220\n\004rows\030\003 \003(\0132\".google.analytics.data."
          + "v1alpha.Row\0222\n\006totals\030\004 \003(\0132\".google.ana"
          + "lytics.data.v1alpha.Row\0224\n\010maximums\030\005 \003("
          + "\0132\".google.analytics.data.v1alpha.Row\0224\n"
          + "\010minimums\030\006 \003(\0132\".google.analytics.data."
          + "v1alpha.Row\022\021\n\trow_count\030\007 \001(\005\022D\n\016proper"
          + "ty_quota\030\010 \001(\0132,.google.analytics.data.v"
          + "1alpha.PropertyQuota2\226\t\n\022AlphaAnalyticsD"
          + "ata\022\215\001\n\tRunReport\022/.google.analytics.dat"
          + "a.v1alpha.RunReportRequest\0320.google.anal"
          + "ytics.data.v1alpha.RunReportResponse\"\035\202\323"
          + "\344\223\002\027\"\022/v1alpha:runReport:\001*\022\241\001\n\016RunPivot"
          + "Report\0224.google.analytics.data.v1alpha.R"
          + "unPivotReportRequest\0325.google.analytics."
          + "data.v1alpha.RunPivotReportResponse\"\"\202\323\344"
          + "\223\002\034\"\027/v1alpha:runPivotReport:\001*\022\245\001\n\017Batc"
          + "hRunReports\0225.google.analytics.data.v1al"
          + "pha.BatchRunReportsRequest\0326.google.anal"
          + "ytics.data.v1alpha.BatchRunReportsRespon"
          + "se\"#\202\323\344\223\002\035\"\030/v1alpha:batchRunReports:\001*\022"
          + "\271\001\n\024BatchRunPivotReports\022:.google.analyt"
          + "ics.data.v1alpha.BatchRunPivotReportsReq"
          + "uest\032;.google.analytics.data.v1alpha.Bat"
          + "chRunPivotReportsResponse\"(\202\323\344\223\002\"\"\035/v1al"
          + "pha:batchRunPivotReports:\001*\022\237\001\n\013GetMetad"
          + "ata\0221.google.analytics.data.v1alpha.GetM"
          + "etadataRequest\032\'.google.analytics.data.v"
          + "1alpha.Metadata\"4\202\323\344\223\002\'\022%/v1alpha/{name="
          + "properties/*/metadata}\332A\004name\022\305\001\n\021RunRea"
          + "ltimeReport\0227.google.analytics.data.v1al"
          + "pha.RunRealtimeReportRequest\0328.google.an"
          + "alytics.data.v1alpha.RunRealtimeReportRe"
          + "sponse\"=\202\323\344\223\0027\"2/v1alpha/{property=prope"
          + "rties/*}:runRealtimeReport:\001*\032~\312A\034analyt"
          + "icsdata.googleapis.com\322A\\https://www.goo"
          + "gleapis.com/auth/analytics,https://www.g"
          + "oogleapis.com/auth/analytics.readonlyB\177\n"
          + "!com.google.analytics.data.v1alphaB\025Anal"
          + "yticsDataApiProtoP\001ZAgoogle.golang.org/g"
          + "enproto/googleapis/analytics/data/v1alph"
          + "a;datab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_analytics_data_v1alpha_Metadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_data_v1alpha_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_Metadata_descriptor,
            new java.lang.String[] {
              "Name", "Dimensions", "Metrics",
            });
    internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_data_v1alpha_RunReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunReportRequest_descriptor,
            new java.lang.String[] {
              "Entity",
              "Dimensions",
              "Metrics",
              "DateRanges",
              "Offset",
              "Limit",
              "MetricAggregations",
              "DimensionFilter",
              "MetricFilter",
              "OrderBys",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_data_v1alpha_RunReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunReportResponse_descriptor,
            new java.lang.String[] {
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Totals",
              "Maximums",
              "Minimums",
              "RowCount",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunPivotReportRequest_descriptor,
            new java.lang.String[] {
              "Entity",
              "Dimensions",
              "Metrics",
              "DimensionFilter",
              "MetricFilter",
              "Pivots",
              "DateRanges",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunPivotReportResponse_descriptor,
            new java.lang.String[] {
              "PivotHeaders",
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Aggregates",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunReportsRequest_descriptor,
            new java.lang.String[] {
              "Entity", "Requests",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunReportsResponse_descriptor,
            new java.lang.String[] {
              "Reports",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsRequest_descriptor,
            new java.lang.String[] {
              "Entity", "Requests",
            });
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_BatchRunPivotReportsResponse_descriptor,
            new java.lang.String[] {
              "PivotReports",
            });
    internal_static_google_analytics_data_v1alpha_GetMetadataRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_analytics_data_v1alpha_GetMetadataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_GetMetadataRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_analytics_data_v1alpha_RunRealtimeReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_analytics_data_v1alpha_RunRealtimeReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunRealtimeReportRequest_descriptor,
            new java.lang.String[] {
              "Property",
              "Dimensions",
              "Metrics",
              "Limit",
              "DimensionFilter",
              "MetricFilter",
              "MetricAggregations",
              "OrderBys",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1alpha_RunRealtimeReportResponse_descriptor,
            new java.lang.String[] {
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Totals",
              "Maximums",
              "Minimums",
              "RowCount",
              "PropertyQuota",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.analytics.data.v1alpha.ReportingApiProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}