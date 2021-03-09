package com.garygriffaw;

import com.garygriffaw.iterator.Iterator;
import com.garygriffaw.iterator.Product;
import com.garygriffaw.iterator.ProductCollection;
import com.garygriffaw.state.DirectionService;
import com.garygriffaw.state.DrivingMode;
import com.garygriffaw.state.WalkingMode;
import com.garygriffaw.strategy.AesEncryption;
import com.garygriffaw.strategy.ChatClient;
import com.garygriffaw.strategy.DesEncryption;

public class Main {

    public static void main(String[] args) {
        var chatClient = new ChatClient(new DesEncryption());
        chatClient.send("This is a test");

        chatClient = new ChatClient(new AesEncryption());
        chatClient.send("Another test");
    }

}
