package com.java.learning;

public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }
        else{
            System.out.println("x%10 is: " +x%10 + " x/10 :" + x/10 + " y%10: " + y%10 + " y/10: " +y/10);
            return((x%10 == y%10)|| (x/10 == y %10) || (x%10 == y/10) || (x/10== y/10));
        }

    }
}

