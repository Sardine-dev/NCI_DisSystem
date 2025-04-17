package com.recruitment.grpc.candidate;

import io.grpc.stub.StreamObserver;
import java.util.logging.Logger;

public class CandidateScreeningImpl extends CandidateScreeningGrpc.CandidateScreeningImplBase {

    private static final Logger logger = Logger.getLogger(CandidateScreeningImpl.class.getName());

    @Override
    public void submitResume(ResumeRequest request, StreamObserver<ScreeningResponse> responseObserver) {
        logger.info("[CandidateScreening] submitResume called. CandidateId=" + request.getCandidateId());
        try {
            ScreeningResponse response = ScreeningResponse.newBuilder()
                    .setCandidateId(request.getCandidateId())
                    .setStatus("OK") // Example status
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
            logger.info("[CandidateScreening] submitResume successful for CandidateId=" + request.getCandidateId());
        } catch (Exception e) {
            logger.severe("[CandidateScreening] Error in submitResume: " + e.getMessage());
            responseObserver.onError(e);
        }
    }

    @Override
    public void getCandidateScore(CandidateID request, StreamObserver<ScoreResponse> responseObserver) {
        logger.info("[CandidateScreening] getCandidateScore called. CandidateId=" + request.getCandidateId());
        try {
            // Dummy score calculation
            float score = 87.5f;

            ScoreResponse response = ScoreResponse.newBuilder()
                    .setCandidateId(request.getCandidateId())
                    .setScore(score)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
            logger.info("[CandidateScreening] getCandidateScore successful for CandidateId=" + request.getCandidateId());
        } catch (Exception e) {
            logger.severe("[CandidateScreening] Error in getCandidateScore: " + e.getMessage());
            responseObserver.onError(e);
        }
    }
}