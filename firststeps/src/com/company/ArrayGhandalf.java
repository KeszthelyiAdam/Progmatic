package com.company;

import java.util.Arrays;

public class ArrayGhandalf {

    public static void main(String[] args) {

        int[] peaks = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
        int positionOfGandalf = 3;

        int[] weight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};

        int[][] weightAndHeight = {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128}, {70, 130}, {58, 120}, {67,
                125}, {72, 130}, {85, 110}};

        System.out.println("1. Feladat:  A legmagasabb csúcs:" + maxOfArray(peaks));
        System.out.println("2. Feladat: " + Arrays.toString(maxOfRestOfArray(peaks, positionOfGandalf)));

        // Függőhidas feladat

        System.out.println("2. Feladat: A híd ");
        pairingOnTheBridge(weight);

    /*    Írj metódus, ami ismerve az egyes személyek súlyát és magasságát, megadja, hogy
        mi az a legmagasabb torony, amit ezek a személyek alkothatnak, ha egymás vállára
        állnak, feltéve hogy valakinek a vállára csak olyan valaki állhat, aki alacsonyabb is és
        könnyebb is nála!
                A törpök (és Gandalf) súlya és magassága az alábbiak: (a első szám a súly, a második
        a magasság) {(84, 144), (83, 130), (82, 138), (76, 135), (61, 128), (70,130), (58, 120), (67,
                125), (72, 130), (85, 110)}
*/
       // ShowMatrix( sortMatrixByWeightHeight(weightAndHeight));

    } // Main vége

    // METÓDUSOK

    public static int[][] sortMatrixByWeightHeight(int[][] WeightHeightMatrix) {
        int[][] weightHeightIndexedMatrix = new int[10][4];

        // Suly alapján rendezés és indexelés

        int weight, height;
        int counter = 0;
        boolean ordered = true;
        int numOfOrderedNumbers = 0;

        while (ordered == true) {

            counter = 0;
            ordered = false;

            while (counter < weightHeightIndexedMatrix.length - 1 - numOfOrderedNumbers) {
                if (weightHeightIndexedMatrix[counter][0] > weightHeightIndexedMatrix[counter + 1][0]) {

                    weight = weightHeightIndexedMatrix[counter][0];
                    weightHeightIndexedMatrix[counter][0] = weightHeightIndexedMatrix[counter + 1][0];
                    weightHeightIndexedMatrix[counter + 1][0] = weight;
                    ordered = true;
                }
                counter++;
            }
            numOfOrderedNumbers++;
        }
        for (counter = 0; counter < weightHeightIndexedMatrix.length - 1; counter++) {
            weightHeightIndexedMatrix[counter][2] = counter;
        }

        // Magasság alapján rendezés és indexelés

        while (ordered == true) {

            counter = 0;
            ordered = false;

            while (counter < weightHeightIndexedMatrix.length - 1 - numOfOrderedNumbers) {
                if (weightHeightIndexedMatrix[counter][1] > weightHeightIndexedMatrix[counter + 1][1]) {

                    weight = weightHeightIndexedMatrix[counter][1];
                    weightHeightIndexedMatrix[counter][1] = weightHeightIndexedMatrix[counter + 1][1];
                    weightHeightIndexedMatrix[counter + 1][1] = weight;
                    ordered = true;
                }
                counter++;
            }
            numOfOrderedNumbers++;
        }
        for (counter = 0; counter < weightHeightIndexedMatrix.length - 1; counter++) {
            weightHeightIndexedMatrix[counter][3] = counter;
        }


        return weightHeightIndexedMatrix;

    }
    public static void copyMatrixAtoB(int[][] matrix1, int[][] matrix2){


    }

    public static void ShowMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    System.out.print("{ ");

                }

                System.out.print(matrix[i][j]);

                if (j < matrix[i].length - 1) {
                    System.out.print(" , ");
                }

                if (j == matrix[i].length - 1) {
                    System.out.print(" } ");

                }

            }
            System.out.println();

        }


    }


    public static int[] sortByWeightBubble(int[] weight) {

        int tempInt;
        int counter = 0;
        boolean ordered = true;
        int numOfOrderedNumbers = 0;

        while (ordered == true) {

            counter = 0;
            ordered = false;

            while (counter < weight.length - 1 - numOfOrderedNumbers) {
                if (weight[counter] > weight[counter + 1]) {

                    tempInt = weight[counter];
                    weight[counter] = weight[counter + 1];
                    weight[counter + 1] = tempInt;
                    ordered = true;
                }
                counter++;
            }
            numOfOrderedNumbers++;
        }
        return weight;


    }

    public static int[] pairingOnTheBridge(int[] weight) {

        int[] row = new int[weight.length];
        int timeOnTheBridge = 0;

        row = sortByWeightBubble(weight);
        System.out.println("A hidnál sorba állnak:" + Arrays.toString(row));

        for (int counter = 0; counter < (row.length + 1) / 2; counter++) {
            System.out.println("A párok:");

            if ((row[counter] + row[row.length - 1 - counter]) <= 150) {
                System.out.println(row[counter] + " " + row[row.length - 1 - counter]);
                timeOnTheBridge += 5;
                System.out.println(timeOnTheBridge + "  idő alatt.");
            } else {
                System.out.println(" Majd külön: " + row[counter] + " " + row[row.length - 1 - counter]);
                timeOnTheBridge += 10;
                System.out.println(timeOnTheBridge + "  idő alatt.");

            }


        }
        return row;
    }


    public static int[] maxOfRestOfArray(int[] intArr, int index) {
        int max = 0;
        max = intArr[index];
        int[] tempArray = new int[intArr.length];

        for (int counter = intArr.length - 1; counter >= 0; counter--) {
            if ((counter >= index) && (intArr[counter] > max)) {
                max = intArr[counter];
            }
            if (counter < index) {
                intArr[counter] = max;
            }
        }
        return intArr;
    }


    public static int maxOfArray(int[] intArr) {
        int max = 0;
        for (int counter = 0; counter < intArr.length - 1; counter++) {
            if (intArr[counter] > max) {
                max = intArr[counter];
            }

        }
        return max;
    }

}


