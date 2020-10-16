package com.company;

public class TimeComplexity {

    public static void main(String[] args) {

    }

    public int solution(int[] Array) {

       int fullSum, num, sum = 0, n = 0;

        n = Array.length;
        num = n + 1;
        int missingNum = 0;

        if (n == 1) {
            return n;
        }


        fullSum =(int)(num * (num + 1)) / 2;

        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        missingNum = fullSum - sum;
        return missingNum;
    }
}
