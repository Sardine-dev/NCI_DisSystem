package com.recruitment.grpc;

import com.recruitment.grpc.candidate.CandidateID;
import com.recruitment.grpc.candidate.CandidateScreeningGrpc;
import com.recruitment.grpc.candidate.ScoreResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.ClientInterceptor;
import io.grpc.stub.MetadataUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.nio.charset.StandardCharsets;

public class GrpcClient {

    private static final String SECRET_KEY = "this-is-a-very-strong-secret-key-32-bytes!";

    public static void main(String[] args) {
        // JWT 생성
        String jwt = Jwts.builder()
                .setSubject("test-user")
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY.getBytes(StandardCharsets.UTF_8))
                .compact();

        System.out.println("Generated JWT: " + jwt);

        // Metadata 생성 및 JWT 추가
        Metadata metadata = new Metadata();
        Metadata.Key<String> AUTHORIZATION_KEY =
                Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        metadata.put(AUTHORIZATION_KEY, "Bearer " + jwt);

        // 인터셉터 생성
        ClientInterceptor interceptor = MetadataUtils.newAttachHeadersInterceptor(metadata);

        // gRPC 채널 생성
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // 인터셉터를 포함한 stub 생성
        CandidateScreeningGrpc.CandidateScreeningBlockingStub stub =
                CandidateScreeningGrpc.newBlockingStub(channel)
                        .withInterceptors(interceptor);

        // 요청 생성
        CandidateID request = CandidateID.newBuilder()
                .setCandidateId("test-001")
                .build();

        // 호출 및 응답 출력
        ScoreResponse response = stub.getCandidateScore(request);
        System.out.println("Score: " + response.getScore());

        // 채널 종료
        channel.shutdown();
    }
}
