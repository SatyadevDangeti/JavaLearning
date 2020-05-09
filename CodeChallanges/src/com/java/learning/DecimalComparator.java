package com.java.learning;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
      int x = (int)(number1 * 1000);
      int y = (int)(number2 * 1000);
      if(x==y){
          System.out.println("true");
          return true;
      }
      else {
          System.out.println("false");
          return false;
      }


    }
}
