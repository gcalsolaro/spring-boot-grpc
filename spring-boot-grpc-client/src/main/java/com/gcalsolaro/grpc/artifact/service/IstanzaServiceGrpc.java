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
    comments = "Source: IstanzaService.proto")
public final class IstanzaServiceGrpc {

  private IstanzaServiceGrpc() {}

  public static final String SERVICE_NAME = "com.gcalsolaro.grpc.artifact.service.IstanzaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gcalsolaro.grpc.artifact.service.IstanzaRequest,
      com.gcalsolaro.grpc.artifact.service.IstanzaResponse> METHOD_RECUPERA_ISTANZA_API =
      io.grpc.MethodDescriptor.<com.gcalsolaro.grpc.artifact.service.IstanzaRequest, com.gcalsolaro.grpc.artifact.service.IstanzaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.gcalsolaro.grpc.artifact.service.IstanzaService", "recuperaIstanzaApi"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gcalsolaro.grpc.artifact.service.IstanzaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gcalsolaro.grpc.artifact.service.IstanzaResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IstanzaServiceStub newStub(io.grpc.Channel channel) {
    return new IstanzaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IstanzaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IstanzaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IstanzaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IstanzaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IstanzaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void recuperaIstanzaApi(com.gcalsolaro.grpc.artifact.service.IstanzaRequest request,
        io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.IstanzaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECUPERA_ISTANZA_API, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_RECUPERA_ISTANZA_API,
            asyncUnaryCall(
              new MethodHandlers<
                com.gcalsolaro.grpc.artifact.service.IstanzaRequest,
                com.gcalsolaro.grpc.artifact.service.IstanzaResponse>(
                  this, METHODID_RECUPERA_ISTANZA_API)))
          .build();
    }
  }

  /**
   */
  public static final class IstanzaServiceStub extends io.grpc.stub.AbstractStub<IstanzaServiceStub> {
    private IstanzaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstanzaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstanzaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstanzaServiceStub(channel, callOptions);
    }

    /**
     */
    public void recuperaIstanzaApi(com.gcalsolaro.grpc.artifact.service.IstanzaRequest request,
        io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.IstanzaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECUPERA_ISTANZA_API, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IstanzaServiceBlockingStub extends io.grpc.stub.AbstractStub<IstanzaServiceBlockingStub> {
    private IstanzaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstanzaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstanzaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstanzaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gcalsolaro.grpc.artifact.service.IstanzaResponse recuperaIstanzaApi(com.gcalsolaro.grpc.artifact.service.IstanzaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECUPERA_ISTANZA_API, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IstanzaServiceFutureStub extends io.grpc.stub.AbstractStub<IstanzaServiceFutureStub> {
    private IstanzaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IstanzaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IstanzaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IstanzaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gcalsolaro.grpc.artifact.service.IstanzaResponse> recuperaIstanzaApi(
        com.gcalsolaro.grpc.artifact.service.IstanzaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECUPERA_ISTANZA_API, getCallOptions()), request);
    }
  }

  private static final int METHODID_RECUPERA_ISTANZA_API = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IstanzaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IstanzaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECUPERA_ISTANZA_API:
          serviceImpl.recuperaIstanzaApi((com.gcalsolaro.grpc.artifact.service.IstanzaRequest) request,
              (io.grpc.stub.StreamObserver<com.gcalsolaro.grpc.artifact.service.IstanzaResponse>) responseObserver);
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

  private static final class IstanzaServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gcalsolaro.grpc.artifact.service.IstanzaServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IstanzaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IstanzaServiceDescriptorSupplier())
              .addMethod(METHOD_RECUPERA_ISTANZA_API)
              .build();
        }
      }
    }
    return result;
  }
}
