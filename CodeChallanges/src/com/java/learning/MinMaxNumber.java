package com.java.learning;

import java.util.Scanner;

public class MinMaxNumber {
    public static void minMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean firstNumber = true;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if(firstNumber){
                    firstNumber = false;
                    min = number;
                    max =number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum Number is: " + min + " Maximum Number is : " + max);
    }
}
