package com.java.learning;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scan = new Scanner(System.in);


    static int[] getIntegers(int number){
        int[] myArray = new int[number];
       System.out.println("Enter " +number + " numbers you want to sort .\r");


        for(int i = 0; i<myArray.length; i++) {
           myArray[i] = scan.nextInt();
       }


       return myArray;

    }

    static void printArray(int [] printArray){
        Arrays.sort(printArray);
        Arrays.toString(printArray);

        for (int i=0; i<printArray.length ; i ++){
            System.out.println("Descending Order for the entered Numbers: " + printArray[i]);
        }


    }

    static int[] sortIntegers(int [] myArray){
//        int [] sortedArray = new int[myArray.length];
//         for(int i =0;i<myArray.length; i ++){
//             sortedArray[i] = myArray[i];
//         }
         int [] sortedArray = Arrays.copyOf(myArray,myArray.length);
         boolean flag = true;
         int temp;
         while(flag){
             flag =false;
            for(int i=0;i<sortedArray.length-1;i++)  {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1] =temp;
                    flag = true;
                }
            }
         }
return sortedArray;

    }

}
