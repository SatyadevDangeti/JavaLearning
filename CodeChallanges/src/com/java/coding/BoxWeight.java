package com.java.coding;

public class BoxWeight extends Box{
    double i;
    BoxWeight(){
        super();
        i = -1;
    }
    BoxWeight(double len, double w){
        super.i = len * w;
        super.volume();
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
