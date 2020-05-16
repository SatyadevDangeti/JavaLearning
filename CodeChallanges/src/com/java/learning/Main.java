package com.java.learning;

public class Main {
    public static void main(String[] args) {
//        /*Positive Negative Zero Challenge*/
//        PositiveNegativeZero.checkNumber(0);
//        System.out.println("**************************");
//        /* Speed Converter Challenge */
//        System.out.println("**************************");
//        SpeedConverter.printConversion(10.5);
//        /* Other way to get the Speed Converter challenge */
//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles:" + miles);
//        SpeedConverter.printConversion(10.5);
//        System.out.println("**************************");
//        /*printMegaBytesAndKiloBytes Challenge*/
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        System.out.println("**************************");
//        /*Barking Dog Challenge*/
//        BarkingDog.shouldWakeUp(false, 7);
//        System.out.println("**************************");
//        int value = 1924;
//        int value1 = value % 100;
//        System.out.println(value1);
//        System.out.println("**************************");
//        /* Leap Year Calculator Challenge*/
//        LeapYearCalculator.isLeapYear(1924);
//        System.out.println("**************************");
//        /*Feet conversion*/
//        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-1, 1);
//        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-165);
//        System.out.println("**************************");
//        /*Switch Value Challenge*/
//        SwitchValue.switchCaseCheck('A');
//        SwitchValue.switchCaseCheck("October");
//        SwitchValue.printDayOfTheWeek(6);
//        System.out.println("**************************");
//        /*For Loop Challenge-Calculate Interest*/
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
//        }
//        System.out.println("**************************");
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
//        }
//        System.out.println("**************************");
//        System.out.println("**************************");
//        int count = 0;
//        for (int i = 10; i <= 50; i++) {
//            if (forLoopTask.isPrime(i)) {
//                count++;
//                System.out.println(i + " is a prime number");
//                if (count == 15) {
//
//                    System.out.println("Exiting the loop");
//                    break;
//                }
//            }
//        }
//        System.out.println("**************************");
//        double j = Math.sqrt(2);
//        System.out.println(j);
//        System.out.println("**************************");
//        forLoopTask.isPrime(11);
//        System.out.println("**************************");
//        /*While Loop- WhileDoWhileClass*/
//        int number = 5;
//        int finishNumber = 50;
//        int evenNumberFound = 0;
//        while (number <= finishNumber) {
//            number++;
//            if (!IsEvenNumberValue.isEvenNumber(number)) {
//                continue;
//
//            }
//            System.out.println("Even Number" + number);
//            evenNumberFound++;
//            if (evenNumberFound >= 10) {
//                break;
//            }
//
//        }
//        System.out.println("No of Even Number is " + evenNumberFound);
//        System.out.println("**************************");
//
//        /*do while loop -WhileDoWhileClass*/
//
//        int number1 = 45 % 60;
//        int number2 = 45 / 60;
//
//        System.out.println(number1 + " " + number2);
//
//        /*Decimal Comparator*/
//        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
//        /*EqualSumChecker*/
//        EqualSumChecker.hasEqualSum(1, 0, 1);
//        /*Teen Number Checker*/
//        TeenNumberChecker.hasTeen(12,4,12);
//        TeenNumberChecker.isTeen(4);
//        /*Seconds & Minutes Challenge*/
//
//        System.out.println(HourMinuteSecond.getDurationString(150, 45));
//        System.out.println(HourMinuteSecond.getDurationString(3567L));
//        System.out.println(HourMinuteSecond.getDurationString(-34));
//        /*Area Calculator*/
//        System.out.println(AreaCalculator.area(15));
//        System.out.println(AreaCalculator.area(10,10));
//        System.out.println(AreaCalculator.area(-2));
//        System.out.println(AreaCalculator.area(-1,0));
//        /*Conversion*/
//        long hours = 3600 / 60;
//        long remainingmin = 3600 % 60;
//        long days = hours / 24;
//        long year = days / 365;
//        long remainsdays = days % 365;
//
//        System.out.println(hours + "  " + remainingmin + "  " + days + " " + year + "  "+ remainsdays );
//        /*Minutes2Days2Hours*/
//        Minutes2Years2Days.printYearAndDays(1440);
//        /*Equality Printer*/
//        EqualityPrinter.printEqual(1,1,1);
//        EqualityPrinter.printEqual(-1,1,1);
//        EqualityPrinter.printEqual(1,2,1);
//        EqualityPrinter.printEqual(2,1,1);
//        EqualityPrinter.printEqual(2,1,2);
//        EqualityPrinter.printEqual(1,1,2);
//        EqualityPrinter.printEqual(1,2,3);
//        /*Playing Cat*/
//        System.out.println(PlayingCat.isCatPlaying(true,10));
//        System.out.println(PlayingCat.isCatPlaying(false,36));
//        System.out.println(PlayingCat.isCatPlaying(false,35));
//        System.out.println(PlayingCat.isCatPlaying(true,45));
//        /*Number In Word Challenge*/
//        NumberInWord.printNumberInWord(-1);
//        /*Number of Days in Month*/
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2019));
//        /*Is ODD*/
//        System.out.println(SumOdd.isOdd(-1));
//        /*Sum Odd Challenge*/
//        System.out.println(SumOdd.sumOdd(1,50));
//          /*Palindrome Challenge*/
//        System.out.println(Palindrome.isPalindrome(-1221));
//        /*First And Last Number*/
//        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(010));
//        /*Loop Sum*/
//        System.out.println(FirstAndLastDigitSum.loopSum(010));
          /*Even Sum Challenge*/
        System.out.println(EvenDigitSum.getEvenDigitSum(458));
    }
    }


