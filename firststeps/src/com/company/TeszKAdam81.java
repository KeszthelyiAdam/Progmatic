package com.company;

import java.util.Scanner;


public class TeszKAdam81 {

    public static void main(String[] args) {

        int pos1, pos2, speed1, speed2;

        int[] arrayOfConst = {1, 2, 3, 6, 10, 4, 5, 8, 9};
        int[] arrayOfOtherConst = {1, 2, 3, 0, 0, 0, 0, 0, 0};

        int[][] MatrixOfNums = {{1, 9}, {3, 5}};


        // 1. Feladat:
        System.out.println(" 1. Feladat: " + getLastNumber(arrayOfConst));

        // 2. Feladat:
        System.out.println(" 2. Feladat: " + countEvenNumbers(arrayOfConst));

        // 3. Feladat:
        System.out.println(" 3. Feladat: " + findNumber101(arrayOfConst));


        // 4. Feladat:
        System.out.println(" 4. Feladat: " + countSameNumbers(arrayOfConst, arrayOfOtherConst));


        // 5. Feladat:
        System.out.println(" 5. Feladat: " + matrixTopLeftNumber(MatrixOfNums));

        // 6. Feladat:
        System.out.println(" 6. Feladat: " + matrixDiagonalDifference(MatrixOfNums));

        // 7. Feladat:

        System.out.println(" 7. Feladat: Add meg a csillag magasságát:");

        Scanner sc = new Scanner(System.in);
        //  int heightNum = sc.nextInt();
        //stairs(heightNum);

        // 8. Feladat:

        System.out.println(" 8. Feladat: Add meg a kenguruk pzícióját és sebességét:");
        System.out.print("1es kenguru helye:");
        pos1 = sc.nextInt();

        System.out.print("1es kenguru sebessége:");
        speed1 = sc.nextInt();

        System.out.print("2es kenguru helye:");
        pos2 = sc.nextInt();

        System.out.print("2es kenguru sebessége:");
        speed2 = sc.nextInt();

        System.out.println(kangaroosMeet(pos1, speed1, pos2, speed2));


    }   // Main vége

    //  *** Metódusok

    /* 8.  Adott két kenguru, akik a számegyenesen ugrálnak. Az első kenguru az x1 helyről indul, és v1 egységet ugrik
       (a pozitív irányba), a második kenguru pedig x2 helyről indul és egy ugrással v2 egységet ugrik. Döntsük el,
        hogy a két kenguru fog-e egy időben egy helyen tartózkodni a számegyenesen! Valósítsd meg a kangaroosMeet metódust,
        amely az x1, v1, x2 és v2 értékét bemeneti paraméterül kapja! (A bemeneti számok nemnegatív egészek lehetnek.
        A metódusnak a bemenetet nem kell ellenőriznie.) A metódus visszatérési értéke a döntésnek megfelelő boolean
       érték legyen. (5p)

       Példa #1:
       x1 = 0; v1 = 3; x2 = 4; v2 = 2; esetén a kenguruk ugrásai:
               0 => 3 => 6 => 9 => 12 illetve 4 => 6 => 8 => 10 => 12, tehát mindketten pontosan 4 ugrással jutottak el
                a 12-es számra, így a válaszunk a feladat kérdésére igen.

       Példa #2:
       x1 = 0; v1 = 2; x2 = 5; v2 = 3; esetén viszont látszik, hogy az első kenguru hátrábbról indul és lassabb is,
        tehát nem fognak találkozni semmikor a jövőben.

        Bónusz kérdés (+2 pont): Megvalósítható-e ez a kangaroosMeet metódus O(1) futásidővel? Ha igen, akkor
         implementáld le, ha nem, akkor indokold, hogy miért nem!


       */


    public static boolean kangaroosMeet(int x1, int v1, int x2, int v2) {

        if ((x1 < x2) && (v1 <= v2)) {
            // 1es kenguru a 2es kenguru mögött van, és nem gyorsabb, vagyis nem éri utól.
            return false;
        }
        if ((x1 > x2) && (v1 >= v2)) {
            // 2es kenguru a 1es kenguru mögött van, és nem gyorsabb, vagyis nem éri utól.
            return false;
        }


        // A képletból látszik hogy a találkozási pontot meghatározhatjuk az időtől függetlenül.
        // A maradék nélküli oszthatóság mutatja meg, hogy diszkrét (egész) értékű e a találkozási pont.

        if (v1 == v2) {
            return false;
        }

        if ((x2 - x1) % (v1 - v2) != 0) {
            return false;
        }

        int x3 = v2 * (x2 - x1) / (v1 - v2) + x2;

        if (((x3 - x2) / v2) % v2 != 0) {
            return false;
        }
        return true;
    }

