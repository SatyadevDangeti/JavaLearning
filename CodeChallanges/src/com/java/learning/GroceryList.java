package com.java.learning;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    private static Scanner scanner = new Scanner(System.in);

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    private void addGroceryItem(String item){

            groceryList.add(item);
    }
    private void modifyGroceryItem(int position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery Item: " +(position +1) + " has been modified.");
    }
    private void modifyGroceryItem(String currentItem, String item){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position,item);
        }
    }
    private void removeGroceryItem(int position){

        groceryList.remove(position);
    }
    private void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    private void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println(i+1 +". "  + groceryList.get(i));
        }
    }
    private int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
/*        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return groceryList.get(position);
        }
        return null;*/
        return groceryList.indexOf(searchItem);
    }
    private boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        }
        return false;
    }
    public void inputGroceryList(){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                   printGroceryList();
                   break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit =true;
                    break;
            }
        }
    }
    private  void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(getGroceryList());
        System.out.println(newArray);
/*        ArrayList<String> nextArray = new ArrayList<>(getGroceryList());
        System.out.println(nextArray);
        String[] myArray = new String[getGroceryList().size()];
        myArray = getGroceryList().toArray(myArray);
        System.out.println(Arrays.toString(myArray));*/
    }
    private static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0- To print choice of options.");
        System.out.println("\t 1- To print the list of grocery items.");
        System.out.println("\t 2- To add an item to the list.");
        System.out.println("\t 3- To modify an item to the list.");
        System.out.println("\t 4- To remove an item from the list.");
        System.out.println("\t 5- To search for an item in the list.");
        System.out.println("\t 6- To Process the Grocery List.");
        System.out.println("\t 7- To quit the application.");

    }
    private void addItem(){
        System.out.print("Please enter the grocery item: ");
        addGroceryItem(scanner.nextLine());
    }
    private void modifyItem(){
        System.out.print("Enter item: ");
        String existingItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        modifyGroceryItem(existingItem,newItem);
    }
    private void removeItem(){
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();
        removeGroceryItem(item);
    }
    private void searchItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(onFile(searchItem)){
            System.out.println("Found " +searchItem + " in our grocery list");
        }
        else{
            System.out.println(searchItem+ " is not available in the grocery list");
        }

    }
}
