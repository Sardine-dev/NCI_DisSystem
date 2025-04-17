package com.recruitment.grpc.security;

import io.grpc.*;
import io.jsonwebtoken.*;
import javax.crypto.SecretKey;

public class JwtServerInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
        ServerCall<ReqT, RespT> call,
        Metadata headers,
        ServerCallHandler<ReqT, RespT> next
    ) {
        // Extract Authorization header
        String authHeader = headers.get(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER));

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            call.close(Status.UNAUTHENTICATED.withDescription("Missing or invalid Authorization header"), headers);
            return new ServerCall.Listener<>() {};
        }

        String token = authHeader.substring(7); // Remove "Bearer "

        try {
            // Get the shared signing key from JwtTestUtil
            SecretKey key = JwtTestUtil.getSigningKey();

            // Parse and validate the token
            Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token);

        } catch (JwtException e) {
            call.close(Status.UNAUTHENTICATED.withDescription("Invalid JWT: " + e.getMessage()), headers);
            return new ServerCall.Listener<>() {};
        }

        // Proceed with the call if the token is valid
        return next.startCall(call, headers);
    }
}
