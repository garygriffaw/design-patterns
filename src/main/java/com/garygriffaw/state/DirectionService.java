package com.garygriffaw.state;

//Context
public class DirectionService {
    private Mode mode;

    public int getEta() {
        return mode.getEta();
    }

    public int getDirection() {
        return mode.getDirection();
    }

    public Mode getTravelMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
