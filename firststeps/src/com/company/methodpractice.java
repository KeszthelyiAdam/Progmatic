package com.company;

import java.util.Random;

public class methodpractice {

    public static void main(String[] args) {



    } // main vége

    // Metódusok ***

    // 13.  Írj metódust, ami megszámolja, hogy 1 és 1000 között hány tökéletes szám van!

  /*  public static int perfectNumTh(int num) {
        int i;
        for (i = 1, i <= 1000, i++) {
            if (perfectNum(i) == num) {
                return true;
            }
            return false;
        }


   */
        //A számelméletben tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál k
        // osztóik összegével. Pl. tökéletes szám a 6, mert önmagánál kisebb osztói: 1, 2, 3 és 1+2+3=6.
        // Írj metódust, ami egy számról eldönti, hogy tökéletes szám-e!

        public static boolean perfectNum ( int num){
            int divSum = sumDivisors(num);
            if (divSum == num) {
                return true;
            }
            return false;
        }


        //10.  Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hányszor sikerült két 6-ost dobni
        // egymás után.(Az 1, 6, 6, 6, 1 sorozatban az első két hatos számít egy duplának, a harmadik hatos már nem.
        // Az 1, 6, 6, 6, 6, 1 sorozatban két dupla 6-os van egymás után.)

        // 9.     Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hány 6-ost sikerült eközben dob

        public static int diceNtimes ( int num){
            int diceIsSix = 0;
            int diceIsSixDouble = 0;
            Random rand = new Random();
            int randNum;

            for (int i = 1; i <= num; i++) {

                randNum = rand.nextInt(6) + 1;
                System.out.println("A dobott szám: " + randNum);
                if (randNum == 6) {
                    diceIsSix++;
                    if (diceIsSix == 2) {
                        diceIsSixDouble++;
                        diceIsSix = 0;
                    }
                } else {
                    diceIsSix = 0;
                }
            }
            return diceIsSixDouble;
        }


        //  8.     Írj egy metódust, amely visszaadja egy bemenetül kapott egész szám számjegyeinek az összegét!


        // Írj metódust, amely két bemeneti számról eldönti, hogy azok ikerprímek-e. (Ikerprímnek két olyan prímszám
        // együttesét nevezzük, amelyek 2-vel térnek el egymástól: például 5 és 7, vagy 41 és 43.)

        public static boolean twinPrime ( int num1, int num2){
            if (isPrime(num1) && isPrime(num2) && Math.abs(num1 - num2) == 2) {
                return true;
            }
            return false;
        }

        public static boolean isPrime ( int nr){             // Prím e?

            for (int i = 2; i <= Math.sqrt(nr); i++) {
                if (nr % i == 0) {
                    return false;
                }
            }
            return true;
        }


        //  Írj egy metódust, mely egy számról eldönti, hogy eleme-e a Fibonacci-sorozatnak!

        public static boolean partOfFibonacci ( int numberToCheck){
            int a, b = 1;
            int sum = 1;
            while (sum <= numberToCheck) {
                if (sum == numberToCheck) {
                    return true;
                } else {
                    a = b;
                    b = sum;
                    sum = a + b;
                }


            }
            return false;


        }


        //  Írj metódust, amely visszaadja egy szám nála kisebb osztóinak összegét! (Tehát a 8-ra ez az összeg 1+2+4 = 7
        //static int sumDivisors(int n);

        public static int sumDivisors ( int number){
            int divider = 1;
            int sum = 0;
            int numOfDivider = 0;
            while (divider <= number / 2) {
                if (number % divider == 0) {
                    System.out.println(divider + "  osztója a számnak.");
                    sum += divider;
                    numOfDivider++;
                }

                divider++;
            }
            return sum;
        }


        // Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott int számnak hány osztója van!
        // static int countDivisors(int n);

        public static int countDivisors ( int number){
            int divider = 1;
            int numOfDivider = 0;
            while (divider <= number / 2) {
                if (number % divider == 0) {
                    System.out.println(divider + "  osztója a számnak.");
                    numOfDivider++;
                }
                divider++;
            }
            return numOfDivider;
        }


        // Írj metódust, ami a két befogó hosszát paraméterül adva kiszámolja, hogy mennyi a derékszögű háromszög átfogó
        // static double rightAngleTriangle(double a, double b);


        public static double rightAngleTriangle(double sideA, double sideB){
            return Math.sqrt((sideA * sideA) + (sideB * sideB));

        }


        // Írj egy metódust, amely eldönti három (nem feltétlen egész) számról, hogy lehet-e ilyen hosszú szakaszokból
        // háromszöget szerkeszteni! (Megj: akkor szerkeszthető háromszög, ha mindhárom oldal kisebb, mint a másik kettő
        // összege.) static boolean canDrawTriangle(double a, double b, double c);


        public static boolean ableToDrawTriangle ( int sideA, int sideB, int sideC){
            if ((sideA + sideB > sideC) && (sideA < sideB + sideC) && (sideA + sideC > sideB)) {
                System.out.println("Készíthető háromszög. Metóduson belül");
                return true;
            }
            return false;
        }

        // Írj metódust, ami kiszámolja két egész szám minimumát!

        public static int minOfInts ( int num1, int num2){
            if (num1 <= num2) {
                return num1;
            } else {
                return num2;
            }

        }
        // Írj metódust, ami kiszámolja két egész szám maximumát!

        public static int mmaxOfInts ( int num1, int num2){
            if (num1 <= num2) {
                return num1;
            } else {
                return num2;
            }

        }

        //   Írj metódust, amely eldönti egy bemenetként kapott int számról, hogy az osztható-e 7-tel!

        public static boolean isDiv7 ( int n){
            if (n % 7 == 0) {
                return true;
            }
            return false;
        }


        // Metódusok VÉGE ***

} // methodpractice Vége
