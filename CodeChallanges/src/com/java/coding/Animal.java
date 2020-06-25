package com.java.coding;

public class Animal {
    private int size;
    private String name;

    public Animal() {

    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return this.name;
    }

    public Animal(String theName) {
        this.name = theName;
    }
    public Animal(int size){

    }
    public Animal(String name, int size){

    }

    public void behavior(){
        System.out.println("Animal Behaviour");
    }

    public  void testing(){
        System.out.println("Testing static in parent class");
    }

    public void superUsage(){
        System.out.println("use this super method from parent");
    }
}
