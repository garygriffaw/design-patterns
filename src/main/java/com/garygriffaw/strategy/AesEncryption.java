package com.garygriffaw.strategy;

public class AesEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES: " + message);
        return "*** AES Encrypted - " + message + " ***";
    }
}
