package com.java.learning;

public class GreatestCommonDivisor {
    private static final int INVALID_VALUE = -1;

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return INVALID_VALUE;
        }
        int min = Math.min(first, second);
        System.out.println("Min Value :"  + min);
        int greatestCommonDivisor = 1;
        for(int j =1 ; j<=min; j++){
            if((first % j == 0) && (second % j == 0)){
                System.out.println("J Values: " +j);
               greatestCommonDivisor = j;

            }
        }
        return greatestCommonDivisor;
    }

    }

