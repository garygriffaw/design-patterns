package com.garygriffaw.strategy;

public class DesEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES: " + message);
        return "*** DES Encrypted - " + message + " ***";
    }
}
