package com.java.coding;

public interface sample  {
  int i = 10;
   void add();
   default void show(){
       System.out.println("Interface I");
    }
    static void showStatic(){

    }
}
