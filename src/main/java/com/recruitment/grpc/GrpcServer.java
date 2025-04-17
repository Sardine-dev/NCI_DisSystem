package com.recruitment.grpc;

import com.recruitment.grpc.candidate.CandidateScreeningImpl;
import com.recruitment.grpc.interview.InterviewSchedulingImpl;
import com.recruitment.grpc.job.JobMatchingImpl;
import com.recruitment.grpc.security.JwtServerInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50051)
            .addService(ServerInterceptors.intercept(new CandidateScreeningImpl(), new JwtServerInterceptor()))
            .addService(ServerInterceptors.intercept(new InterviewSchedulingImpl(), new JwtServerInterceptor()))
            .addService(ServerInterceptors.intercept(new JobMatchingImpl(), new JwtServerInterceptor()))
            .build();

        System.out.println("✅ gRPC server started: port 50051");
        server.start();
        server.awaitTermination();
    }
}
