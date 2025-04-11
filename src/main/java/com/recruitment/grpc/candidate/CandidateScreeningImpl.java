package com.recruitment.grpc.candidate;

import io.grpc.stub.StreamObserver;

public class CandidateScreeningImpl extends CandidateScreeningGrpc.CandidateScreeningImplBase {

    @Override
    public void submitResume(ResumeRequest request, StreamObserver<ScreeningResponse> responseObserver) {
        System.out.println("📥 이력서 제출됨: " + request.getCandidateId());

        ScreeningResponse response = ScreeningResponse.newBuilder()
                .setCandidateId(request.getCandidateId())
                .setStatus("OK") // 또는 처리 결과
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCandidateScore(CandidateID request, StreamObserver<ScoreResponse> responseObserver) {
        System.out.println("📊 점수 요청: " + request.getCandidateId());

        // 예시 점수 계산 (더미 데이터)
        float score = 87.5f;

        ScoreResponse response = ScoreResponse.newBuilder()
                .setCandidateId(request.getCandidateId())
                .setScore(score)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
