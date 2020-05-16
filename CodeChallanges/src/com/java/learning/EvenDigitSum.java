package com.java.learning;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenNumber = 0;
        while (number != 0) {

            int storedNumber = number % 10;
            if (storedNumber % 2 == 0) {
                evenNumber += storedNumber;
            }
            number /= 10;

        }
        return evenNumber;
    }


}

