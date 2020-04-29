package com.java.learning;

public class SwitchValue {
    public static void switchCaseCheck(char charValue) {
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
            case 'C':
            case 'D':
            case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Couldn't find A, B, C, D, or E");
                break;
        }
    }

    public static void switchCaseCheck(String stringValue) {
        switch (stringValue.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
            case "march":
            case "april":
            case "july":
            case "october":
                System.out.println(stringValue);
                break;
            default:
                System.out.println("Couldn't find any month");
                break;
        }
    }

    public static void printDayOfTheWeek(int Day) {
        switch (Day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
