package com.lee93.coc.security;

import java.security.SecureRandom;
import java.util.Base64;

public class SecretKeyGenerator {

    public static String generateSecretKey() {
        SecureRandom random = new SecureRandom();
        byte[] keyBytes = new byte[32];
        random.nextBytes(keyBytes);
        return Base64.getEncoder().encodeToString(keyBytes);
    }

    public static void main(String[] args) {
        String secretKey = generateSecretKey();
        System.out.println("Generated SECRET_KEY ::: " + secretKey);
    }
}
