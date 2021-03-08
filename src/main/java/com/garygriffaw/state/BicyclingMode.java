package com.garygriffaw.state;

//ConcreteState
public class BicyclingMode implements Mode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 20;
    }
}
