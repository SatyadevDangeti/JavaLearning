package com.java.learning;

public class Main {
    public static void main(String[] args) {
        /*Positive Negative Zero Challenge*/
        PositiveNegativeZero.checkNumber(0);
        System.out.println("**************************");
        /* Speed Converter Challenge */
        System.out.println("**************************");
        SpeedConverter.printConversion(10.5);
        /* Other way to get the Speed Converter challenge */
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles:" + miles);
        SpeedConverter.printConversion(10.5);
        System.out.println("**************************");
        /*printMegaBytesAndKiloBytes Challenge*/
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("**************************");
        /*Barking Dog Challenge*/
        BarkingDog.shouldWakeUp(false, 7);
        System.out.println("**************************");
        int value = 1924;
        int value1 = value % 100;
        System.out.println(value1);
        System.out.println("**************************");
        /* Leap Year Calculator Challenge*/
        LeapYearCalculator.isLeapYear(1924);
        System.out.println("**************************");
        /*Feet conversion*/
        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-1, 1);
        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-165);
        System.out.println("**************************");
        /*Switch Value Challenge*/
        SwitchValue.switchCaseCheck('A');
        SwitchValue.switchCaseCheck("October");
        SwitchValue.printDayOfTheWeek(6);
        System.out.println("**************************");
        /*For Loop Challenge-Calculate Interest*/
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
        }
        System.out.println("**************************");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
        }
        System.out.println("**************************");
        System.out.println("**************************");
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (forLoopTask.isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 15) {

                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
        System.out.println("**************************");
        double j = Math.sqrt(2);
        System.out.println(j);
        System.out.println("**************************");
        forLoopTask.isPrime(11);
        System.out.println("**************************");
        /*While Loop- WhileDoWhileClass*/
        int number = 5;
        int finishNumber = 50;
        int evenNumberFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!IsEvenNumberValue.isEvenNumber(number)) {
                continue;

            }
            System.out.println("Even Number" + number);
            evenNumberFound++;
            if (evenNumberFound >= 10) {
                break;
            }

        }
        System.out.println("No of Even Number is " + evenNumberFound);
        System.out.println("**************************");

        /*do while loop -WhileDoWhileClass*/
    }

}
