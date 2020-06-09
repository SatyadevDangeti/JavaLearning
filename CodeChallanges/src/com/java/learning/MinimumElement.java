package com.java.learning;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scan = new Scanner(System.in);


    static int[] readIntegers(int count){

        int [] array = new int[count];

        for(int i =0; i < array.length ; i ++){
            System.out.println("Enter numbers to include in an Array: ");
            int number = scan.nextInt();
            scan.nextLine();
            array[i] = number;

        }
        return (array);



    }

/*    static void reverse(int[] array){
        System.out.println("Enter count of the Array: ");
        int count = scan.nextInt();
        scan.nextLine();
        int[] returnedArray = readIntegers(count);

            for (int i = 0; i < returnedArray.length; i++) {
              returnedArray[count -1] = array[i];
              count = count -1;

        }
            for(int j =0 ; j < returnedArray.length ;j ++)
            {
                System.out.println((returnedArray[j]));

            }


    }*/
    static int findMinimum(int[] array){
        Arrays.sort(array);

        return array[0];
    }
    static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i =0; i < array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }

        }
        return min;
    }


}
