package com.recruitment.grpc;

import com.recruitment.grpc.candidate.CandidateScreeningImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(50051)
                .addService(new CandidateScreeningImpl())
                .build();

        System.out.println("✅ gRPC 서버 시작됨: 포트 50051");
        server.start();
        server.awaitTermination();
    }
}
