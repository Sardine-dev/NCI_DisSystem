package com.recruitment.grpc.job;

import com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchRequest;
import com.recruitment.grpc.job.JobMatchingOuterClass.JobMatchResponse;
import io.grpc.stub.StreamObserver;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JobMatchingImpl extends JobMatchingGrpc.JobMatchingImplBase {

    private static final Logger logger = Logger.getLogger(JobMatchingImpl.class.getName());

    static {
        try {
            FileHandler fh = new FileHandler("recruitment_system.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
        } catch (Exception e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    private final List<Job> jobDatabase = List.of(
        new Job("job-001", "Backend Developer", Set.of("Java", "Spring", "SQL")),
        new Job("job-002", "Frontend Developer", Set.of("React", "JavaScript", "HTML")),
        new Job("job-003", "Fullstack Developer", Set.of("Java", "React", "Docker", "CI/CD"))
    );

    @Override
    public void matchJob(JobMatchRequest request, StreamObserver<JobMatchResponse> responseObserver) {
        try {
            String candidateId = request.getCandidateId();
            Set<String> candidateSkills = new HashSet<>(request.getSkillsList());
            String desiredRole = request.getDesiredRole();

            logger.info("[JobMatching] Matching for candidate: " + candidateId);

            Job bestMatch = null;
            int highestScore = -1;

            for (Job job : jobDatabase) {
                if (!job.title.toLowerCase().contains(desiredRole.toLowerCase())) continue;

                Set<String> jobSkills = job.skills;
                Set<String> intersection = new HashSet<>(candidateSkills);
                intersection.retainAll(jobSkills);

                int score = intersection.size();

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

                logger.info("[JobMatching] Matched: " + bestMatch.title + " (score: " + matchScore + ")");
            } else {
                responseBuilder
                    .setMatchedJobId("none")
                    .setTitle("No matching job found")
                    .setMatchScore(0);

                logger.warning("[JobMatching] No matching job found.");
            }

            responseObserver.onNext(responseBuilder.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error in matchJob: ", e);
            responseObserver.onError(e);
        }
    }
    @Override
public StreamObserver<JobMatchRequest> streamJobMatches(final StreamObserver<JobMatchResponse> responseObserver) {
    return new StreamObserver<JobMatchRequest>() {
        @Override
        public void onNext(JobMatchRequest request) {
            String candidateId = request.getCandidateId();
            Set<String> candidateSkills = new HashSet<>(request.getSkillsList());
            String desiredRole = request.getDesiredRole();

            Job bestMatch = null;
            int highestScore = -1;

            for (Job job : jobDatabase) {
                if (!job.title.toLowerCase().contains(desiredRole.toLowerCase())) continue;

                Set<String> jobSkills = job.skills;
                Set<String> intersection = new HashSet<>(candidateSkills);
                intersection.retainAll(jobSkills);

                int score = intersection.size();
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
            } else {
                responseBuilder
                        .setMatchedJobId("none")
                        .setTitle("No matching job found")
                        .setMatchScore(0);
            }

            responseObserver.onNext(responseBuilder.build());
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("StreamJobMatches error: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            responseObserver.onCompleted();
        }
    };
}

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
