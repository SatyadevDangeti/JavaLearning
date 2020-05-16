package com.java.learning;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstNumber = 0;

        int lastNumber = number % 10;
        System.out.println("last Number :" +lastNumber);

        while(number != 0){
            firstNumber = number;
        number /= 10;
            System.out.println(" FirstNumber := " +firstNumber + " number: " + number);


        }
        return lastNumber+firstNumber;
    }
   public static int loopSum(int number){
        if(number > 9){
            int NewNumber = sumFirstAndLastDigit(number);
            return sumFirstAndLastDigit(NewNumber);
        }
        else
            return sumFirstAndLastDigit(number);
   }
}

