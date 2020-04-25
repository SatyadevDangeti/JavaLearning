package com.java.learning;

public class Main {

    public static void main(String[] args) {


        byte myByteValue = 10;
        short myShortValue = 1000;
        int myIntValue = 100000;
        int sumValue = myByteValue + myShortValue + myIntValue;
        long myLongValue = 50000L + 10L * (sumValue);
        System.out.println("The Sum Value is " + sumValue);
        System.out.println("The long Value is " + myLongValue);


    }
}
