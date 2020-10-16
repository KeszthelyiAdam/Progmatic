package com.company;

import java.util.Scanner;

public class Elagazasok1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hány éves vagy? (Írj be egy számot!)");
        int Age = sc.nextInt();

        if ( Age < 0){
            System.out.println("mínusz??? ");
        }
        if ( Age <= 3 && Age >= 0){
            System.out.println("0-3 ");
        }
        if ( Age <= 13 && Age >= 4){
            System.out.println("4-13 ");
        }
        if ( Age <= 20 && Age >= 14){
            System.out.println("14-20");
        }
        if ( Age >= 20){
            System.out.println("20 felett");
        }
        //        } System.out.println(j);
    }
}
