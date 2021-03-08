package com.garygriffaw.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateIT {

    @Test
    void bicyclingMode() {
        var directionService = new DirectionService();

        directionService.setTravelMode(new BicyclingMode());

        assertEquals(2, directionService.getEta());
        assertEquals(20, directionService.getDirection());
    }

    @Test
    void drivingMode() {
        var directionService = new DirectionService();

        directionService.setTravelMode(new DrivingMode());

        assertEquals(1, directionService.getEta());
        assertEquals(10, directionService.getDirection());
    }

    @Test
    void transitMode() {
        var directionService = new DirectionService();

        directionService.setTravelMode(new TransitMode());

        assertEquals(3, directionService.getEta());
        assertEquals(30, directionService.getDirection());
    }

    @Test
    void walkingMode() {
        var directionService = new DirectionService();

        directionService.setTravelMode(new WalkingMode());

        assertEquals(4, directionService.getEta());
        assertEquals(40, directionService.getDirection());
    }
}