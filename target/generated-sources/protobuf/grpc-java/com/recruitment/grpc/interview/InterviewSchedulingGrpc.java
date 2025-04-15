package com.recruitment.grpc.interview;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: interview_scheduling.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InterviewSchedulingGrpc {

  private InterviewSchedulingGrpc() {}

  public static final java.lang.String SERVICE_NAME = "InterviewScheduling";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.interview.AvailabilityRequest,
      com.recruitment.grpc.interview.AvailabilityResponse> getAddAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAvailability",
      requestType = com.recruitment.grpc.interview.AvailabilityRequest.class,
      responseType = com.recruitment.grpc.interview.AvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.interview.AvailabilityRequest,
      com.recruitment.grpc.interview.AvailabilityResponse> getAddAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.interview.AvailabilityRequest, com.recruitment.grpc.interview.AvailabilityResponse> getAddAvailabilityMethod;
    if ((getAddAvailabilityMethod = InterviewSchedulingGrpc.getAddAvailabilityMethod) == null) {
      synchronized (InterviewSchedulingGrpc.class) {
        if ((getAddAvailabilityMethod = InterviewSchedulingGrpc.getAddAvailabilityMethod) == null) {
          InterviewSchedulingGrpc.getAddAvailabilityMethod = getAddAvailabilityMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.interview.AvailabilityRequest, com.recruitment.grpc.interview.AvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.AvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.AvailabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewSchedulingMethodDescriptorSupplier("AddAvailability"))
              .build();
        }
      }
    }
    return getAddAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleRequest,
      com.recruitment.grpc.interview.ScheduleResponse> getScheduleInterviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleInterview",
      requestType = com.recruitment.grpc.interview.ScheduleRequest.class,
      responseType = com.recruitment.grpc.interview.ScheduleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleRequest,
      com.recruitment.grpc.interview.ScheduleResponse> getScheduleInterviewMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleRequest, com.recruitment.grpc.interview.ScheduleResponse> getScheduleInterviewMethod;
    if ((getScheduleInterviewMethod = InterviewSchedulingGrpc.getScheduleInterviewMethod) == null) {
      synchronized (InterviewSchedulingGrpc.class) {
        if ((getScheduleInterviewMethod = InterviewSchedulingGrpc.getScheduleInterviewMethod) == null) {
          InterviewSchedulingGrpc.getScheduleInterviewMethod = getScheduleInterviewMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.interview.ScheduleRequest, com.recruitment.grpc.interview.ScheduleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleInterview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.ScheduleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.ScheduleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewSchedulingMethodDescriptorSupplier("ScheduleInterview"))
              .build();
        }
      }
    }
    return getScheduleInterviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleQuery,
      com.recruitment.grpc.interview.ScheduleDetails> getGetScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSchedule",
      requestType = com.recruitment.grpc.interview.ScheduleQuery.class,
      responseType = com.recruitment.grpc.interview.ScheduleDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleQuery,
      com.recruitment.grpc.interview.ScheduleDetails> getGetScheduleMethod() {
    io.grpc.MethodDescriptor<com.recruitment.grpc.interview.ScheduleQuery, com.recruitment.grpc.interview.ScheduleDetails> getGetScheduleMethod;
    if ((getGetScheduleMethod = InterviewSchedulingGrpc.getGetScheduleMethod) == null) {
      synchronized (InterviewSchedulingGrpc.class) {
        if ((getGetScheduleMethod = InterviewSchedulingGrpc.getGetScheduleMethod) == null) {
          InterviewSchedulingGrpc.getGetScheduleMethod = getGetScheduleMethod =
              io.grpc.MethodDescriptor.<com.recruitment.grpc.interview.ScheduleQuery, com.recruitment.grpc.interview.ScheduleDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.ScheduleQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.recruitment.grpc.interview.ScheduleDetails.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewSchedulingMethodDescriptorSupplier("GetSchedule"))
              .build();
        }
      }
    }
    return getGetScheduleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterviewSchedulingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingStub>() {
        @java.lang.Override
        public InterviewSchedulingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewSchedulingStub(channel, callOptions);
        }
      };
    return InterviewSchedulingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterviewSchedulingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingBlockingStub>() {
        @java.lang.Override
        public InterviewSchedulingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewSchedulingBlockingStub(channel, callOptions);
        }
      };
    return InterviewSchedulingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterviewSchedulingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewSchedulingFutureStub>() {
        @java.lang.Override
        public InterviewSchedulingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewSchedulingFutureStub(channel, callOptions);
        }
      };
    return InterviewSchedulingFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addAvailability(com.recruitment.grpc.interview.AvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.AvailabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAvailabilityMethod(), responseObserver);
    }

    /**
     */
    default void scheduleInterview(com.recruitment.grpc.interview.ScheduleRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleInterviewMethod(), responseObserver);
    }

    /**
     */
    default void getSchedule(com.recruitment.grpc.interview.ScheduleQuery request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleDetails> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScheduleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InterviewScheduling.
   */
  public static abstract class InterviewSchedulingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InterviewSchedulingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InterviewScheduling.
   */
  public static final class InterviewSchedulingStub
      extends io.grpc.stub.AbstractAsyncStub<InterviewSchedulingStub> {
    private InterviewSchedulingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewSchedulingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewSchedulingStub(channel, callOptions);
    }

    /**
     */
    public void addAvailability(com.recruitment.grpc.interview.AvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.AvailabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scheduleInterview(com.recruitment.grpc.interview.ScheduleRequest request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleInterviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchedule(com.recruitment.grpc.interview.ScheduleQuery request,
        io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleDetails> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScheduleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InterviewScheduling.
   */
  public static final class InterviewSchedulingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InterviewSchedulingBlockingStub> {
    private InterviewSchedulingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewSchedulingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewSchedulingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.recruitment.grpc.interview.AvailabilityResponse addAvailability(com.recruitment.grpc.interview.AvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAvailabilityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.recruitment.grpc.interview.ScheduleResponse scheduleInterview(com.recruitment.grpc.interview.ScheduleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleInterviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.recruitment.grpc.interview.ScheduleDetails getSchedule(com.recruitment.grpc.interview.ScheduleQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScheduleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InterviewScheduling.
   */
  public static final class InterviewSchedulingFutureStub
      extends io.grpc.stub.AbstractFutureStub<InterviewSchedulingFutureStub> {
    private InterviewSchedulingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewSchedulingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewSchedulingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.interview.AvailabilityResponse> addAvailability(
        com.recruitment.grpc.interview.AvailabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAvailabilityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.interview.ScheduleResponse> scheduleInterview(
        com.recruitment.grpc.interview.ScheduleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleInterviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.recruitment.grpc.interview.ScheduleDetails> getSchedule(
        com.recruitment.grpc.interview.ScheduleQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScheduleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_AVAILABILITY = 0;
  private static final int METHODID_SCHEDULE_INTERVIEW = 1;
  private static final int METHODID_GET_SCHEDULE = 2;

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
        case METHODID_ADD_AVAILABILITY:
          serviceImpl.addAvailability((com.recruitment.grpc.interview.AvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.AvailabilityResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_INTERVIEW:
          serviceImpl.scheduleInterview((com.recruitment.grpc.interview.ScheduleRequest) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULE:
          serviceImpl.getSchedule((com.recruitment.grpc.interview.ScheduleQuery) request,
              (io.grpc.stub.StreamObserver<com.recruitment.grpc.interview.ScheduleDetails>) responseObserver);
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
          getAddAvailabilityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.interview.AvailabilityRequest,
              com.recruitment.grpc.interview.AvailabilityResponse>(
                service, METHODID_ADD_AVAILABILITY)))
        .addMethod(
          getScheduleInterviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.interview.ScheduleRequest,
              com.recruitment.grpc.interview.ScheduleResponse>(
                service, METHODID_SCHEDULE_INTERVIEW)))
        .addMethod(
          getGetScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.recruitment.grpc.interview.ScheduleQuery,
              com.recruitment.grpc.interview.ScheduleDetails>(
                service, METHODID_GET_SCHEDULE)))
        .build();
  }

  private static abstract class InterviewSchedulingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterviewSchedulingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.recruitment.grpc.interview.InterviewSchedulingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterviewScheduling");
    }
  }

  private static final class InterviewSchedulingFileDescriptorSupplier
      extends InterviewSchedulingBaseDescriptorSupplier {
    InterviewSchedulingFileDescriptorSupplier() {}
  }

  private static final class InterviewSchedulingMethodDescriptorSupplier
      extends InterviewSchedulingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InterviewSchedulingMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InterviewSchedulingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterviewSchedulingFileDescriptorSupplier())
              .addMethod(getAddAvailabilityMethod())
              .addMethod(getScheduleInterviewMethod())
              .addMethod(getGetScheduleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
