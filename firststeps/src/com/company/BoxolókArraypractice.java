package com.company;


public class BoxolókArraypractice {

    public static void main(String[] args) {

        int[] englishBoxers = {73, 64, 81, 54, 82, 73, 62, 91, 83};
        int[] frenchBoxers = {51, 82, 58, 67, 85, 100, 78, 91, 130, 72};


        int[] weightCategories = {52, 57, 63, 71, 79, 91};
        int[] numOfFightersInCat = new int[6];


        int sumInt = 0;
        int maxWeight = 0;
        int minweight, nextMinweight;


         // Mennyi az angol boxolók átlagos testsúlya?

        for (int counter = 0; counter < englishBoxers.length; counter++) {
            sumInt += englishBoxers[counter];
        }
        System.out.println(sumInt / englishBoxers.length + " az átlag súly");

        // Hángy kg-s a legnehezebb boxoló?

        maxWeight = biggestBoxer(englishBoxers, frenchBoxers);
        System.out.println(maxWeight + "kg a legnehezebb boxoló.");

        // Van két olyan boxoló, akik együtt is könnyebbek mint a legnehezebb boxoló? KIk ők (hány kg-sak)?

        minweight = smallestBoxer(englishBoxers, frenchBoxers);
        System.out.println(minweight+" a legkönnyebb boxolö");
        nextMinweight = biggestBoxer(englishBoxers, frenchBoxers);

        if (smallestBiggerThan(englishBoxers, minweight) < nextMinweight) {
            nextMinweight = smallestBiggerThan(englishBoxers, minweight);
        }
        if (smallestBiggerThan(frenchBoxers, minweight) < nextMinweight) {
            nextMinweight = smallestBiggerThan(frenchBoxers, minweight);
        }
        System.out.println(nextMinweight + " a második legkönnyebb boxoló");


        // A 0. súlycsoport 0 és 52 kg közötti (aki pont 52 kg az még ide tartozik), az 1. súlycsoport 52 és 57 kg közötti
        // (ha 52 < súly <= 57, akkor tartozik ide egy boxoló), stb…
        //Egy mérkőzésen az összes francia és az összes angol boxoló részt vesz. Mindenki boxol mindenkivel, aki vele egy
        // súlycsoportban van.

        // Hányan boxolnak az egyes súlycsoportokban?

       /* for (int counter = 0; counter < numOfFightersInCat.length; counter++) {
            for (int i=0; i<englishBoxers.length){

                if ()


            }
        }*/



    } // Main vége



    public static int smallestBiggerThan(int[] boxers, int num) {
        int smaller = 200;

        for (int counter = 0; counter < boxers.length; counter++) {

            if ((boxers[counter] < smaller) && (boxers[counter] > num)) {
                smaller = boxers[counter];
            }
        }
        return smaller;
    }

    public static int smallerNum(int boxer1, int boxer2) {
        int smaller;

        if (boxer1 < boxer2) {
            smaller = boxer1;
        } else {
            smaller = boxer2;
        }
        return smaller;
    }

    public static int biggerNum(int boxer1, int boxer2) {
        int bigger;

        if (boxer1 < boxer2) {
            bigger = boxer2;
        } else {
            bigger = boxer1;
        }
        return bigger;
    }

    public static int biggestBoxer(int[] engBoxers, int[] freBoxers) {
        int bigger = engBoxers[0];
        for (int counter = 0; counter < engBoxers.length; counter++) {
            if (engBoxers[counter] > bigger) {
                bigger = engBoxers[counter];
            }
        }
        for (int counter = 0; counter < freBoxers.length; counter++) {
            if (freBoxers[counter] > bigger) {
                bigger = freBoxers[counter];
            }
        }

       /* for (int counter = 0; counter < engBoxers.length; counter++) {            // jó lett volna ha egyenlő hosszúak a tömbök.
            if (biggerNum(engBoxers[counter], freBoxers[counter]) > bigger) {
                bigger = biggerNum(engBoxers[counter], freBoxers[counter]);
            }
        }*/

        return bigger;
    }


    public static int smallestBoxer(int[] engBoxers, int[] freBoxers) {
        int smaller = engBoxers[0];
        for (int counter = 0; counter < engBoxers.length; counter++) {
            if (engBoxers[counter] < smaller) {
                smaller = engBoxers[counter];
            }
        }
        for (int counter = 0; counter < freBoxers.length; counter++) {
            if (freBoxers[counter] < smaller) {
                smaller = freBoxers[counter];
            }
        }

     /*   for (int counter = 0; counter < engBoxers.length; counter++) {             // jó lett volna ha egyenlő hosszúak a tömbök.
            if (biggerNum(engBoxers[counter], freBoxers[counter]) < smaller) {
                smaller = biggerNum(engBoxers[counter], freBoxers[counter]);
            }
        }*/

        return smaller;
    }


}
