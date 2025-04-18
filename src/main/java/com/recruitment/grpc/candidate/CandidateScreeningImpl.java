package com.recruitment.grpc.candidate;

import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.CandidateID;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.CandidateScoreRequest;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ResumeRequest;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ScoreResponse;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ScreeningResponse;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
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
    @Override
public void streamCandidateScores(CandidateScoreRequest request, StreamObserver<ScoreResponse> responseObserver) {
    for (String candidateId : request.getCandidateIdsList()) {
        float score = 75.0f + (float)(Math.random() * 25); // Dummy score between 75-100
        ScoreResponse response = ScoreResponse.newBuilder()
                .setCandidateId(candidateId)
                .setScore(score)
                .build();
        responseObserver.onNext(response);
    }
    responseObserver.onCompleted();
}
@Override
public StreamObserver<ResumeRequest> submitMultipleResumes(final StreamObserver<ScreeningResponse> responseObserver) {
    return new StreamObserver<ResumeRequest>() {
        List<String> receivedCandidates = new ArrayList<>();

        @Override
        public void onNext(ResumeRequest value) {
            receivedCandidates.add(value.getCandidateId());
            System.out.println("[Client Streaming] Received Resume for: " + value.getCandidateId());
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("[Client Streaming] Error: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            ScreeningResponse response = ScreeningResponse.newBuilder()
                .setCandidateId(String.join(",", receivedCandidates))
                .setStatus("All resumes processed successfully!")
                .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    };
}
}