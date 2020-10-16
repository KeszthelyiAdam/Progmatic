package com.company;

// Mindegyik állatnak van egy éhség értéke, ami egy egész szám
//Mindegyik állatnak van egy szomjúság értéke, ami egy egész szám

//Amikor példányosítasz egy új Animal objektumot az előző értékek minden esetben 50-ről indulnak

//Az állatok tudnak enni ami az éhséget csökkenti eggyel
//Az állatok tudnak inni ami az szomjúságot csökkenti eggyel
//Az állatok tudnak játszani ami a két értéket növeli eggyel

public class Animal {
    int hungry =50, thirsty=50;

    public Animal(int hungry, int thirsty) {
        this.hungry = hungry;
        this.thirsty = thirsty;
    }

    public void eat() {
        hungry--;

    }

    public void drink() {
        thirsty--;
    }

    public void play() {
        this.hungry--;
        this.thirsty--;
    }

    public void playTogether(Animal animal){
        animal.eat();
        animal.drink();
        this.eat();
        this.drink();
    }


    public Animal() {

    }
}
