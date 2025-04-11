package com.recruitment.grpc.candidate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: candidate_screening.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CandidateScreeningGrpc {

  private CandidateScreeningGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CandidateScreening";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.ResumeRequest,
      com.recruitment.grpc.candidate.ScreeningResponse> getSubmitResumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitResume",
      requestType = com.recruitment.grpc.candidate.ResumeRequest.class,
      responseType = com.recruitment.grpc.candidate.ScreeningResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.ResumeRequest,
      com.recruitment.grpc.candidate.ScreeningResponse> getSubmitResumeMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.ResumeRequest, com.recruitment.grpc.candidate.ScreeningResponse> getSubmitResumeMethod;
    if ((getSubmitResumeMethod = CandidateScreeningGrpc.getSubmitResumeMethod) == null) {
      synchronized (CandidateScreeningGrpc.class) {
        if ((getSubmitResumeMethod = CandidateScreeningGrpc.getSubmitResumeMethod) == null) {
          CandidateScreeningGrpc.getSubmitResumeMethod = getSubmitResumeMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.candidate.ResumeRequest, com.recruitment.grpc.candidate.ScreeningResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitResume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.candidate.ResumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.candidate.ScreeningResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CandidateScreeningMethodDescriptorSupplier("SubmitResume"))
              .build();
        }
      }
    }
    return getSubmitResumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.CandidateID,
      com.recruitment.grpc.candidate.ScoreResponse> getGetCandidateScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCandidateScore",
      requestType = com.recruitment.grpc.candidate.CandidateID.class,
      responseType = com.recruitment.grpc.candidate.ScoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.CandidateID,
      com.recruitment.grpc.candidate.ScoreResponse> getGetCandidateScoreMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.candidate.CandidateID, com.recruitment.grpc.candidate.ScoreResponse> getGetCandidateScoreMethod;
    if ((getGetCandidateScoreMethod = CandidateScreeningGrpc.getGetCandidateScoreMethod) == null) {
      synchronized (CandidateScreeningGrpc.class) {
        if ((getGetCandidateScoreMethod = CandidateScreeningGrpc.getGetCandidateScoreMethod) == null) {
          CandidateScreeningGrpc.getGetCandidateScoreMethod = getGetCandidateScoreMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.candidate.CandidateID, com.recruitment.grpc.candidate.ScoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCandidateScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.candidate.CandidateID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.candidate.ScoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CandidateScreeningMethodDescriptorSupplier("GetCandidateScore"))
              .build();
        }
      }
    }
    return getGetCandidateScoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CandidateScreeningStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningStub>() {
        @java.lang.Override
        public CandidateScreeningStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CandidateScreeningStub(channel, callOptions);
        }
      };
    return CandidateScreeningStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CandidateScreeningBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningBlockingStub>() {
        @java.lang.Override
        public CandidateScreeningBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CandidateScreeningBlockingStub(channel, callOptions);
        }
      };
    return CandidateScreeningBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CandidateScreeningFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CandidateScreeningFutureStub>() {
        @java.lang.Override
        public CandidateScreeningFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CandidateScreeningFutureStub(channel, callOptions);
        }
      };
    return CandidateScreeningFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void submitResume(com.recruitment.grpc.candidate.ResumeRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScreeningResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitResumeMethod(), responseObserver);
    }

    /**
     */
    default void getCandidateScore(com.recruitment.grpc.candidate.CandidateID request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCandidateScoreMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CandidateScreening.
   */
  public static abstract class CandidateScreeningImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CandidateScreeningGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CandidateScreening.
   */
  public static final class CandidateScreeningStub
      extends io.grpc.stub.AbstractAsyncStub<CandidateScreeningStub> {
    private CandidateScreeningStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CandidateScreeningStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CandidateScreeningStub(channel, callOptions);
    }

    /**
     */
    public void submitResume(com.recruitment.grpc.candidate.ResumeRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScreeningResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitResumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCandidateScore(com.recruitment.grpc.candidate.CandidateID request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCandidateScoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CandidateScreening.
   */
  public static final class CandidateScreeningBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CandidateScreeningBlockingStub> {
    private CandidateScreeningBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CandidateScreeningBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CandidateScreeningBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.recruitment.grpc.candidate.ScreeningResponse submitResume(com.recruitment.grpc.candidate.ResumeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitResumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.recruitment.grpc.candidate.ScoreResponse getCandidateScore(com.recruitment.grpc.candidate.CandidateID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCandidateScoreMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CandidateScreening.
   */
  public static final class CandidateScreeningFutureStub
      extends io.grpc.stub.AbstractFutureStub<CandidateScreeningFutureStub> {
    private CandidateScreeningFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CandidateScreeningFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CandidateScreeningFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.candidate.ScreeningResponse> submitResume(
        com.recruitment.grpc.candidate.ResumeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitResumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.candidate.ScoreResponse> getCandidateScore(
        com.recruitment.grpc.candidate.CandidateID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCandidateScoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_RESUME = 0;
  private static final int METHODID_GET_CANDIDATE_SCORE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_RESUME:
          serviceImpl.submitResume((com.recruitment.grpc.candidate.ResumeRequest) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScreeningResponse>) responseObserver);
          break;
        case METHODID_GET_CANDIDATE_SCORE:
          serviceImpl.getCandidateScore((com.recruitment.grpc.candidate.CandidateID) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.candidate.ScoreResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubmitResumeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.candidate.ResumeRequest,
              com.recruitment.grpc.candidate.ScreeningResponse>(
                service, METHODID_SUBMIT_RESUME)))
        .addMethod(
          getGetCandidateScoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.candidate.CandidateID,
              com.recruitment.grpc.candidate.ScoreResponse>(
                service, METHODID_GET_CANDIDATE_SCORE)))
        .build();
  }

  private static abstract class CandidateScreeningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CandidateScreeningBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.recruitment.grpc.candidate.CandidateScreeningProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CandidateScreening");
    }
  }

  private static final class CandidateScreeningFileDescriptorSupplier
      extends CandidateScreeningBaseDescriptorSupplier {
    CandidateScreeningFileDescriptorSupplier() {}
  }

  private static final class CandidateScreeningMethodDescriptorSupplier
      extends CandidateScreeningBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CandidateScreeningMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CandidateScreeningGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CandidateScreeningFileDescriptorSupplier())
              .addMethod(getSubmitResumeMethod())
              .addMethod(getGetCandidateScoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
