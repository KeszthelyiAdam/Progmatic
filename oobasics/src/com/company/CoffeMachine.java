package com.company;

public class CoffeMachine {
    private int waterLevel;
    private int coffeLevel;
    private int numOfFilters;

    public CoffeMachine(int water, int coffe) {
        waterLevel = water;
        coffeLevel = coffe;
    }

    public CoffeMachine() {

    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {

        this.waterLevel += waterLevel;
    }

    public void setCoffeLevel(int coffeLevel) {
        this.coffeLevel += coffeLevel;

    }

    public int getCoffeLevel() {
        return coffeLevel;
    }

    public int getNumOfFilters() {
        return numOfFilters;
    }

    public void setNumOfFilters(int numOfFilters) {
        this.numOfFilters += numOfFilters;
    }

    public boolean isFilter() {

        if (numOfFilters > 0) {
            return true;
        }
        return false;
    }

    public void makeCoffe(int requiredWater, int requiredCoffe) {

        if (getCoffeLevel() < requiredCoffe) {
            System.out.println("Nincs elég kávé. Töltse fel!");

            return;
        }
        if (getWaterLevel()<requiredWater){
            System.out.println("Nincs elég víz. Töltse fel!");
            return;
        }
        if(!isFilter()){
            System.out.println("Nincs elég filter. Töltse fel!");
            return;
        }
        waterLevel-=requiredWater;
        coffeLevel-=requiredCoffe;
        numOfFilters-=1;

        System.out.println("Kész a kávéja!");
    }

}
