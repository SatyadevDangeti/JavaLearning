package com.java.learning;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number <=1){
            return false;
        }
        int sum =0;
        for(int i =1 ; i<number ; i++){

            if(number%i == 0){
                sum = sum + i;
                System.out.println("Sum is : " +sum);
                }

                }

return (sum == number);
    }
}
