package com.company;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        // CoffeMachine coffMachine1 = new CoffeMachine(10,10);

        int[] hatsoFogasKerekek = {40, 35, 30, 25};
        double fordPerSec;
        int valtoFokozat;
        int chooseNumber;
        double sebesseg;

        Scanner sc = new Scanner(System.in);

        Bicycle bicaj1 = new Bicycle(1, 100, hatsoFogasKerekek);

        System.out.println("Sebességet (1) vagy Fordulatszámot (2) akarsz számolni?");
        chooseNumber = sc.nextInt();

        if (chooseNumber == 1) {
            System.out.println("Add meg a fordulatszámot és a sebesség fokozatot!");
            fordPerSec = sc.nextInt();
            valtoFokozat = sc.nextInt()-1;

            bicaj1.setValtoFokozat(valtoFokozat);
            sebesseg = bicaj1.getSpeed(fordPerSec);
            System.out.println("A sebesség: " + sebesseg);

        } else if (chooseNumber == 2) {
            System.out.println("Add meg a sebességet és a sebesség fokozatot!");
            sebesseg = sc.nextInt();
            valtoFokozat = sc.nextInt()-1;

            bicaj1.setValtoFokozat(valtoFokozat);
            fordPerSec = bicaj1.getSpeed(sebesseg);
            System.out.println("A fordulatszám: " + fordPerSec);

        } else {
            System.out.println("Nem megfelelő számot adtál");
        }
    }
}