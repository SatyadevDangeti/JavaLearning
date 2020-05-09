package com.java.learning;

public class TeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3){
        if((number1 >=13 && number1 <=19) || (number2 >=13 && number2 <=19) || (number3 >=13 && number3 <=19)){
            System.out.println("Number Has a  Teen");
            return true;
        }
        else{
            System.out.println("Number Not a Teen");
            return false;
        }
    }

    public static boolean isTeen(int number1){
        if((number1 >=13 && number1 <=19)){
            System.out.println("Number is Teen");
            return true;
        }
        else{
            System.out.println("Number Not a Teen");
            return false;
        }
    }
}
