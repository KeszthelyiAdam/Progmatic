package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Futár {

    public static int[] days;
    public static int[] deliveries;
    public static int[] distance;


    public static void main(String[] args) throws FileNotFoundException {

        // Olvassa be a tavok.txt állományban talált adatokat, s annak felhasználásával oldja meg
        // a következő feladatokat!

        readFromFile();


        // Írja ki a képernyőre, hogy mekkora volt a hét legelső útja kilométerben! Figyeljen arra,
        //hogy olyan állomány esetén is helyes értéket adjon, amiben például a hét első napján
        //a futár nem dolgozott!


    }  // Main vége
    // *** Metódusok

    public static int[] firstTripOfWeek() {
        int[] firstTrips = new int[distance.length];

        int i = 0, idx = 0;
        boolean first = true;

        while (i < days.length) {
            if (first) {
                firstTrips[idx]=distance[i];
                idx++;
                first=false;
            }

            i++;
        }

        return firstTrips;
    }


    public static void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Files/tavok.txt"));
        int rowCount = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            rowCount++;
            // System.out.println(line);
        }

        days = new int[rowCount];
        deliveries = new int[rowCount];
        distance = new int[rowCount];

        sc = new Scanner(new File("Files/tavok.txt"));

        for (int i = 0; sc.hasNext(); i++) {
            days[i] = sc.nextInt();
            deliveries[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }


    }

} // Class vége
