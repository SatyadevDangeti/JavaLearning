package com.java.learning;

public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i + " ");

            }

        }

    }
}