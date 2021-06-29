// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IstanzaService.proto

package com.gcalsolaro.grpc.artifact.service;

/**
 * Protobuf type {@code com.gcalsolaro.grpc.artifact.service.IstanzaResponse}
 */
public  final class IstanzaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.gcalsolaro.grpc.artifact.service.IstanzaResponse)
    IstanzaResponseOrBuilder {
  // Use IstanzaResponse.newBuilder() to construct.
  private IstanzaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IstanzaResponse() {
    esito_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IstanzaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            esito_ = input.readBool();
            break;
          }
          case 18: {
            com.gcalsolaro.grpc.artifact.model.Istanza.Builder subBuilder = null;
            if (istanza_ != null) {
              subBuilder = istanza_.toBuilder();
            }
            istanza_ = input.readMessage(com.gcalsolaro.grpc.artifact.model.Istanza.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(istanza_);
              istanza_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gcalsolaro.grpc.artifact.service.IstanzaResponse.class, com.gcalsolaro.grpc.artifact.service.IstanzaResponse.Builder.class);
  }

  public static final int ESITO_FIELD_NUMBER = 1;
  private boolean esito_;
  /**
   * <code>bool esito = 1;</code>
   */
  public boolean getEsito() {
    return esito_;
  }

  public static final int ISTANZA_FIELD_NUMBER = 2;
  private com.gcalsolaro.grpc.artifact.model.Istanza istanza_;
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
   */
  public boolean hasIstanza() {
    return istanza_ != null;
  }
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
   */
  public com.gcalsolaro.grpc.artifact.model.Istanza getIstanza() {
    return istanza_ == null ? com.gcalsolaro.grpc.artifact.model.Istanza.getDefaultInstance() : istanza_;
  }
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
   */
  public com.gcalsolaro.grpc.artifact.model.IstanzaOrBuilder getIstanzaOrBuilder() {
    return getIstanza();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (esito_ != false) {
      output.writeBool(1, esito_);
    }
    if (istanza_ != null) {
      output.writeMessage(2, getIstanza());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (esito_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, esito_);
    }
    if (istanza_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIstanza());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.gcalsolaro.grpc.artifact.service.IstanzaResponse)) {
      return super.equals(obj);
    }
    com.gcalsolaro.grpc.artifact.service.IstanzaResponse other = (com.gcalsolaro.grpc.artifact.service.IstanzaResponse) obj;

    boolean result = true;
    result = result && (getEsito()
        == other.getEsito());
    result = result && (hasIstanza() == other.hasIstanza());
    if (hasIstanza()) {
      result = result && getIstanza()
          .equals(other.getIstanza());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ESITO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEsito());
    if (hasIstanza()) {
      hash = (37 * hash) + ISTANZA_FIELD_NUMBER;
      hash = (53 * hash) + getIstanza().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gcalsolaro.grpc.artifact.service.IstanzaResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.gcalsolaro.grpc.artifact.service.IstanzaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gcalsolaro.grpc.artifact.service.IstanzaResponse)
      com.gcalsolaro.grpc.artifact.service.IstanzaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gcalsolaro.grpc.artifact.service.IstanzaResponse.class, com.gcalsolaro.grpc.artifact.service.IstanzaResponse.Builder.class);
    }

    // Construct using com.gcalsolaro.grpc.artifact.service.IstanzaResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      esito_ = false;

      if (istanzaBuilder_ == null) {
        istanza_ = null;
      } else {
        istanza_ = null;
        istanzaBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_service_IstanzaResponse_descriptor;
    }

    public com.gcalsolaro.grpc.artifact.service.IstanzaResponse getDefaultInstanceForType() {
      return com.gcalsolaro.grpc.artifact.service.IstanzaResponse.getDefaultInstance();
    }

    public com.gcalsolaro.grpc.artifact.service.IstanzaResponse build() {
      com.gcalsolaro.grpc.artifact.service.IstanzaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gcalsolaro.grpc.artifact.service.IstanzaResponse buildPartial() {
      com.gcalsolaro.grpc.artifact.service.IstanzaResponse result = new com.gcalsolaro.grpc.artifact.service.IstanzaResponse(this);
      result.esito_ = esito_;
      if (istanzaBuilder_ == null) {
        result.istanza_ = istanza_;
      } else {
        result.istanza_ = istanzaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gcalsolaro.grpc.artifact.service.IstanzaResponse) {
        return mergeFrom((com.gcalsolaro.grpc.artifact.service.IstanzaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gcalsolaro.grpc.artifact.service.IstanzaResponse other) {
      if (other == com.gcalsolaro.grpc.artifact.service.IstanzaResponse.getDefaultInstance()) return this;
      if (other.getEsito() != false) {
        setEsito(other.getEsito());
      }
      if (other.hasIstanza()) {
        mergeIstanza(other.getIstanza());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gcalsolaro.grpc.artifact.service.IstanzaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gcalsolaro.grpc.artifact.service.IstanzaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean esito_ ;
    /**
     * <code>bool esito = 1;</code>
     */
    public boolean getEsito() {
      return esito_;
    }
    /**
     * <code>bool esito = 1;</code>
     */
    public Builder setEsito(boolean value) {
      
      esito_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool esito = 1;</code>
     */
    public Builder clearEsito() {
      
      esito_ = false;
      onChanged();
      return this;
    }

    private com.gcalsolaro.grpc.artifact.model.Istanza istanza_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gcalsolaro.grpc.artifact.model.Istanza, com.gcalsolaro.grpc.artifact.model.Istanza.Builder, com.gcalsolaro.grpc.artifact.model.IstanzaOrBuilder> istanzaBuilder_;
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public boolean hasIstanza() {
      return istanzaBuilder_ != null || istanza_ != null;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.Istanza getIstanza() {
      if (istanzaBuilder_ == null) {
        return istanza_ == null ? com.gcalsolaro.grpc.artifact.model.Istanza.getDefaultInstance() : istanza_;
      } else {
        return istanzaBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public Builder setIstanza(com.gcalsolaro.grpc.artifact.model.Istanza value) {
      if (istanzaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        istanza_ = value;
        onChanged();
      } else {
        istanzaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public Builder setIstanza(
        com.gcalsolaro.grpc.artifact.model.Istanza.Builder builderForValue) {
      if (istanzaBuilder_ == null) {
        istanza_ = builderForValue.build();
        onChanged();
      } else {
        istanzaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public Builder mergeIstanza(com.gcalsolaro.grpc.artifact.model.Istanza value) {
      if (istanzaBuilder_ == null) {
        if (istanza_ != null) {
          istanza_ =
            com.gcalsolaro.grpc.artifact.model.Istanza.newBuilder(istanza_).mergeFrom(value).buildPartial();
        } else {
          istanza_ = value;
        }
        onChanged();
      } else {
        istanzaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public Builder clearIstanza() {
      if (istanzaBuilder_ == null) {
        istanza_ = null;
        onChanged();
      } else {
        istanza_ = null;
        istanzaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.Istanza.Builder getIstanzaBuilder() {
      
      onChanged();
      return getIstanzaFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.IstanzaOrBuilder getIstanzaOrBuilder() {
      if (istanzaBuilder_ != null) {
        return istanzaBuilder_.getMessageOrBuilder();
      } else {
        return istanza_ == null ?
            com.gcalsolaro.grpc.artifact.model.Istanza.getDefaultInstance() : istanza_;
      }
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.Istanza istanza = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gcalsolaro.grpc.artifact.model.Istanza, com.gcalsolaro.grpc.artifact.model.Istanza.Builder, com.gcalsolaro.grpc.artifact.model.IstanzaOrBuilder> 
        getIstanzaFieldBuilder() {
      if (istanzaBuilder_ == null) {
        istanzaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.gcalsolaro.grpc.artifact.model.Istanza, com.gcalsolaro.grpc.artifact.model.Istanza.Builder, com.gcalsolaro.grpc.artifact.model.IstanzaOrBuilder>(
                getIstanza(),
                getParentForChildren(),
                isClean());
        istanza_ = null;
      }
      return istanzaBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gcalsolaro.grpc.artifact.service.IstanzaResponse)
  }

  // @@protoc_insertion_point(class_scope:com.gcalsolaro.grpc.artifact.service.IstanzaResponse)
  private static final com.gcalsolaro.grpc.artifact.service.IstanzaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gcalsolaro.grpc.artifact.service.IstanzaResponse();
  }

  public static com.gcalsolaro.grpc.artifact.service.IstanzaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IstanzaResponse>
      PARSER = new com.google.protobuf.AbstractParser<IstanzaResponse>() {
    public IstanzaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IstanzaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IstanzaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IstanzaResponse> getParserForType() {
    return PARSER;
  }

  public com.gcalsolaro.grpc.artifact.service.IstanzaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

