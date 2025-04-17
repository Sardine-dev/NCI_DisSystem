package com.recruitment.grpc;

import com.recruitment.grpc.candidate.CandidateScreeningImpl;
import com.recruitment.grpc.interview.InterviewSchedulingImpl;
import com.recruitment.grpc.job.JobMatchingImpl;
import com.recruitment.grpc.security.JwtServerInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GrpcServer {

    private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    public static void main(String[] args) {
        setupLogger();
        try {
            Server server = ServerBuilder.forPort(50051)
                .addService(ServerInterceptors.intercept(new CandidateScreeningImpl(), new JwtServerInterceptor()))
                .addService(ServerInterceptors.intercept(new InterviewSchedulingImpl(), new JwtServerInterceptor()))
                .addService(ServerInterceptors.intercept(new JobMatchingImpl(), new JwtServerInterceptor()))
                .build();

            logger.info("gRPC server starting on port 50051...");
            server.start();
            logger.info("gRPC server started successfully.");
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            logger.log(Level.SEVERE, "Server failed: " + e.getMessage(), e);
        }
    }

    private static void setupLogger() {
        try {
            FileHandler fh = new FileHandler("logs/server.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            System.err.println("Failed to set up logger: " + e.getMessage());
        }
    }
}