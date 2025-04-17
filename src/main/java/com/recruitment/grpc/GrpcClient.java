package com.recruitment.grpc;

import com.recruitment.grpc.candidate.*;
import com.recruitment.grpc.interview.*;
import com.recruitment.grpc.job.JobMatchRequest;
import com.recruitment.grpc.job.JobMatchResponse;
import com.recruitment.grpc.job.JobMatchingGrpc;
import com.recruitment.grpc.security.JwtTestUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class GrpcClient {

    private ManagedChannel channel=null;
    private CandidateScreeningGrpc.CandidateScreeningBlockingStub candidateStub =null;
    private InterviewSchedulingGrpc.InterviewSchedulingBlockingStub interviewStub =null;
    private JobMatchingGrpc.JobMatchingBlockingStub jobStub =null;

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
    }

    public double getCandidateScore(String candidateId) {
        CandidateID request = CandidateID.newBuilder().setCandidateId(candidateId).build();
        ScoreResponse response = candidateStub.getCandidateScore(request);
        
        return response.getScore();
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

    public void shutdown() {
        if (channel != null) {
            channel.shutdown();
        }
    }
}