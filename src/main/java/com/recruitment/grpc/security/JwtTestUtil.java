package com.recruitment.grpc.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class JwtTestUtil {

    // Shared secret key (must be at least 32 bytes for HS256)
    private static final String SECRET_KEY = "this-is-a-very-strong-secret-key-32-bytes!";
    private static final SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));

    // Create a JWT token for testing
    public static String createTestToken() {
        return Jwts.builder()
                .setSubject("test-user")
                .signWith(key)
                .compact();
    }

    // Provide the shared signing key for verification
    public static SecretKey getSigningKey() {
        return key;
    }
}
