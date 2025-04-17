package com.recruitment.grpc.job;

import io.grpc.stub.StreamObserver;

import java.util.*;

public class JobMatchingImpl extends JobMatchingGrpc.JobMatchingImplBase {

    // Simulated job database
    private final List<Job> jobDatabase = List.of(
        new Job("job-001", "Backend Developer", Set.of("Java", "Spring", "SQL")),
        new Job("job-002", "Frontend Developer", Set.of("React", "JavaScript", "HTML")),
        new Job("job-003", "Fullstack Developer", Set.of("Java", "React", "Docker", "CI/CD"))
    );

    @Override
    public void matchJob(JobMatchRequest request, StreamObserver<JobMatchResponse> responseObserver) {
        String candidateId = request.getCandidateId();
        Set<String> candidateSkills = new HashSet<>(request.getSkillsList());
        String desiredRole = request.getDesiredRole();

        System.out.println("[JobMatching] Matching for candidate: " + candidateId);

        Job bestMatch = null;
        int highestScore = -1;

        for (Job job : jobDatabase) {
            // Only match jobs related to desired role
            if (!job.title.toLowerCase().contains(desiredRole.toLowerCase())) continue;

            Set<String> jobSkills = job.skills;
            Set<String> intersection = new HashSet<>(candidateSkills);
            intersection.retainAll(jobSkills);

            int score = intersection.size(); // simple skill match count

            if (score > highestScore) {
                highestScore = score;
                bestMatch = job;
            }
        }

        JobMatchResponse.Builder responseBuilder = JobMatchResponse.newBuilder();

        if (bestMatch != null) {
            float matchScore = (float) highestScore / bestMatch.skills.size();

            responseBuilder
                .setMatchedJobId(bestMatch.id)
                .setTitle(bestMatch.title)
                .setMatchScore(matchScore);

            System.out.println("[JobMatching] Matched: " + bestMatch.title + " (score: " + matchScore + ")");
        } else {
            responseBuilder
                .setMatchedJobId("none")
                .setTitle("No matching job found")
                .setMatchScore(0);
        }

        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    // Inner class representing a job
    private static class Job {
        String id;
        String title;
        Set<String> skills;

        Job(String id, String title, Set<String> skills) {
            this.id = id;
            this.title = title;
            this.skills = skills;
        }
    }
}
