package com.java.learning;


public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;


            }

        }
        return number;
    }
    public static int getLargestPrimeNumber(int number){
        if(number <2){
            return -1;
        }
      int primeNumber = 0;
        for (int i = 2 ;i <= Math.sqrt(number) ; i ++){
            while(number % i == 0){
                System.out.println("Prime Numbers: " +i);
                number /= i;
                System.out.println("Prime: "  + number);
 primeNumber = i;


            }

        }
        return number > primeNumber ? number : primeNumber;
    }
}



