// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Instance.proto

package com.gcalsolaro.grpc.artifact.model;

public interface InstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.gcalsolaro.grpc.artifact.model.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 idInstance = 1;</code>
   */
  int getIdInstance();

  /**
   * <code>string cInstance = 2;</code>
   */
  java.lang.String getCInstance();
  /**
   * <code>string cInstance = 2;</code>
   */
  com.google.protobuf.ByteString
      getCInstanceBytes();

  /**
   * <code>string info = 10;</code>
   */
  java.lang.String getInfo();
  /**
   * <code>string info = 10;</code>
   */
  com.google.protobuf.ByteString
      getInfoBytes();

  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  boolean hasUser();
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  com.gcalsolaro.grpc.artifact.model.User getUser();
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  com.gcalsolaro.grpc.artifact.model.UserOrBuilder getUserOrBuilder();
}
