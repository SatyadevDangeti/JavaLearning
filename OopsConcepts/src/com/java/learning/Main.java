package com.java.learning;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car Hyundai = new Car();
        System.out.println(" Model of the car is :" + Hyundai.getModel());
        Hyundai.setModel("Sonata");
        System.out.println(" Model of the car updated to " + Hyundai.getModel());


        BankAccount adhyuAccount = new BankAccount();
        adhyuAccount.setBalance(1000000);

        adhyuAccount.withdrawal(10000);

        adhyuAccount.deposit(1000);

        EnhancedPlayer player = new EnhancedPlayer("Satyadev Dangeti", 170, "Sword");
        System.out.println("Initial Health is " + player.getHealth());

    }




}
