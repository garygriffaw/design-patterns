package com.garygriffaw.strategy;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptor) {
        this.encryptionAlgorithm = encryptor;
    }

    public String send(String message) {
        var encryptedMessage = encryptionAlgorithm.encrypt(message);

        System.out.println("Sending the encrypted message: " + encryptedMessage);
        return encryptedMessage;
    }
}