    // Futási időnk O(1) típusú.



    // 7. Valósítsd meg a stairs metódust! A metódus egy egész számot vár bemenetként, és rajzoljon ki a kimenetre az
    // alább látható módon egy ilyen magas lépcsőt # és szóköz karakterekből! (A metódusnak a bemenetet nem kell
    // ellenőriznie.) (3p)


    public static void stairs(int height) {   // Ha az ellenőrzés nem a figyelmen kívül hagyást jelenti..

        for (int cntr = 0; cntr <= height; cntr++) {

            for (int i = 0; i < height - cntr; i++) {        // szóköz
                System.out.print(" ");
            }

            for (int j = 1; j <= cntr; j++) {        // Hashtag
                System.out.print("#");
            }
            System.out.println();

        }
    }


    // 6.  Mennyi a különbség a mátrix két átlójában szereplő elemek összege között? Valósítsd meg a
    // matrixDiagonalDifference  metódust! A metódus egy kétdimenziós tömböt kap paraméterül, és visszatérési
    // értéke a mátrix átlóiban szereplő  számok összegei közötti eltérés. (Ügyelj arra, hogy a metódusod visszatérési
    // értéke a kérdésnek megfelelően mindig nemnegatív szám legyen! Feltételezheted, hogy a bemenetül kapott
    // kétdimenziós tömb négyzetes mátrix, azaz a sorainak és oszlopainak száma egyenlő.) (3p)
    //Írd meg a metódus szignatúráját saját magad! A metódus neve matrixDiagonalDifference legyen.

    public static int matrixDiagonalDifference(int[][] matrix) {
        int sumOfDiagonal1 = 0, sumOfDiagonal2 = 0;

        for (int x = 0; x < matrix.length; x++) {
            sumOfDiagonal1 += matrix[x][x];
            sumOfDiagonal2 += matrix[matrix.length - 1 - x][x];
        }
        return Math.abs(sumOfDiagonal1 - sumOfDiagonal2);

    }


    // 5. Valósítsd meg a matrixTopLeftNumber metódust! A metódus egy kétdimenziós tömböt kap paraméterül,
    // és adja vissza ennek a mátrixnak a bal felső (első) elemét! (2p)

    public static int matrixTopLeftNumber(int[][] numbers) {
        return numbers[0][0];
    }


    // 4. Valósítsd meg a countSameNumbers metódust! A metódus két egészeket tartalmazó tömb paramétert kap, és azt
    // kell megszámolnia, hogy hány elem szerepel az első tömbből a második tömbben! (Ügyelj arra, hogy ha egy szám
    // többször szerepel a második tömbben, akkor azt csak egynek számold! Feltételezheted, hogy az első tömbben minden
    // szám csak egyszer fordul elő.) (3p)

    public static int countSameNumbers(int[] numbers, int[] otherNumbers) {
        int numOfsameNums = 0;
        boolean match = false;

        for (int cntr = 0; cntr < numbers.length; cntr++) {

            int idx = 0;

            while ((idx < otherNumbers.length) && (match == false)) {

                if (numbers[cntr] == otherNumbers[idx]) {
                    numOfsameNums++;
                    match = true;
                }
                idx++;
            }
            match = false;
        }
        return numOfsameNums;
    }


    // 3. Szerepel-e a 101-es szám a tömbben? Valósítsd meg az alábbi findNumber101 metódust! A metódus visszatérési
    // értéke legyen az az index, ahol a tömbben először szerepel a 101-es szám! Ha a tömbben ez a szám nem szerepel,
    // akkor a visszatérési érték legyen -1. (2p)

    public static int findNumber101(int[] numbers) {

        for (int cntr = 0; cntr < numbers.length; cntr++) {
            if (numbers[cntr] == 101) {
                return cntr;

            }
        }

        return -1;
    }


    // 2. Valósítsd meg az alábbi countEvenNumbers metódust! A metódus adja vissza, hogy a paraméterként kapott tömbben
    // hány páros szám szerepel! (2p)

    public static int countEvenNumbers(int[] numbers) {
        int evenNumbers = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;

    }


    // 1. Valósítsd meg az alábbi getLastNumber metódust! A metódus adja vissza a paraméterként kapott tömb utolsó elemét! (2p)

    public static int getLastNumber(int[] numbers) {

        return numbers[numbers.length - 1];

    }


} // TesztKAdam81 vége
