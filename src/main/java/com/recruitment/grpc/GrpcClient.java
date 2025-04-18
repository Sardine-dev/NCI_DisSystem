package com.recruitment.grpc;

import com.recruitment.grpc.candidate.*;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.CandidateID;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.CandidateScoreRequest;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ResumeRequest;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ScoreResponse;
import com.recruitment.grpc.candidate.CandidateScreeningOuterClass.ScreeningResponse;
import com.recruitment.grpc.interview.*;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.AvailabilityRequest;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleDetails;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleQuery;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleRequest;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleResponse;

import com.recruitment.grpc.job.JobMatchingGrpc;
import com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest;
import com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse;
import com.recruitment.grpc.security.JwtTestUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextArea;


public class GrpcClient {

    private ManagedChannel channel=null;
    private CandidateScreeningGrpc.CandidateScreeningBlockingStub candidateStub =null;
    private InterviewSchedulingGrpc.InterviewSchedulingBlockingStub interviewStub =null;
    private JobMatchingGrpc.JobMatchingBlockingStub jobStub =null;
    private CandidateScreeningGrpc.CandidateScreeningStub candidateAsyncStub = null;
    private JobMatchingGrpc.JobMatchingStub jobAsyncStub;

    public GrpcClient() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        String token = JwtTestUtil.createTestToken();
        Metadata metadata = new Metadata();
        metadata.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + token);

        candidateStub = CandidateScreeningGrpc.newBlockingStub(channel)
                .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));

        interviewStub = InterviewSchedulingGrpc.newBlockingStub(channel)
                .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));

        jobStub = JobMatchingGrpc.newBlockingStub(channel)
                .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));
        candidateStub = CandidateScreeningGrpc.newBlockingStub(channel)
    .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));

candidateAsyncStub = CandidateScreeningGrpc.newStub(channel)
    .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));
jobAsyncStub = JobMatchingGrpc.newStub(channel)
    .withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));

    }

    public void streamCandidateScores(List<String> candidateIds, JTextArea resultArea) {
    try {
        for (String id : candidateIds) {
            CandidateScoreRequest request = CandidateScoreRequest.newBuilder()
            .addCandidateIds(id) // add로 추가해야 함!
            .build();

            candidateAsyncStub.streamCandidateScores(request, new StreamObserver<ScoreResponse>() {
                @Override
                public void onNext(ScoreResponse value) {
                    System.out.println("[Streaming] Score received: " + value.getScore());
                    resultArea.append("[Streaming] Score received: " + value.getScore() + "\n");
                }

                @Override
                public void onError(Throwable t) {
                    System.err.println("[Streaming] Error: " + t.getMessage());
                    resultArea.append("[Streaming] Error: " + t.getMessage() + "\n");
                }

                @Override
                public void onCompleted() {
                    System.out.println("[Streaming] Completed for candidate " + id);
                    resultArea.append("[Streaming] Completed for candidate " + id + "\n");
                }
            });
        }
    } catch (Exception e) {
        System.err.println("[Streaming] Exception: " + e.getMessage());
        resultArea.append("[Streaming] Exception: " + e.getMessage() + "\n");
    }
}

    public void addAvailability(String userId, String role, java.util.List<String> times) {
        AvailabilityRequest request = AvailabilityRequest.newBuilder()
                .setUserId(userId)
                .setRole(role)
                .addAllAvailableTimes(times)
                .build();
        interviewStub.addAvailability(request);
    }

    public String scheduleInterview(String candidateId, String interviewerId) {
        ScheduleRequest request = ScheduleRequest.newBuilder()
                .setCandidateId(candidateId)
                .setInterviewerId(interviewerId)
                .build();
        ScheduleResponse response = interviewStub.scheduleInterview(request);
        return response.getScheduledTime();
    }

    public java.util.List<String> getSchedule(String userId) {
        ScheduleQuery query = ScheduleQuery.newBuilder()
                .setUserId(userId)
                .build();
        ScheduleDetails details = interviewStub.getSchedule(query);
        return details.getScheduledTimesList();
    }

    public JobMatchResponse matchJob(String candidateId, java.util.List<String> skills, String desiredRole) {
        JobMatchRequest request = JobMatchRequest.newBuilder()
                .setCandidateId(candidateId)
                .addAllSkills(skills)
                .setDesiredRole(desiredRole)
                .build();
        return jobStub.matchJob(request);
    }
    
public void streamCandidateScores() {
    try {
        
         CandidateScoreRequest request = CandidateScoreRequest.newBuilder()
            .addCandidateIds("test-001") // add로 추가해야 함!
            .build();
        
        candidateAsyncStub.streamCandidateScores(request, new StreamObserver<ScoreResponse>() {
            @Override
            public void onNext(ScoreResponse value) {
                System.out.println("[Streaming] Score received: " + value.getScore());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("[Streaming] Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("[Streaming] Streaming Completed");
            }
        });
    } catch (Exception e) {
        System.err.println("[Streaming] Exception: " + e.getMessage());
    }
}
public void submitMultipleResumes(List<String> candidateIds) {
    StreamObserver<ResumeRequest> requestObserver = candidateAsyncStub.submitMultipleResumes(new StreamObserver<ScreeningResponse>() {
        @Override
        public void onNext(ScreeningResponse value) {
            System.out.println("[Client Streaming] Server Response: " + value.getStatus());
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("[Client Streaming] Error: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            System.out.println("[Client Streaming] Completed");
        }
    });

    try {
        for (String id : candidateIds) {
            ResumeRequest request = ResumeRequest.newBuilder()
                .setCandidateId(id)
                .build();
            requestObserver.onNext(request);
        }
        requestObserver.onCompleted();
    } catch (Exception e) {
        requestObserver.onError(e);
    }
}

public void bulkAddAvailability(JTextArea resultArea) {
    try {
        addAvailability("candidate-123", "candidate", Arrays.asList("2025-04-14T10:00", "2025-04-14T11:00"));
        addAvailability("interviewer-456", "interviewer", Arrays.asList("2025-04-14T11:00", "2025-04-14T12:00"));

        resultArea.append("[Bulk Add Availability] Success\n");
    } catch (Exception e) {
        resultArea.append("[Bulk Add Availability] Error: " + e.getMessage() + "\n");
    }
}

public int getCandidateScore(String candidateId) {
    CandidateID request = CandidateID.newBuilder()
            .setCandidateId(candidateId)
            .build();
    ScoreResponse response = candidateStub.getCandidateScore(request);
    return (int) response.getScore();
}

public void streamJobMatches(List<String> skills, JTextArea resultArea) {
    StreamObserver<JobMatchRequest> requestObserver = jobAsyncStub.streamJobMatches(
        new StreamObserver<JobMatchResponse>() {
            @Override
            public void onNext(JobMatchResponse value) {
                resultArea.append("[JobMatch Streaming Response] " + value.getTitle() + " (Score: " + value.getMatchScore() + ")\n");
            }

            @Override
            public void onError(Throwable t) {
                resultArea.append("[JobMatch Streaming Error] " + t.getMessage() + "\n");
            }

            @Override
            public void onCompleted() {
                resultArea.append("[JobMatch Streaming Completed]\n");
            }
        }
    );

    // 요청 여러개 보내기 예시
    for (String skill : skills) {
        JobMatchRequest request = JobMatchRequest.newBuilder()
                .setCandidateId("candidate-stream")
                .addSkills(skill)
                .setDesiredRole("Developer")
                .build();
        requestObserver.onNext(request);
    }

    // 요청 완료
    requestObserver.onCompleted();
}
    public void shutdown() {
        if (channel != null) {
            channel.shutdown();
        }
    }
}