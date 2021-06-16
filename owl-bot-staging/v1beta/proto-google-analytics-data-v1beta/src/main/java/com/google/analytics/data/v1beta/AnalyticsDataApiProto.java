// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public final class AnalyticsDataApiProto {
  private AnalyticsDataApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunPivotReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunPivotReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_GetMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/analytics/data/v1beta/analytics" +
      "_data_api.proto\022\034google.analytics.data.v" +
      "1beta\032\'google/analytics/data/v1beta/data" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\"\350\001\n\010Metadata\022\014\n\004name\030\003 \001(\t\022C\n\ndimensio" +
      "ns\030\001 \003(\0132/.google.analytics.data.v1beta." +
      "DimensionMetadata\022=\n\007metrics\030\002 \003(\0132,.goo" +
      "gle.analytics.data.v1beta.MetricMetadata" +
      ":J\352AG\n%analyticsdata.googleapis.com/Meta" +
      "data\022\036properties/{property}/metadata\"\234\005\n" +
      "\020RunReportRequest\022\020\n\010property\030\001 \001(\t\022;\n\nd" +
      "imensions\030\002 \003(\0132\'.google.analytics.data." +
      "v1beta.Dimension\0225\n\007metrics\030\003 \003(\0132$.goog" +
      "le.analytics.data.v1beta.Metric\022<\n\013date_" +
      "ranges\030\004 \003(\0132\'.google.analytics.data.v1b" +
      "eta.DateRange\022H\n\020dimension_filter\030\005 \001(\0132" +
      "..google.analytics.data.v1beta.FilterExp" +
      "ression\022E\n\rmetric_filter\030\006 \001(\0132..google." +
      "analytics.data.v1beta.FilterExpression\022\016" +
      "\n\006offset\030\007 \001(\003\022\r\n\005limit\030\010 \001(\003\022L\n\023metric_" +
      "aggregations\030\t \003(\0162/.google.analytics.da" +
      "ta.v1beta.MetricAggregation\0228\n\torder_bys" +
      "\030\n \003(\0132%.google.analytics.data.v1beta.Or" +
      "derBy\022\025\n\rcurrency_code\030\013 \001(\t\022=\n\013cohort_s" +
      "pec\030\014 \001(\0132(.google.analytics.data.v1beta" +
      ".CohortSpec\022\027\n\017keep_empty_rows\030\r \001(\010\022\035\n\025" +
      "return_property_quota\030\016 \001(\010\"\227\004\n\021RunRepor" +
      "tResponse\022H\n\021dimension_headers\030\001 \003(\0132-.g" +
      "oogle.analytics.data.v1beta.DimensionHea" +
      "der\022B\n\016metric_headers\030\002 \003(\0132*.google.ana" +
      "lytics.data.v1beta.MetricHeader\022/\n\004rows\030" +
      "\003 \003(\0132!.google.analytics.data.v1beta.Row" +
      "\0221\n\006totals\030\004 \003(\0132!.google.analytics.data" +
      ".v1beta.Row\0223\n\010maximums\030\005 \003(\0132!.google.a" +
      "nalytics.data.v1beta.Row\0223\n\010minimums\030\006 \003" +
      "(\0132!.google.analytics.data.v1beta.Row\022\021\n" +
      "\trow_count\030\007 \001(\005\022@\n\010metadata\030\010 \001(\0132..goo" +
      "gle.analytics.data.v1beta.ResponseMetaDa" +
      "ta\022C\n\016property_quota\030\t \001(\0132+.google.anal" +
      "ytics.data.v1beta.PropertyQuota\022\014\n\004kind\030" +
      "\n \001(\t\"\257\004\n\025RunPivotReportRequest\022\020\n\010prope" +
      "rty\030\001 \001(\t\022;\n\ndimensions\030\002 \003(\0132\'.google.a" +
      "nalytics.data.v1beta.Dimension\0225\n\007metric" +
      "s\030\003 \003(\0132$.google.analytics.data.v1beta.M" +
      "etric\022<\n\013date_ranges\030\004 \003(\0132\'.google.anal" +
      "ytics.data.v1beta.DateRange\0223\n\006pivots\030\005 " +
      "\003(\0132#.google.analytics.data.v1beta.Pivot" +
      "\022H\n\020dimension_filter\030\006 \001(\0132..google.anal" +
      "ytics.data.v1beta.FilterExpression\022E\n\rme" +
      "tric_filter\030\007 \001(\0132..google.analytics.dat" +
      "a.v1beta.FilterExpression\022\025\n\rcurrency_co" +
      "de\030\010 \001(\t\022=\n\013cohort_spec\030\t \001(\0132(.google.a" +
      "nalytics.data.v1beta.CohortSpec\022\027\n\017keep_" +
      "empty_rows\030\n \001(\010\022\035\n\025return_property_quot" +
      "a\030\013 \001(\010\"\345\003\n\026RunPivotReportResponse\022@\n\rpi" +
      "vot_headers\030\001 \003(\0132).google.analytics.dat" +
      "a.v1beta.PivotHeader\022H\n\021dimension_header" +
      "s\030\002 \003(\0132-.google.analytics.data.v1beta.D" +
      "imensionHeader\022B\n\016metric_headers\030\003 \003(\0132*" +
      ".google.analytics.data.v1beta.MetricHead" +
      "er\022/\n\004rows\030\004 \003(\0132!.google.analytics.data" +
      ".v1beta.Row\0225\n\naggregates\030\005 \003(\0132!.google" +
      ".analytics.data.v1beta.Row\022@\n\010metadata\030\006" +
      " \001(\0132..google.analytics.data.v1beta.Resp" +
      "onseMetaData\022C\n\016property_quota\030\007 \001(\0132+.g" +
      "oogle.analytics.data.v1beta.PropertyQuot" +
      "a\022\014\n\004kind\030\010 \001(\t\"l\n\026BatchRunReportsReques" +
      "t\022\020\n\010property\030\001 \001(\t\022@\n\010requests\030\002 \003(\0132.." +
      "google.analytics.data.v1beta.RunReportRe" +
      "quest\"i\n\027BatchRunReportsResponse\022@\n\007repo" +
      "rts\030\001 \003(\0132/.google.analytics.data.v1beta" +
      ".RunReportResponse\022\014\n\004kind\030\002 \001(\t\"v\n\033Batc" +
      "hRunPivotReportsRequest\022\020\n\010property\030\001 \001(" +
      "\t\022E\n\010requests\030\002 \003(\01323.google.analytics.d" +
      "ata.v1beta.RunPivotReportRequest\"y\n\034Batc" +
      "hRunPivotReportsResponse\022K\n\rpivot_report" +
      "s\030\001 \003(\01324.google.analytics.data.v1beta.R" +
      "unPivotReportResponse\022\014\n\004kind\030\002 \001(\t\"Q\n\022G" +
      "etMetadataRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n" +
      "%analyticsdata.googleapis.com/Metadata\"\347" +
      "\003\n\030RunRealtimeReportRequest\022\020\n\010property\030" +
      "\001 \001(\t\022;\n\ndimensions\030\002 \003(\0132\'.google.analy" +
      "tics.data.v1beta.Dimension\0225\n\007metrics\030\003 " +
      "\003(\0132$.google.analytics.data.v1beta.Metri" +
      "c\022H\n\020dimension_filter\030\004 \001(\0132..google.ana" +
      "lytics.data.v1beta.FilterExpression\022E\n\rm" +
      "etric_filter\030\005 \001(\0132..google.analytics.da" +
      "ta.v1beta.FilterExpression\022\r\n\005limit\030\006 \001(" +
      "\003\022L\n\023metric_aggregations\030\007 \003(\0162/.google." +
      "analytics.data.v1beta.MetricAggregation\022" +
      "8\n\torder_bys\030\010 \003(\0132%.google.analytics.da" +
      "ta.v1beta.OrderBy\022\035\n\025return_property_quo" +
      "ta\030\t \001(\010\"\335\003\n\031RunRealtimeReportResponse\022H" +
      "\n\021dimension_headers\030\001 \003(\0132-.google.analy" +
      "tics.data.v1beta.DimensionHeader\022B\n\016metr" +
      "ic_headers\030\002 \003(\0132*.google.analytics.data" +
      ".v1beta.MetricHeader\022/\n\004rows\030\003 \003(\0132!.goo" +
      "gle.analytics.data.v1beta.Row\0221\n\006totals\030" +
      "\004 \003(\0132!.google.analytics.data.v1beta.Row" +
      "\0223\n\010maximums\030\005 \003(\0132!.google.analytics.da" +
      "ta.v1beta.Row\0223\n\010minimums\030\006 \003(\0132!.google" +
      ".analytics.data.v1beta.Row\022\021\n\trow_count\030" +
      "\007 \001(\005\022C\n\016property_quota\030\010 \001(\0132+.google.a" +
      "nalytics.data.v1beta.PropertyQuota\022\014\n\004ki" +
      "nd\030\t \001(\t2\343\t\n\021BetaAnalyticsData\022\242\001\n\tRunRe" +
      "port\022..google.analytics.data.v1beta.RunR" +
      "eportRequest\032/.google.analytics.data.v1b" +
      "eta.RunReportResponse\"4\202\323\344\223\002.\")/v1beta/{" +
      "property=properties/*}:runReport:\001*\022\266\001\n\016" +
      "RunPivotReport\0223.google.analytics.data.v" +
      "1beta.RunPivotReportRequest\0324.google.ana" +
      "lytics.data.v1beta.RunPivotReportRespons" +
      "e\"9\202\323\344\223\0023\"./v1beta/{property=properties/" +
      "*}:runPivotReport:\001*\022\272\001\n\017BatchRunReports" +
      "\0224.google.analytics.data.v1beta.BatchRun" +
      "ReportsRequest\0325.google.analytics.data.v" +
      "1beta.BatchRunReportsResponse\":\202\323\344\223\0024\"//" +
      "v1beta/{property=properties/*}:batchRunR" +
      "eports:\001*\022\316\001\n\024BatchRunPivotReports\0229.goo" +
      "gle.analytics.data.v1beta.BatchRunPivotR" +
      "eportsRequest\032:.google.analytics.data.v1" +
      "beta.BatchRunPivotReportsResponse\"?\202\323\344\223\002" +
      "9\"4/v1beta/{property=properties/*}:batch" +
      "RunPivotReports:\001*\022\234\001\n\013GetMetadata\0220.goo" +
      "gle.analytics.data.v1beta.GetMetadataReq" +
      "uest\032&.google.analytics.data.v1beta.Meta" +
      "data\"3\202\323\344\223\002&\022$/v1beta/{name=properties/*" +
      "/metadata}\332A\004name\022\302\001\n\021RunRealtimeReport\022" +
      "6.google.analytics.data.v1beta.RunRealti" +
      "meReportRequest\0327.google.analytics.data." +
      "v1beta.RunRealtimeReportResponse\"<\202\323\344\223\0026" +
      "\"1/v1beta/{property=properties/*}:runRea" +
      "ltimeReport:\001*\032~\312A\034analyticsdata.googlea" +
      "pis.com\322A\\https://www.googleapis.com/aut" +
      "h/analytics,https://www.googleapis.com/a" +
      "uth/analytics.readonlyB}\n com.google.ana" +
      "lytics.data.v1betaB\025AnalyticsDataApiProt" +
      "oP\001Z@google.golang.org/genproto/googleap" +
      "is/analytics/data/v1beta;datab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.analytics.data.v1beta.ReportingApiProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_analytics_data_v1beta_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_data_v1beta_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_Metadata_descriptor,
        new java.lang.String[] { "Name", "Dimensions", "Metrics", });
    internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_data_v1beta_RunReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor,
        new java.lang.String[] { "Property", "Dimensions", "Metrics", "DateRanges", "DimensionFilter", "MetricFilter", "Offset", "Limit", "MetricAggregations", "OrderBys", "CurrencyCode", "CohortSpec", "KeepEmptyRows", "ReturnPropertyQuota", });
    internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_data_v1beta_RunReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor,
        new java.lang.String[] { "DimensionHeaders", "MetricHeaders", "Rows", "Totals", "Maximums", "Minimums", "RowCount", "Metadata", "PropertyQuota", "Kind", });
    internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_data_v1beta_RunPivotReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor,
        new java.lang.String[] { "Property", "Dimensions", "Metrics", "DateRanges", "Pivots", "DimensionFilter", "MetricFilter", "CurrencyCode", "CohortSpec", "KeepEmptyRows", "ReturnPropertyQuota", });
    internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_data_v1beta_RunPivotReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor,
        new java.lang.String[] { "PivotHeaders", "DimensionHeaders", "MetricHeaders", "Rows", "Aggregates", "Metadata", "PropertyQuota", "Kind", });
    internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor,
        new java.lang.String[] { "Property", "Requests", });
    internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor,
        new java.lang.String[] { "Reports", "Kind", });
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor,
        new java.lang.String[] { "Property", "Requests", });
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor,
        new java.lang.String[] { "PivotReports", "Kind", });
    internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_analytics_data_v1beta_GetMetadataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor,
        new java.lang.String[] { "Property", "Dimensions", "Metrics", "DimensionFilter", "MetricFilter", "Limit", "MetricAggregations", "OrderBys", "ReturnPropertyQuota", });
    internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor,
        new java.lang.String[] { "DimensionHeaders", "MetricHeaders", "Rows", "Totals", "Maximums", "Minimums", "RowCount", "PropertyQuota", "Kind", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.analytics.data.v1beta.ReportingApiProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
