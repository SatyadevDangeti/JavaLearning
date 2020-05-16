package com.java.learning;

public class SumOdd {
    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (end < start)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
                System.out.println("sum is" + sum);
            }

        }
        return sum;

    }
}

