package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {

    public static int[][] data;

    public static void main(String[] args) throws FileNotFoundException {
        int week;

        readFile();

        // 1. Módszer
        System.out.println(Arrays.deepToString(readFile1()));

        // 2. Módszer

        System.out.println(Arrays.deepToString(readFile2()));

        // Max kiíratás

        week = WeekOfMaxTemp();
        System.out.println(week + ".-ik héten volt a legmagasabb a hőmérséklet.");

    } // Main vége

    // *** Metódusok ***

    // Beolvasás Fileból

    public static void readFile() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Files/temps.txt"));

        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            System.out.println(line);
        }

    }

    // Módszer 1.

    public static int[][] readFile1() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Files/temps.txt"));
        data = new int[10][2];

        for (int i = 0; sc.hasNext(); i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }

        return data;
    }

    // Módszer 2.

    public static int[][] readFile2() throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Files/temps.txt"));
        data = new int[10][2];


        for (int i = 0; sc.hasNext(); i++) {
            String row = sc.nextLine();
            System.out.println(row);
            String[] parts = row.split(" ");
            data[i][0] = Integer.parseInt(parts[0]);
            data[i][1] = Integer.parseInt(parts[1]);

        }

        return data;
    }

    // Max keresés

    public static int WeekOfMaxTemp() {

        int maxTemp = Integer.MIN_VALUE, weekNum = 0;

        for (int i = 0; i < data.length; i++) {

            if (data[i][1] > maxTemp) {
                maxTemp = data[i][1];
                weekNum = data[i][0];

            }
        }

        return weekNum;
    }


}
