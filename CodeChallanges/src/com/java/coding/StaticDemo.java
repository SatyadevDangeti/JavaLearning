package com.java.coding;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class StaticDemo {
    static int i;
    int j;
    public static void checkStatic(){

         StaticDemo c = new StaticDemo();
         c.j = 10;
         i = c.j;
        System.out.println("values is:" +i);
    }

    public void checkNonStatic(){

        i++;
        i = i+j;
        System.out.println("value of non static i is: " +i);
    }
    static class InnerStaticDemo{
        int i = 1008;
    }
    class NonStaticInnerClassDemo{

    }
    static {
        i = 10;
        checkStatic();



    }
    public static void main(String[] args){
        checkStatic();
        i = 20;

        System.out.println("value of i " +i);

        StaticDemo d = new StaticDemo();
        d.checkNonStatic();
        InnerStaticDemo demo = new InnerStaticDemo();
        StaticDemo.InnerStaticDemo demo1 = new StaticDemo.InnerStaticDemo();
        demo.i = 60;
        System.out.println("demo: " +demo.i);
        demo1.i = 100;
        System.out.println("demo1: " + demo1.i);
    }


}
