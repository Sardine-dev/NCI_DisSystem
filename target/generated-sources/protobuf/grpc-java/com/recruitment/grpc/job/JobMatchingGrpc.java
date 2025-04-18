package com.recruitment.grpc.job;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: job_matching.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobMatchingGrpc {

  private JobMatchingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.recruitment.grpc.job.JobMatching";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
      com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getMatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MatchJob",
      requestType = com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest.class,
      responseType = com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
      com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getMatchJobMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest, com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getMatchJobMethod;
    if ((getMatchJobMethod = JobMatchingGrpc.getMatchJobMethod) == null) {
      synchronized (JobMatchingGrpc.class) {
        if ((getMatchJobMethod = JobMatchingGrpc.getMatchJobMethod) == null) {
          JobMatchingGrpc.getMatchJobMethod = getMatchJobMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest, com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobMatchingMethodDescriptorSupplier("MatchJob"))
              .build();
        }
      }
    }
    return getMatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
      com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getStreamJobMatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamJobMatches",
      requestType = com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest.class,
      responseType = com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
      com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getStreamJobMatchesMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest, com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> getStreamJobMatchesMethod;
    if ((getStreamJobMatchesMethod = JobMatchingGrpc.getStreamJobMatchesMethod) == null) {
      synchronized (JobMatchingGrpc.class) {
        if ((getStreamJobMatchesMethod = JobMatchingGrpc.getStreamJobMatchesMethod) == null) {
          JobMatchingGrpc.getStreamJobMatchesMethod = getStreamJobMatchesMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest, com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamJobMatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobMatchingMethodDescriptorSupplier("StreamJobMatches"))
              .build();
        }
      }
    }
    return getStreamJobMatchesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobMatchingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMatchingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMatchingStub>() {
        @java.lang.Override
        public JobMatchingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMatchingStub(channel, callOptions);
        }
      };
    return JobMatchingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobMatchingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMatchingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMatchingBlockingStub>() {
        @java.lang.Override
        public JobMatchingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMatchingBlockingStub(channel, callOptions);
        }
      };
    return JobMatchingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobMatchingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMatchingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMatchingFutureStub>() {
        @java.lang.Override
        public JobMatchingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMatchingFutureStub(channel, callOptions);
        }
      };
    return JobMatchingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void matchJob(com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMatchJobMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest> streamJobMatches(
        io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamJobMatchesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service JobMatching.
   */
  public static abstract class JobMatchingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return JobMatchingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service JobMatching.
   */
  public static final class JobMatchingStub
      extends io.grpc.stub.AbstractAsyncStub<JobMatchingStub> {
    private JobMatchingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMatchingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMatchingStub(channel, callOptions);
    }

    /**
     */
    public void matchJob(com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest> streamJobMatches(
        io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamJobMatchesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service JobMatching.
   */
  public static final class JobMatchingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<JobMatchingBlockingStub> {
    private JobMatchingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMatchingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMatchingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse matchJob(com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMatchJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service JobMatching.
   */
  public static final class JobMatchingFutureStub
      extends io.grpc.stub.AbstractFutureStub<JobMatchingFutureStub> {
    private JobMatchingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMatchingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMatchingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse> matchJob(
        com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMatchJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MATCH_JOB = 0;
  private static final int METHODID_STREAM_JOB_MATCHES = 1;

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
        case METHODID_MATCH_JOB:
          serviceImpl.matchJob((com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>) responseObserver);
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
        case METHODID_STREAM_JOB_MATCHES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamJobMatches(
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMatchJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
              com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>(
                service, METHODID_MATCH_JOB)))
        .addMethod(
          getStreamJobMatchesMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest,
              com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse>(
                service, METHODID_STREAM_JOB_MATCHES)))
        .build();
  }

  private static abstract class JobMatchingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobMatchingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.recruitment.grpc.job.JobMatchingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobMatching");
    }
  }

  private static final class JobMatchingFileDescriptorSupplier
      extends JobMatchingBaseDescriptorSupplier {
    JobMatchingFileDescriptorSupplier() {}
  }

  private static final class JobMatchingMethodDescriptorSupplier
      extends JobMatchingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    JobMatchingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (JobMatchingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobMatchingFileDescriptorSupplier())
              .addMethod(getMatchJobMethod())
              .addMethod(getStreamJobMatchesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
