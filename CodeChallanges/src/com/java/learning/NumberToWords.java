
package com.java.learning;


public class NumberToWords {
    public static int reverse(int number) {
        int reverse = 0;
        int storedNumber = number;
        while (storedNumber != 0) {
            int lastDigit = storedNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            storedNumber /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            int storedNumber = number;
            while (storedNumber != 0) {

                storedNumber /= 10;

                count++;

            }
            return count;

        }

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {

            System.out.println("Zero");
        }
        int lastDigit = 0;
        int storedNumber = reverse(number);

        while (storedNumber != 0) {
            lastDigit = storedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            storedNumber /= 10;

        }
        if (getDigitCount(number) != getDigitCount(reverse(number))) {
            int missingNumber = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 1; i <= missingNumber; i++) {
                System.out.println("Zero");
            }
        }
    }
}

/*

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

        System.out.println();
    }

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
*/
