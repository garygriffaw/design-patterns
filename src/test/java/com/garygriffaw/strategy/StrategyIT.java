package com.garygriffaw.strategy;

import com.garygriffaw.state.DirectionService;
import com.garygriffaw.state.DrivingMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyIT {
    @Test
    void aesEncryption() {
        var chatClient = new ChatClient(new AesEncryption());

        assertEquals("*** AES Encrypted - This is a test ***", chatClient.send("This is a test"));
    }

    @Test
    void desEncryption() {
        var chatClient = new ChatClient(new DesEncryption());

        assertEquals("*** DES Encrypted - This is a test ***", chatClient.send("This is a test"));
    }

}