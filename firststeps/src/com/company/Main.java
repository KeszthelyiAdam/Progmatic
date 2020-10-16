package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num, num2, num3, nnum, sum;
        double dnum, dnum2, dnum3, dmax;

        Scanner sc = new Scanner(System.in);
        /*
        // 1. Feladat
        System.out.println("Első feladat:  Adj meg egy számot!");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("Pozitív számot adtál.");
        } else {
            System.out.println("Negatív számot adtál");
        }                                                           // 1. Feladat vége

        // 2. Feladat
        System.out.println("Második feladat:  Add meg életkorodat!");
        num = sc.nextInt();

        if (num < 17) {
            System.out.println("Este 9-kor alvás!");
        } else if (17 < num && num <= 30) {
            System.out.println(" Buli vaaan! :)) ");
        } else {
            System.out.println("8-kor pizsi");
        }                                                           // 2. Feladat vége

        // 3. Feladat
        System.out.println("Harmadik feladat:  Mennyi a fizud?");
        num = sc.nextInt();

        if (num < 50000) {
            System.out.println("50k alatt keresel..");
        } else if (500000 <= num && num < 1000000) {
            System.out.println(" 50k és 100k között keresel.. ");
        } else if (1000000 <= num && num < 2000000) {
            System.out.println(" 100k és 200k között keresel.. ");
        } else {
            System.out.println("200k fölött keresel");
        }                                                           // 3. Feladat vége

        // 4. Feladat
        System.out.println("Negyedik feladat:  Két játékostól bekérünk egy-egy számot.");

        System.out.println("Első  játékos!  adj meg egy számot!");
        num = sc.nextInt();

        System.out.println("Második  játékos!  adj meg egy számot!");
        num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("Egy húron pendültök :)");
        } else {
            System.out.println("Ez most nem jött össze..");
        }                                                           // 4. Feladat vége


        // 5. Feladat
        System.out.println("Ötödik feladat:  Bekérünk három pozitív számot, melyekről megállapítjuk, " +
                "hogy szerkeszthető e belőlük háromszög.");

        System.out.println("Add meg az első számot!");
        dnum = sc.nextDouble();
        dmax = dnum;                                          //

        System.out.println("Add meg a második számot!");
        dnum2 = sc.nextDouble();
        if (dnum2 > dmax) {
            dmax = dnum2;
        }

        System.out.println("Add meg a harmadik számot!");
        dnum3 = sc.nextDouble();
        if (dnum3 > dmax) {
            dmax = dnum3;
        }

        if ((dnum + dnum2 >= dnum3) && (dnum + dnum3 >= dnum2) && (dnum2 + dnum3 >= dnum)) {
            System.out.println(" A megadott számokból lehet szerkeszteni háromszöget, ahol a befogó:");
            System.out.println(dmax);
        } else {
            System.out.println("Ezekből nem lehet.. ");
        }                                                           // 5. Feladat vége


        // 6. Feladat
        nnum = 0;
        while (nnum < 100) {
            System.out.println(" A " + (nnum + 1) + ".-ik természetes szám: " + nnum * 2);
            nnum++;
        }
        // 6. Feladat vége

        // 7. Feladat  while
        nnum = 10000;
        while (nnum < 20000) {

            if (nnum % 89 == 0 && nnum % 103 == 0) {
                System.out.println(" A 89-el és 103-al osztható szám:" + nnum);

            }
            nnum++;
        }
        // 7. Feladat vége

        // 7. Feladat  for

        for (nnum = 10000; nnum < 20000; nnum++) {
            if (nnum % 89 == 0 && nnum % 103 == 0) {
                System.out.println(" A 89-el és 103-al osztható szám:" + nnum);

            }
        }
        // 7. Feladat vége

        // 8. Feladat  while
        nnum = 1;
        sum = 0;
        while (nnum <= 100) {
            sum += nnum++;
        }
        System.out.println(" 1-től 100-ig a számok összege:" + sum);

        // 8. Feladat vége

        // 8. Feladat  for
        sum = 0;
        for (nnum = 1; nnum <= 100; nnum++) {
            sum += nnum;
        }
        System.out.println(" 1-től 100-ig a számok összege:" + sum);
        // 8. Feladat vége

        // 9. Feladat  while
        nnum = 100;
        sum = 0;
        while (nnum <= 200) {
            if (nnum % 2 == 0) {
                sum += nnum;
            }
            nnum++;
        }
        System.out.println(" 100 és 200-közötti páros számok összege:" + sum);

        // 9. Feladat vége

        // 9. Feladat  for
        sum = 0;
        for (nnum = 100; nnum <= 200; nnum++) {
            if (nnum % 2 == 0) {
                sum += nnum;
            }

        }
        System.out.println(" 100 és 200-közötti páros számok összege:" + sum);
        // 9. Feladat vége


        // 10. Feladat  while
        nnum = 1;
        sum = 0;
        while (nnum < 200) {
            if (nnum % 7 == 0) {
                sum += nnum;
            }
            nnum++;
        }
        System.out.println("200-nál kisebb 7-tel osztható pozitív számok összege:" + sum);

        // 10. Feladat vége

        // 10. Feladat  for
        sum = 0;
        for (nnum = 1; nnum < 200; nnum++) {
            if (nnum % 7 == 0) {
                sum += nnum;
            }

        }
        System.out.println(" 200-nál kisebb 7-tel osztható pozitív számok összege:" + sum);
        // 10. Feladat vége


        // Szökőéves feladat
        System.out.println("Első feladat:  Adj meg egy évszámot!");
        num = sc.nextInt();
        for (nnum = 1994; nnum <= 2000; nnum++) {
            if (nnum % 4 == 0 && nnum % 100 != 0 || nnum % 400 == 0) {
                System.out.println(nnum + " Szökőév");
            }
        }
        // Szökőéves feladat vége

        // Test tömeg index feladat
        System.out.println("Test tömeg index feladat:   bekérünk egy-egy számot.");

        System.out.println("Add meg a magasságod!");
        num = sc.nextInt();

        System.out.println("Add meg a testsúlyodat!");
        num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("Egy húron pendültök :)");
        } else {
            System.out.println("Ez most nem jött össze..");

        }
        // Test tömeg index feladat vége


        // Prímszám feladat
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        if (x > 1) {
            for (int i = 2; i > x; i++) {
                if (x % i == 0) {
                    k++;
                    break;
                }
            }
            if (k==0){
                System.out.println("Prím");
            }
            else{
                System.out.println("Nem Prím");
            }
        }
        // Prímszám feladat vége

        // Fizz Buzz feladat

        // int x = scanner.nextInt();

        for (int j = 1; j < 51; j++){
            if (j%3 == 0 || j%5 == 0){
                if(j%3==0){
                    System.out.println(j+"Fizz");
                }
                if(j%5==0){
                    System.out.println(j+"buzz");
                }
            }    else{
                System.out.println(j);
            }
        }
        // Fizz Buzz feladat vége
*/
        // Fibonacci feladat

        long n1, n2, n3;

        // Fibonacci feladat vége

        // DO WHILE - WHILE
        int i = 0;
        do {
            System.out.println("do while");
            i++;
        } while (i < 5);

        int j = 0;
        while (j < 5) {
            System.out.println("while");
            j++;
        }

        // DO WHILE - WHILE

        // Egymásba ágyazott FOR ciklusok

        for (i = 0; i < 4;i++){
            for (j = 0; j < 2;i++){
                System.out.println(i+""+j);
            }
        }
        // Egymásba ágyazott FOR ciklusok

        // ************************************** TEAM WORK *****************************************





    }
}

