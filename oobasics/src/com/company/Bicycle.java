package com.company;

public class Bicycle {

    private double speed;
    private int kerekAtmero;
    private int valtoFokozat;
    private double fordPerSec;
    private double elsoFogasKerek;
    private int[] hatsoFogasKerek;


    public Bicycle(int kerekAtmero, int elsoFogasKerek, int[] hatsoFogasKerek) {
        this.kerekAtmero = kerekAtmero;
        this.elsoFogasKerek = elsoFogasKerek;
        this.hatsoFogasKerek = hatsoFogasKerek;


    }

    public Bicycle() {

    }

    // Metódusok


    public void setValtoFokozat(int valtoFokozat) {
        this.valtoFokozat = valtoFokozat;

    }

    public double getSpeed(double fordPerSec) {
        speed = fordPerSec * (elsoFogasKerek / hatsoFogasKerek[valtoFokozat]) * kerekAtmero;

        return speed;
    }

    public double getFordPerSec(double speed) {
        fordPerSec = speed * hatsoFogasKerek[valtoFokozat] / (kerekAtmero * elsoFogasKerek);

        return fordPerSec;
    }

}
