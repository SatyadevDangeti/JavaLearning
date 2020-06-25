package com.java.learning;

import java.util.ArrayList;

public class Bank {
   private String bankName;
   private ArrayList<Branch> branches;

   public Bank(String bankName) {
      this.bankName = bankName;
      this.branches = new ArrayList<Branch>();
   }
   private Branch findBranch(String branchName){
      for(int i=0;i <this.branches.size();i++){
         Branch checkBranch = this.branches.get(i);
         if(checkBranch.getBranchName().equals(branchName)){
            return checkBranch;
         }
      }
      return null;
   }

   public boolean addBranch(String branchName){
      if(findBranch(branchName) == null){
   this.branches.add(new Branch(branchName));
   return true;
      }
      return false;
   }
   public boolean addCustomer(String branchName, String customerName, double initialAmount){
      Branch branch = findBranch(branchName);
      if(branch != null){
         return branch.newCustomer(customerName,initialAmount);
      }
      return false;
   }
   public boolean addCustomerTransaction(String branchName, String customerName, double amount){
      Branch branch = findBranch(branchName);
      if(branch != null){
         return branch.addCustomerTransaction(customerName, amount);
      }
      return false;
   }
   public boolean listCustomers(String branchName, boolean showTransactions) {
      Branch branch = findBranch(branchName);
      if (branch != null) {
         System.out.println("Customer details for the Branch" + branch.getBranchName());
         ArrayList<Customer> branchCustomers = branch.getCustomers();
         for (int i = 0; i < branchCustomers.size(); i++) {
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getCustomerName() + "[" + (i + 1) + "]");
            if (showTransactions) {
               System.out.println("Transactions for the customer in this Branch: ");
               ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
               for (int j = 0; j < customerTransactions.size(); j++) {
                  System.out.println("[" + (j + 1) + "] Amount " + customerTransactions.get(j)); //unboxing customerTransactions.get(j).doubleValue()
               }
            }
         }
         return true;
      } else {
         return false;
      }

   }

}
