package com.java.learning;

import java.util.Scanner;


public class InputCalculator {
/*  public static void inputThenPrintSumAndAverage(){
      Scanner scanner = new Scanner(System.in);
      int sum = 0;
      long avg = 0;
      int count = 0;
      boolean firstNumber = true;
      while(true) {
          System.out.println("Enter Number : ");
          boolean isAnInt = scanner.hasNextInt();

          if (isAnInt) {
              int number = scanner.nextInt();
              if (firstNumber) {
                  firstNumber = false;
                  sum = 0;
                  avg = 0;
              }
              sum+=number;
              count+=1;


          }
          else{
              avg=Math.round((double) sum/count);
              break;
          }
          scanner.nextLine();
      }
      System.out.println("SUM = " +sum + " AVG = " +avg);

  }*/

    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            if (!input.hasNextInt()) break;

            sum += input.nextInt();
            count++;

            input.nextLine();


        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
        input.close();
    }
}
