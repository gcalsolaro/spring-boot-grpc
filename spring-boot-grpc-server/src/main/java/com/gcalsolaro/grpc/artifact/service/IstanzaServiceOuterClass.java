// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IstanzaService.proto

package com.gcalsolaro.grpc.artifact.service;

public final class IstanzaServiceOuterClass {
  private IstanzaServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024IstanzaService.proto\022$com.gcalsolaro.g" +
      "rpc.artifact.service\032\rIstanza.proto\"#\n\016I" +
      "stanzaRequest\022\021\n\tidIstanza\030\001 \001(\005\"^\n\017Ista" +
      "nzaResponse\022\r\n\005esito\030\001 \001(\010\022<\n\007istanza\030\002 " +
      "\001(\0132+.com.gcalsolaro.grpc.artifact.model" +
      ".Istanza2\224\001\n\016IstanzaService\022\201\001\n\022recupera" +
      "IstanzaApi\0224.com.gcalsolaro.grpc.artifac" +
      "t.service.IstanzaRequest\0325.com.gcalsolar" +
      "o.grpc.artifact.service.IstanzaResponseB" +
      "\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gcalsolaro.grpc.artifact.model.IstanzaOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaRequest_descriptor,
        new java.lang.String[] { "IdIstanza", });
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor,
        new java.lang.String[] { "Esito", "Istanza", });
    com.gcalsolaro.grpc.artifact.model.IstanzaOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
