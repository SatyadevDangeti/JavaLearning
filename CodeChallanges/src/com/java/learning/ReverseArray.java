package com.java.learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
 /*   public static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }*/
    public static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        for(int i = 0; i <array.length;i++){
            reverseArray[i] = array[array.length - 1 - i];

        }
        System.out.println("Reversed Array is :" + Arrays.toString(reverseArray));
    }
}

