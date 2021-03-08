package com.garygriffaw;

import com.garygriffaw.state.DirectionService;
import com.garygriffaw.state.DrivingMode;
import com.garygriffaw.state.WalkingMode;

public class Main {

    public static void main(String[] args) {
        var directionService = new DirectionService();

        directionService.setMode(new DrivingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setMode(new WalkingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }

}
