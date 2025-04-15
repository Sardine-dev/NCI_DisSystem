package com.recruitment.grpc;

import com.recruitment.grpc.candidate.CandidateScreeningImpl;
import com.recruitment.grpc.interview.InterviewSchedulingImpl;
import com.recruitment.grpc.security.JwtServerInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50051)
            .addService(ServerInterceptors.intercept(new CandidateScreeningImpl(), new JwtServerInterceptor()))
            .addService(ServerInterceptors.intercept(new InterviewSchedulingImpl(), new JwtServerInterceptor()))
            .build();

        System.out.println("✅ gRPC 서버 시작됨: 포트 50051");
        server.start();
        server.awaitTermination();
    }
}
