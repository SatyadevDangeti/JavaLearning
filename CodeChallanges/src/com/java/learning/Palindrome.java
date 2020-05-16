package com.java.learning;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
           number *= -1;
        }

        int reverse = 0;
        int storedValue = number;
        while (storedValue != 0) {

            int lastDigit = storedValue % 10;

            reverse = (reverse * 10) + lastDigit;
            storedValue /= 10;

        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

}


