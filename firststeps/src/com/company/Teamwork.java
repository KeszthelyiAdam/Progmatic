package com.company;

import java.util.Scanner;

public class Teamwork {

    public static void main(String[] args) {

    double num, sum, sorsz;
        int oszt, x, y, mag, wid, firstNPrim;
        Scanner sc = new Scanner(System.in);

        // ***************************** FEJLÉC *************

        // Feladat 1.
        sorsz = 1;
        num = 1;
        sum = 0;

  /*      while (sorsz < 101) {

            if (num % 2 == 0 && num % 3 == 0) {
                sum = sum + num;
                sorsz = sorsz + 1;
            }
            ;
            num++;
        }
        System.out.println("Az átlag:" + sum + "/" + num + " " + sum / (sorsz + 1));
        ;
        // Feladat 1.vége

        // Feladat 2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        num = sc.nextInt();

        for (oszt = 1; oszt < num; oszt++) {

            if (num % oszt == 0 && oszt%2 == 0) {

                System.out.println(oszt);

            }
            ;
        }
        ;
        System.out.println("0-n és önmagán kívül.");


        // Feladat 2. vége



        // Feladat 3.
        x = 1;
        y = 1;

        for (x = 1; x <= 10; x++) {

            for (y = 1; y <= 10; y++) {

                System.out.print(x + "*" + y + "  ");

            }
            System.out.println("");

        }
        // Feladat 3. vége



        // Feladat 4.

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        num = sc.nextInt();

        for (x = 1; x <= num; x++) {

            for (y = 1; y <= x; y++) {

                System.out.print( " * " );

            }
            System.out.println("");

        }
        // Feladat 4. vége


        // Feladat 5.

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        num = sc.nextInt();

        for (x = 1; x <= num; x++) {

            for (y = 1; y <= (num - x); y++) {

                System.out.print("   " +
                        "");
            }
            for (y = 1; y <= 2 * x - 1; y++) {

                System.out.print(" @ ");
            }
            System.out.println("");
        }
        // Feladat 5. vége


        // Feladat 6. PIRAMIS

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");

        num = sc.nextInt();

        for (x = 1; x <= num; x++) {

            for (y = 1; y <= (num - x); y++) {

                System.out.print("   ");
            }
            for (y = 1; y <= 2*x-1; y++) {

                System.out.print(" @ ");
            }
            System.out.println("");
        }

        // Alja
        for (x = 1; x <= num; x++) {

            for (y = 1; y <= x; y++) {

                System.out.print("   ");
            }
            for (y=1; y<= (num-x)*2-1 ;  y++) {

                System.out.print(" @ ");
            }
            System.out.println("");
        }

        // Feladat 6. vége

        // Feladat 7. GYÉMÁNT

        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a gyémánt magasságát! :");
        mag = sc.nextInt();

        if (mag % 2 != 0) {

            num = (mag + 1) / 2;


            for (x = 1; x <= num; x++) {

                for (y = 1; y <= (num - x); y++) {

                    System.out.print("   ");
                }
                for (y = 1; y <= 2 * x - 1; y++) {

                    System.out.print(" @ ");
                }
                System.out.println("");
            }

            // Alja
            for (x = 1; x <= num; x++) {

                for (y = 1; y <= x; y++) {

                    System.out.print("   ");
                }
                for (y = 1; y <= (num - x) * 2 - 1; y++) {

                    System.out.print(" @ ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("else");
            num = mag / 2;
            for (x = 1; x <= num; x++) {

                for (y = 1; y <= (num - x); y++) {

                    System.out.print("   ");
                }
                for (y = 1; y <= 2 * x - 1; y++) {

                    System.out.print(" @ ");
                }
                System.out.println("");
            }

            // Alja
            num++;
            for (x = 1; x <= num; x++) {

                for (y = 1; y < x; y++) {

                    System.out.print("   ");
                }
                for (y = 1; y <= (num - x) * 2 - 1; y++) {

                    System.out.print(" @ ");
                }
                System.out.println("");
            }


        }
        // Feladat 6. vége

        // Feladat 7. Magyar ZÁSZLÓ

        Scanner sc = new Scanner(System.in);

        //    System.out.print("\u001B[31m" + "***" +  "\u001B[31m");

        String BLACK = "\u001B[30m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String WHITE = "\u001B[37m";
        String BLUE = "\u001B[34m";


        System.out.println("Adja meg a zászló magasságát");
        mag = sc.nextInt();

        System.out.println("Adja meg a zászló szélességét");
        wid = sc.nextInt();

        for (x = 1; x <= mag; x++) {                      // Piros rész
            for (y = 1; y <= wid; y++) {

                System.out.print(RED + " * " + RED);
            }
            System.out.println("");
        }
        for (x = 1; x <= mag; x++) {                    // Fehér rész
            for (y = 1; y <= wid; y++) {

                System.out.print(WHITE + " * " + WHITE);
            }
            System.out.println("");
        }


        for (x = 1; x <= mag; x++) {                      // Zöld rész
            for (y = 1; y <= wid; y++) {

                System.out.print(GREEN + " * " + GREEN);
            }
            System.out.println("");
        }

*/  // Feladat 7. ZÁSZLÓ vége

        // Feladat: Összeadja az első N db prim számot!


        System.out.println("Adja meg az első N db összeadandó prim számot!");
        firstNPrim = sc.nextInt();
        System.out.println("az első N db prim szám összege:" + FirstNPrimeSum(firstNPrim));

        System.out.println("Adja meg az első N db összeadandó páros számot!");
        int firstNmod2num = sc.nextInt();
        System.out.println("az első N db páros szám összege:" + FirstN2modSum(firstNmod2num));

        System.out.println("Adj meg két számot, amiről eldöntöm melyik a kisebb!");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("A kisebbik szám:" + minOfInts(number1, number2));


        // VÉGE - Feladat: Összeadja az első N db prim számot!
    }
    // ***** MAIN VÉGE ****


    //    METÓDUSOK **************

    // Írj metódust, ami kiszámolja két egész szám minimumát!

    public static int minOfInts(int num1, int num2) {
        if (num1 <= num2) {
            return num1;
        } else {
            return num2;
        }

    }
    public static boolean isPrime(int nr) {             // Prím e?

        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int FirstNPrimeSum(int n) {          // Összeadja az első N db prim számot!
        int sum = 0;
        int hanyadikPrim = 1;
        int numberToCheck = 2;

        while (hanyadikPrim <= n) {                    // A megtalált prímszámok sorszámát figyeli
            boolean isPrime = isPrime(numberToCheck);
            if (isPrime) {
                sum += numberToCheck;
                hanyadikPrim++;

            }
            numberToCheck++;
        }
        return sum;
    }

    public static int FirstN2modSum(int n) {          // Összeadja az első Ndb páros számot!
        int sum = 0;
        int hanyadikparos = 1;
        int numberToCheck = 1;

        while (hanyadikparos <= n) {                    // A megtalált páros számok sorszámát figyeli
            if (numberToCheck % 2 == 0) {
                sum += numberToCheck;
                hanyadikparos++;
            }
            numberToCheck++;
        }
        return sum;
    }


}




