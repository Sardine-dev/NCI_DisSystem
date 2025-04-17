package com.recruitment.grpc.security;

import io.grpc.*;
import io.jsonwebtoken.*;
import javax.crypto.SecretKey;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class JwtServerInterceptor implements ServerInterceptor {

    private static final Logger logger = Logger.getLogger(JwtServerInterceptor.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("recruitment_system.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            System.err.println("Failed to set up logger in JwtServerInterceptor: " + e.getMessage());
        }
    }

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
        ServerCall<ReqT, RespT> call,
        Metadata headers,
        ServerCallHandler<ReqT, RespT> next
    ) {
        String authHeader = headers.get(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER));

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            logger.warning("Missing or invalid Authorization header.");
            call.close(Status.UNAUTHENTICATED.withDescription("Missing or invalid Authorization header"), headers);
            return new ServerCall.Listener<>() {};
        }

        String token = authHeader.substring(7);

        try {
            SecretKey key = JwtTestUtil.getSigningKey();

            Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token);

            logger.info("JWT authentication succeeded.");

        } catch (JwtException e) {
            logger.warning("Invalid JWT token: " + e.getMessage());
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid JWT: " + e.getMessage()), headers);
            return new ServerCall.Listener<>() {};
        } catch (Exception e) {
            logger.severe("Unexpected error during JWT verification: " + e.getMessage());
            call.close(Status.INTERNAL.withDescription("Server error during authentication"), headers);
            return new ServerCall.Listener<>() {};
        }

        return next.startCall(call, headers);
    }
}
