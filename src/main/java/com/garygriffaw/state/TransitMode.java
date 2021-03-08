package com.garygriffaw.state;

//ConcreteState
public class TransitMode implements Mode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 30;
    }
}
