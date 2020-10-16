package com.company;
// Hozz létre egy Counter classt
//melynek van egy integer value fieldje
//amikor példányosítod ennek az alapértéke lehet 0 vagy az a szám amit megadsz ***

//add(number) metódus: hozzáadja a number értékét
//add() paraméterek nélkül csak megnöveli az értéket eggyel
//get() visszaadja az érték állapotát
//reset() visszaállítja az értéket a kezdő értékre

public class Counter {
    int value=0;
    int startValue;

    public Counter(int value){
        startValue=value;
        this.value=value;
    }

    public Counter(){

    }

    public void add(int number){
        this.value+=number;
    }

    public void add(){
        this.value++;
    }

    public  int get(){
        return this.value;
    }

    public void reset(){
        this.value=startValue;
    }

}
