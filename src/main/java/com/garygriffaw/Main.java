package com.garygriffaw;

import com.garygriffaw.memento.Document;
import com.garygriffaw.memento.History;
import com.garygriffaw.state.DirectionService;
import com.garygriffaw.state.DrivingMode;
import com.garygriffaw.state.WalkingMode;

public class Main {

    public static void main(String[] args) {
        var directionService = new DirectionService();

        directionService.setTravelMode(new DrivingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());

        directionService.setTravelMode(new WalkingMode());
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }

}
