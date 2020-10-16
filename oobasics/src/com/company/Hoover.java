package com.company;

public class Hoover {


    private boolean isConnected;
    private boolean isTurnedOn;
    private boolean isBagFull;
    private int dustInBag;
    private int hooveringSpeed;


    public Hoover(boolean isConnected, boolean isTurnedOn, boolean isBagFull, int dustInBag, int hooveringSpeed) {
        this.isConnected = isConnected;
        this.isTurnedOn = isTurnedOn;
        this.isBagFull = isBagFull;
        this.dustInBag = dustInBag;
        this.hooveringSpeed = hooveringSpeed;
    }

    public Hoover(){

    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public boolean isBagFull() {
        return isBagFull;
    }

    public void setBagFull(boolean bagFull) {
        isBagFull = bagFull;
    }

    public int getDustInBag() {
        return dustInBag;
    }

    public void setDustInBag(int dustInBag) {
        this.dustInBag = dustInBag;
    }

    public int getHooveringSpeed() {
        return hooveringSpeed;
    }

    public void setHooveringSpeed(int hooveringSpeed) {
        this.hooveringSpeed = hooveringSpeed;
    }


}
