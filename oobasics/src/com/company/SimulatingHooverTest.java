package com.company;

public class SimulatingHooverTest {

    private int quantityOfDust;
    private boolean current;

    public static void main(String[] args ){

    Hoover hoover1 = new Hoover(false, false,false,0,1);
    Hoover hoover2 = new Hoover(false,false,false,0,3);





    }

    // Metódusok

    public void testHoover(Hoover hoover, int quantityOfDust){
        setCurrent(true);
        setQuantityOfDust(quantityOfDust);

        hoover.setConnected(true);
        hoover.setTurnedOn(true);

        while (!hoover.isBagFull()){



        }

    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public int getQuantityOfDust() {
        return quantityOfDust;
    }

    public void setQuantityOfDust(int quantityOfDust) {
        this.quantityOfDust = quantityOfDust;
    }
}
