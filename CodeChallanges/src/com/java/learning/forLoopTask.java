package com.java.learning;

public class forLoopTask {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            System.out.println(n + " is not prime");
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                return false;
            }
        }
        System.out.println(n + " is  prime");
        return true;

    }
}
