// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Instance.proto

package com.gcalsolaro.grpc.artifact.model;

/**
 * Protobuf type {@code com.gcalsolaro.grpc.artifact.model.Instance}
 */
public  final class Instance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.gcalsolaro.grpc.artifact.model.Instance)
    InstanceOrBuilder {
  // Use Instance.newBuilder() to construct.
  private Instance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Instance() {
    idInstance_ = 0;
    cInstance_ = "";
    info_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Instance(
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

            idInstance_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cInstance_ = s;
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            info_ = s;
            break;
          }
          case 138: {
            com.gcalsolaro.grpc.artifact.model.User.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(com.gcalsolaro.grpc.artifact.model.User.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
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
    return com.gcalsolaro.grpc.artifact.model.InstanceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_model_Instance_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gcalsolaro.grpc.artifact.model.InstanceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_model_Instance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gcalsolaro.grpc.artifact.model.Instance.class, com.gcalsolaro.grpc.artifact.model.Instance.Builder.class);
  }

  public static final int IDINSTANCE_FIELD_NUMBER = 1;
  private int idInstance_;
  /**
   * <code>int32 idInstance = 1;</code>
   */
  public int getIdInstance() {
    return idInstance_;
  }

  public static final int CINSTANCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object cInstance_;
  /**
   * <code>string cInstance = 2;</code>
   */
  public java.lang.String getCInstance() {
    java.lang.Object ref = cInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cInstance_ = s;
      return s;
    }
  }
  /**
   * <code>string cInstance = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCInstanceBytes() {
    java.lang.Object ref = cInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_FIELD_NUMBER = 10;
  private volatile java.lang.Object info_;
  /**
   * <code>string info = 10;</code>
   */
  public java.lang.String getInfo() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      info_ = s;
      return s;
    }
  }
  /**
   * <code>string info = 10;</code>
   */
  public com.google.protobuf.ByteString
      getInfoBytes() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      info_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIELD_NUMBER = 17;
  private com.gcalsolaro.grpc.artifact.model.User user_;
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  public com.gcalsolaro.grpc.artifact.model.User getUser() {
    return user_ == null ? com.gcalsolaro.grpc.artifact.model.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
   */
  public com.gcalsolaro.grpc.artifact.model.UserOrBuilder getUserOrBuilder() {
    return getUser();
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
    if (idInstance_ != 0) {
      output.writeInt32(1, idInstance_);
    }
    if (!getCInstanceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cInstance_);
    }
    if (!getInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, info_);
    }
    if (user_ != null) {
      output.writeMessage(17, getUser());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idInstance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, idInstance_);
    }
    if (!getCInstanceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cInstance_);
    }
    if (!getInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, info_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(17, getUser());
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
    if (!(obj instanceof com.gcalsolaro.grpc.artifact.model.Instance)) {
      return super.equals(obj);
    }
    com.gcalsolaro.grpc.artifact.model.Instance other = (com.gcalsolaro.grpc.artifact.model.Instance) obj;

    boolean result = true;
    result = result && (getIdInstance()
        == other.getIdInstance());
    result = result && getCInstance()
        .equals(other.getCInstance());
    result = result && getInfo()
        .equals(other.getInfo());
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
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
    hash = (37 * hash) + IDINSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getIdInstance();
    hash = (37 * hash) + CINSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getCInstance().hashCode();
    hash = (37 * hash) + INFO_FIELD_NUMBER;
    hash = (53 * hash) + getInfo().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gcalsolaro.grpc.artifact.model.Instance parseFrom(
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
  public static Builder newBuilder(com.gcalsolaro.grpc.artifact.model.Instance prototype) {
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
   * Protobuf type {@code com.gcalsolaro.grpc.artifact.model.Instance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.gcalsolaro.grpc.artifact.model.Instance)
      com.gcalsolaro.grpc.artifact.model.InstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gcalsolaro.grpc.artifact.model.InstanceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_model_Instance_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gcalsolaro.grpc.artifact.model.InstanceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_model_Instance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gcalsolaro.grpc.artifact.model.Instance.class, com.gcalsolaro.grpc.artifact.model.Instance.Builder.class);
    }

    // Construct using com.gcalsolaro.grpc.artifact.model.Instance.newBuilder()
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
      idInstance_ = 0;

      cInstance_ = "";

      info_ = "";

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gcalsolaro.grpc.artifact.model.InstanceOuterClass.internal_static_com_gcalsolaro_grpc_artifact_model_Instance_descriptor;
    }

    public com.gcalsolaro.grpc.artifact.model.Instance getDefaultInstanceForType() {
      return com.gcalsolaro.grpc.artifact.model.Instance.getDefaultInstance();
    }

    public com.gcalsolaro.grpc.artifact.model.Instance build() {
      com.gcalsolaro.grpc.artifact.model.Instance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.gcalsolaro.grpc.artifact.model.Instance buildPartial() {
      com.gcalsolaro.grpc.artifact.model.Instance result = new com.gcalsolaro.grpc.artifact.model.Instance(this);
      result.idInstance_ = idInstance_;
      result.cInstance_ = cInstance_;
      result.info_ = info_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
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
      if (other instanceof com.gcalsolaro.grpc.artifact.model.Instance) {
        return mergeFrom((com.gcalsolaro.grpc.artifact.model.Instance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gcalsolaro.grpc.artifact.model.Instance other) {
      if (other == com.gcalsolaro.grpc.artifact.model.Instance.getDefaultInstance()) return this;
      if (other.getIdInstance() != 0) {
        setIdInstance(other.getIdInstance());
      }
      if (!other.getCInstance().isEmpty()) {
        cInstance_ = other.cInstance_;
        onChanged();
      }
      if (!other.getInfo().isEmpty()) {
        info_ = other.info_;
        onChanged();
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
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
      com.gcalsolaro.grpc.artifact.model.Instance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gcalsolaro.grpc.artifact.model.Instance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idInstance_ ;
    /**
     * <code>int32 idInstance = 1;</code>
     */
    public int getIdInstance() {
      return idInstance_;
    }
    /**
     * <code>int32 idInstance = 1;</code>
     */
    public Builder setIdInstance(int value) {
      
      idInstance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idInstance = 1;</code>
     */
    public Builder clearIdInstance() {
      
      idInstance_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cInstance_ = "";
    /**
     * <code>string cInstance = 2;</code>
     */
    public java.lang.String getCInstance() {
      java.lang.Object ref = cInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cInstance = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCInstanceBytes() {
      java.lang.Object ref = cInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cInstance = 2;</code>
     */
    public Builder setCInstance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cInstance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cInstance = 2;</code>
     */
    public Builder clearCInstance() {
      
      cInstance_ = getDefaultInstance().getCInstance();
      onChanged();
      return this;
    }
    /**
     * <code>string cInstance = 2;</code>
     */
    public Builder setCInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cInstance_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object info_ = "";
    /**
     * <code>string info = 10;</code>
     */
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string info = 10;</code>
     */
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string info = 10;</code>
     */
    public Builder setInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      info_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string info = 10;</code>
     */
    public Builder clearInfo() {
      
      info_ = getDefaultInstance().getInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string info = 10;</code>
     */
    public Builder setInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      info_ = value;
      onChanged();
      return this;
    }

    private com.gcalsolaro.grpc.artifact.model.User user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gcalsolaro.grpc.artifact.model.User, com.gcalsolaro.grpc.artifact.model.User.Builder, com.gcalsolaro.grpc.artifact.model.UserOrBuilder> userBuilder_;
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.gcalsolaro.grpc.artifact.model.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public Builder setUser(com.gcalsolaro.grpc.artifact.model.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public Builder setUser(
        com.gcalsolaro.grpc.artifact.model.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public Builder mergeUser(com.gcalsolaro.grpc.artifact.model.User value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            com.gcalsolaro.grpc.artifact.model.User.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.User.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    public com.gcalsolaro.grpc.artifact.model.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.gcalsolaro.grpc.artifact.model.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.com.gcalsolaro.grpc.artifact.model.User user = 17;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gcalsolaro.grpc.artifact.model.User, com.gcalsolaro.grpc.artifact.model.User.Builder, com.gcalsolaro.grpc.artifact.model.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.gcalsolaro.grpc.artifact.model.User, com.gcalsolaro.grpc.artifact.model.User.Builder, com.gcalsolaro.grpc.artifact.model.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.gcalsolaro.grpc.artifact.model.Instance)
  }

  // @@protoc_insertion_point(class_scope:com.gcalsolaro.grpc.artifact.model.Instance)
  private static final com.gcalsolaro.grpc.artifact.model.Instance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gcalsolaro.grpc.artifact.model.Instance();
  }

  public static com.gcalsolaro.grpc.artifact.model.Instance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Instance>
      PARSER = new com.google.protobuf.AbstractParser<Instance>() {
    public Instance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Instance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Instance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Instance> getParserForType() {
    return PARSER;
  }

  public com.gcalsolaro.grpc.artifact.model.Instance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

