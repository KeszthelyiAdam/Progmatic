package com.company;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Válaszd ki melyik házit csináljuk! (1-4)");          // Kiválasztjuk a Házi feladat
        int hf = scanner.nextInt();

        if (hf == 1) {                                                                      // 1. Házi indul
            System.out.println("Házi 1.");              // 1. Házi feladat
            System.out.println("Írj be egy számot!");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Páros");
            } else {
                System.out.println("Páratlan");
            }


        }
        if (hf == 2) {                                                                      // 2. Házi indul

            System.out.println("Házi 2.");              // 2. Házi feladat
            System.out.println("Írj be egy színt");
            String color = scanner.next();

            if (color.equals("piros")) {
                System.out.println("tilos");
            }
            else if (color.equals("zold")) {
                System.out.println("szabad");
            }
            else  {
                System.out.println("hibás");
            }


        }
        if ( hf == 3 ) {                                                                      // 3. Házi indul

            System.out.println("Házi 3.");              // 3. Házi feladat

            System.out.println("Írd be a nemed!");
            String gender = scanner.next();

            System.out.println("Írd be a magasságod!");
            int height = scanner.nextInt();


            if (gender.equals("ffi")) {
                if (height > 176) {
                    System.out.println("Átlag feletti");
                } else if (height == 176) {
                    System.out.println("Átlagos");
                } else {
                    System.out.println("Átlag alatti");
                }
            }

            if (gender.equals("no")) {
                if (height > 164) {
                    System.out.println("Átlag feletti");
                } else if (height == 164) {
                    System.out.println("Átlagos");
                } else {
                    System.out.println("Átlag alatti");
                }
            }

        }
        if (hf == 4) {                                                                      // 4. Házi indul
            System.out.println("Házi 4.");          // 4. Házi feladat

            System.out.println("Add meg a-t!");
            double a = scanner.nextDouble();

            System.out.println("Add meg b-t!");
            double b = scanner.nextDouble();

            System.out.println("Add meg c-t!");
            double c = scanner.nextDouble();

            if (a * a + b * b == c * c || a * a == b * b + c * c || a * a + c * c == b * b) {
                System.out.println("Az");
            } else {
                System.out.println("nem az");
            }

        }




    }
}
