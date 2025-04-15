package com.recruitment.grpc.interview;

import io.grpc.stub.StreamObserver;
import java.util.*;

public class InterviewSchedulingImpl extends InterviewSchedulingGrpc.InterviewSchedulingImplBase {

    // In-memory storage for availability and schedule
    private final Map<String, List<String>> availabilityMap = new HashMap<>();
    private final Map<String, List<String>> scheduleMap = new HashMap<>();

    @Override
    public void addAvailability(AvailabilityRequest request, StreamObserver<AvailabilityResponse> responseObserver) {
        String userId = request.getUserId();
        List<String> times = request.getAvailableTimesList();

        availabilityMap.put(userId, new ArrayList<>(times));
        System.out.println("[AddAvailability] " + userId + " available times: " + times);

        AvailabilityResponse response = AvailabilityResponse.newBuilder()
                .setStatus("Availability saved")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void scheduleInterview(ScheduleRequest request, StreamObserver<ScheduleResponse> responseObserver) {
        String candidateId = request.getCandidateId();
        String interviewerId = request.getInterviewerId();

        List<String> candidateTimes = availabilityMap.getOrDefault(candidateId, new ArrayList<>());
        List<String> interviewerTimes = availabilityMap.getOrDefault(interviewerId, new ArrayList<>());

        String scheduledTime = candidateTimes.stream()
                .filter(interviewerTimes::contains)
                .findFirst()
                .orElse("No common time available");

        if (!scheduledTime.equals("No common time available")) {
            scheduleMap.computeIfAbsent(candidateId, k -> new ArrayList<>()).add(scheduledTime);
            scheduleMap.computeIfAbsent(interviewerId, k -> new ArrayList<>()).add(scheduledTime);
        }

        System.out.println("[ScheduleInterview] Scheduled time: " + scheduledTime);

        ScheduleResponse response = ScheduleResponse.newBuilder()
                .setStatus("Scheduled")
                .setScheduledTime(scheduledTime)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getSchedule(ScheduleQuery request, StreamObserver<ScheduleDetails> responseObserver) {
        String userId = request.getUserId();
        List<String> scheduledTimes = scheduleMap.getOrDefault(userId, new ArrayList<>());

        System.out.println("[GetSchedule] " + userId + "'s schedule: " + scheduledTimes);

        ScheduleDetails response = ScheduleDetails.newBuilder()
                .setUserId(userId)
                .addAllScheduledTimes(scheduledTimes)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
