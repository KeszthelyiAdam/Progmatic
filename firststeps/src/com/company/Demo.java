package com.company;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Egy bolha az alábbi módszer szerint ugrál egy bálna hátán: egyet (egy cm-t) előre, egyet hátra, kettőt előre,
        // egyet hátra, hármat előre, egyet hátra, stb… (tehát előre ugrás után mindig ugrik egyet hátra, és hátra ugrás
        // után eggyel nagyobbat ugrik előre mint az előző előre ugrásban ugrott - időközben ugyanis megerősödik és
        // egyre nagyobbakat tud ugrani).

        //Hol lesz a bolha száz ugrás után? (1225)

        //A bálna hátán 5 cm-enként vannak csiklandós pontok. Hány csiklandós pontot érint a bolha, ha a bálna 10 m
        // hosszú (a bolha a bálna orra hegyétől indul, ami maga is egy csiklandós pont)? (19)

        int jumpNum, forward, position, numOfPoints;
        forward = 1;
        position = 0;
        numOfPoints = 0;

        System.out.println("Hányat ugorjon a bolha?");
        jumpNum = sc.nextInt();

        for (int jumpPair = 1; jumpPair <= jumpNum / 2; jumpPair++) {

            System.out.println(jumpPair + "-ik ugráspárnál");               // Program Futás közbeni értékek figyelése
            System.out.println((forward) + "-t ugrott utoljára előre");
            System.out.println(position + "-ik cm-nél tart");


            if ((position + 1) % 5 == 0) {                                  // Csikis pontok vizsgálata ( B )
                numOfPoints++;
            }
            if (position % 5 == 0) {
                numOfPoints++;
            }
            System.out.println(numOfPoints + "db Csikis pontot érintett.");

            position += forward++;                                           // A bolha pozíciójának (POSITION) meghatározása  ( A )

            System.out.println();
        }

  /*      System.out.println("*********************************");

      forward = 1;
        position = 0;
        numOfPoints = 0;
        while (position+1 <= 1000) {
            System.out.println(position + "-ik cm-nél tart");

            if ((position + 1) % 5 == 0) {
                numOfPoints++;

                System.out.println((position + 1) + "is Csikis pont");
            }
            if (position % 5 == 0) {
                numOfPoints++;

                System.out.println((position) + "is Csikis pont");
            }

            position += forward++;

            System.out.println(numOfPoints + "db Csikis pontot érintett.");

        }                                                                                                       // Válasz a kérdésre.
        System.out.println((numOfPoints + 1) + "db Csikis pontot érintett a bolha HA azt feltételezzűk," +
                " hogy az utolsó ugrásánál pont a bálna végére ugrik.");

*/
    }
}
