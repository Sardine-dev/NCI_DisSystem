package com.recruitment.grpc.interview;

import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.AvailabilityRequest;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.AvailabilityResponse;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleDetails;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleQuery;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleRequest;
import com.recruitment.grpc.interview.InterviewSchedulingOuterClass.ScheduleResponse;
import io.grpc.stub.StreamObserver;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterviewSchedulingImpl extends InterviewSchedulingGrpc.InterviewSchedulingImplBase {

    private static final Logger logger = Logger.getLogger(InterviewSchedulingImpl.class.getName());

    // In-memory storage for availability and schedule
    private final Map<String, List<String>> availabilityMap = new HashMap<>();
    private final Map<String, List<String>> scheduleMap = new HashMap<>();

    @Override
    public void addAvailability(AvailabilityRequest request, StreamObserver<AvailabilityResponse> responseObserver) {
        try {
            String userId = request.getUserId();
            List<String> times = request.getAvailableTimesList();

            availabilityMap.put(userId, new ArrayList<>(times));
            logger.info("[AddAvailability] " + userId + " available times: " + times);

            AvailabilityResponse response = AvailabilityResponse.newBuilder()
                    .setStatus("Availability saved")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error adding availability", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void scheduleInterview(ScheduleRequest request, StreamObserver<ScheduleResponse> responseObserver) {
        try {
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

            logger.info("[ScheduleInterview] Scheduled time: " + scheduledTime);

            ScheduleResponse response = ScheduleResponse.newBuilder()
                    .setStatus("Scheduled")
                    .setScheduledTime(scheduledTime)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error scheduling interview", e);
            responseObserver.onError(e);
        }
    }

    @Override
    public void getSchedule(ScheduleQuery request, StreamObserver<ScheduleDetails> responseObserver) {
        try {
            String userId = request.getUserId();
            List<String> scheduledTimes = scheduleMap.getOrDefault(userId, new ArrayList<>());

            logger.info("[GetSchedule] " + userId + "'s schedule: " + scheduledTimes);

            ScheduleDetails response = ScheduleDetails.newBuilder()
                    .setUserId(userId)
                    .addAllScheduledTimes(scheduledTimes)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error getting schedule", e);
            responseObserver.onError(e);
        }
    }
    @Override
public StreamObserver<AvailabilityRequest> bulkAddAvailability(final StreamObserver<AvailabilityResponse> responseObserver) {
    return new StreamObserver<AvailabilityRequest>() {
        @Override
        public void onNext(AvailabilityRequest request) {
            String userId = request.getUserId();
            List<String> times = request.getAvailableTimesList();
            availabilityMap.put(userId, new ArrayList<>(times));
            System.out.println("[BulkAddAvailability] Added: " + userId + " -> " + times);
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("BulkAddAvailability error: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            AvailabilityResponse response = AvailabilityResponse.newBuilder()
                    .setStatus("All availabilities saved")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    };
}
}
