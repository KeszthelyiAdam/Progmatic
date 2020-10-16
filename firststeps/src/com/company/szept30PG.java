package com.company;

public class szept30PG {

    public static void main(String[] args) {

        String s = "1bf";
        System.out.println(hexToDec(s));

    }

    public static int hexToDec(String hex){
         int sum =0;

        for (int i = 0; i < hex.length(); i++){
            char c = hex.charAt(i);
            int charValue;
            if (c<97){
                charValue = c - 48;
            }else {
                charValue = c - 87;
            }

            sum+= charValue * Math.pow(16,hex.length()-i-1);
        }
            return sum;
    }
}
