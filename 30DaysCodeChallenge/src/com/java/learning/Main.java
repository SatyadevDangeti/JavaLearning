package com.java.learning;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      /* // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
        System.out.println();

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        *//* Declare second integer, double, and String variables. *//*
        int j = scan.nextInt();
        double e = scan.nextDouble();
        String t =  scan.next();
        *//* Read and save an integer, double, and String to your variables.*//*
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        *//* Print the sum of both integer variables on a new line. *//*
        System.out.println(i+j);

        *//* Print the sum of the double variables on a new line. *//*
		System.out.println(d+e);
        *//* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. *//*
        System.out.println( s + t + scan.nextLine());

        System.out.println();
        scan.close(); */


  /*      double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Solution.solve(meal_cost, tip_percent, tax_percent);

        scanner.close();*/
/*
            int N = scanner.nextInt();



            if(N >= 1 && N <=100) {


                if (N % 2 == 1) {
                    System.out.println("Weird");
                } else if (N % 2 == 0 && (N >= 2 && N <= 5)) {
                    System.out.println("Not Weird");
                } else if (N % 2 == 0 && (N >= 6 && N <= 20)) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();*/

/*        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();*/
        int n = scanner.nextInt();
        for(int i = 1; i <=10 ; i ++){

            System.out.println(+n +" x " + i + " = " +(n*i));
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }

}
