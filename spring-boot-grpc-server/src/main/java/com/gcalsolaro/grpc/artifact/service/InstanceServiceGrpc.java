package com.gcalsolaro.grpc.artifact.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: InstanceService.proto")
public final class InstanceServiceGrpc {

  private InstanceServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gcalsolaro.grpc.artifact.service.InstanceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gcalsolaro.grpc.artifact.service.InstanceRequest,
      com.gcalsolaro.grpc.artifact.service.InstanceResponse> METHOD_FIND_INSTANCE_API =
      io.grpc.MethodDescriptor.<com.gcalsolaro.grpc.artifact.service.InstanceRequest, com.gcalsolaro.grpc.artifact.service.InstanceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.gcalsolaro.grpc.artifact.service.InstanceService", "findInstanceApi"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gcalsolaro.grpc.artifact.service.InstanceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gcalsolaro.grpc.artifact.service.InstanceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceServiceStub newStub(io.grpc.Channel channel) {
    return new InstanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InstanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findInstanceApi(com.gcalsolaro.grpc.artifact.service.InstanceRequest request,
        io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.InstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_INSTANCE_API, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIND_INSTANCE_API,
            asyncUnaryCall(
              new MethodHandlers<
                com.gcalsolaro.grpc.artifact.service.InstanceRequest,
                com.gcalsolaro.grpc.artifact.service.InstanceResponse>(
                  this, METHODID_FIND_INSTANCE_API)))
          .build();
    }
  }

  /**
   */
  public static final class InstanceServiceStub extends io.grpc.stub.AbstractStub<InstanceServiceStub> {
    private InstanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void findInstanceApi(com.gcalsolaro.grpc.artifact.service.InstanceRequest request,
        io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.InstanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_INSTANCE_API, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstanceServiceBlockingStub extends io.grpc.stub.AbstractStub<InstanceServiceBlockingStub> {
    private InstanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gcalsolaro.grpc.artifact.service.InstanceResponse findInstanceApi(com.gcalsolaro.grpc.artifact.service.InstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_INSTANCE_API, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstanceServiceFutureStub extends io.grpc.stub.AbstractStub<InstanceServiceFutureStub> {
    private InstanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gcalsolaro.grpc.artifact.service.InstanceResponse> findInstanceApi(
        com.gcalsolaro.grpc.artifact.service.InstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_INSTANCE_API, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_INSTANCE_API = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_INSTANCE_API:
          serviceImpl.findInstanceApi((com.gcalsolaro.grpc.artifact.service.InstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.InstanceResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class InstanceServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gcalsolaro.grpc.artifact.service.InstanceServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InstanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceServiceDescriptorSupplier())
              .addMethod(METHOD_FIND_INSTANCE_API)
              .build();
        }
      }
    }
    return result;
  }
}
