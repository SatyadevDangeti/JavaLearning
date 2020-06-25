package com.java.learning;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
   public static void main(String[] args){
       LinkedList<String> placesToVisit = new LinkedList<String>();
       addInOrder(placesToVisit,"Kakinada");
       addInOrder(placesToVisit,"Melbourne");
       addInOrder(placesToVisit,"Singapore");
       addInOrder(placesToVisit,"kakinada");
       addInOrder(placesToVisit,"California");
       printList(placesToVisit);

   }
   private static void printList(LinkedList<String> linkedList){
       Iterator<String> i = linkedList.iterator();
       while(i.hasNext()){
           System.out.println("Now Visiting: " + i.next());
       }

       System.out.println("==============================");
   }

   private static boolean addInOrder(LinkedList<String> linkedList, String newCity){

       ListIterator<String> stringListIterator = linkedList.listIterator();
       while(stringListIterator.hasNext()){
           int comparison = stringListIterator.next().compareToIgnoreCase(newCity);
           if(comparison == 0){
               // equal, do not add
               System.out.println(newCity + " New City is already visited");
               return false;
           }
           else if(comparison > 0){
               //
               stringListIterator.previous();
               stringListIterator.add(newCity);
               return true;
           }
           else if(comparison < 0){

           }
       }
       stringListIterator.add(newCity);
       return true;
   }
   private static void visit(LinkedList cities){
       Scanner scanner = new Scanner(System.in);
       boolean quit = false;
       boolean goingForward = true;
       ListIterator<String> listIterator = cities.listIterator();
       if(cities.isEmpty()){

       }
   }











}

