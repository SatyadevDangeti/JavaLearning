package com.java.learning;

import java.util.ArrayList;
import java.util.LinkedList;

public class Customer {
   private String customerName;
   private ArrayList<Double> transactions;
   private LinkedList<Double> Amount;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }
    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
