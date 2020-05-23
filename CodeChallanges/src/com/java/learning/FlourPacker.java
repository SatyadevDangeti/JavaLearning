package com.java.learning;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else if (((bigCount * 5) + (smallCount * 1)) < goal) {
            return false;
        } else if ((bigCount == 0) && (smallCount >= goal)) {

            return true;
        } else {
            int remainingGoal = goal % 5;
            return (smallCount >= remainingGoal) ;
        }

    }
}

