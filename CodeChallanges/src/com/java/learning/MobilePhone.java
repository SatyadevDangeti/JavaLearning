package com.java.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MobilePhone {
    private long myNumber;
    private ArrayList<Contact> myContacts;




    private static Scanner scanner = new Scanner(System.in);
    public MobilePhone(int myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }
    private boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already added to Contact list");
            return false;

        }
        myContacts.add(contact);
        return true;
    }

    private boolean updateContact(Contact oldContact, Contact newContact) {
        int contactPosition = findContact(oldContact);
        if (contactPosition < 0) {
            System.out.println(oldContact.getName() + ", is not available in the Contact list");
            return false;
        }
        else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists . Updates not Successful");
            return false;
        }
        this.myContacts.set(contactPosition, newContact);
        System.out.println(oldContact.getName() + " , is now replaced with " + newContact.getName());
        return true;

    }

    private boolean removeContact(Contact Contact) {
        int contactPosition = findContact(Contact);
        if (contactPosition < 0) {
            System.out.println(Contact.getName() + ", is not available in the Contact list");
            return false;
        }
        this.myContacts.remove(contactPosition);
        System.out.println(Contact.getName() + " , is now removed from the Contact list");
        return true;

    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();

        }
        return null;
    }
    private Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
    private void printContacts(){
        System.out.println("You have " + myContacts.size() + " contacts in your list");
        System.out.println("Contact List :");
        for(int i=0;i<myContacts.size();i++)
        {
            System.out.println(i+1 +". "  + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }



    public void optionSelection() {
        boolean quit = false;
        startPhone();
        instructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContactName();
                    break;
                case 3:
                    updateContactName();
                    break;
                case 4:
                    removeContactName();
                    break;
                case 5:
                    searchContacts();
                    break;
                case 6:
                    processContact();
                    break;
                case 7:
                    methodsValues();
                    break;
                case 8:
                     instructions();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone...");
    }

    private void processContact() {
/*        ArrayList<Contact> contactList = new ArrayList<>(getMyContacts());
        System.out.println(contactList);*/
        String[] myArray = new String[getMyContacts().size()];
        myArray = getMyContacts().toArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private void searchContacts() {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = queryContact(name);
        if(existingContactRecord == null){
            System.out.println(" Contact not found ");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", phone number is : " +existingContactRecord.getPhoneNumber());
    }

    private void removeContactName() {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = queryContact(name);
        if(existingContactRecord == null){
            System.out.println(" Contact not found ");
            return;
        }
        if(removeContact(existingContactRecord)){
            System.out.println("Successfully Deleted");
        }
        else{
            System.out.println("Error deleting contact");
        }
    }

    private void updateContactName() {
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = queryContact(name);
        if(existingContactRecord == null){
            System.out.println(" Contact not found ");
            return;
        }
        System.out.println("Enter New Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter New Phone Number: ");
        long newPhone = scanner.nextLong();
        Contact newContact = Contact.createContact(newName,newPhone);
        if(updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record");
        }
        else{
            System.out.println("Error updating the record");
        }

    }

    private void addContactName() {
        System.out.println("Enter New Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        long phone = scanner.nextLong();
        Contact newContact = Contact.createContact(name,phone);
        if(addNewContact(newContact)){
            System.out.println("New Contact added : name = "  + name  + ", phone = " +phone);
        }
        else {
            System.out.println("Can't add," + name + " as it is already on the list.");
        }

    }


    private static void instructions() {
        System.out.println("\n Available options: \n press");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n"+
                "2 - to add a new contact\n"+
                "3 - to update an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - to query if contact exists\n"+
                "6 - to process contacts list\n"+
                "7 - to print list of options\n"
        );
    }
    private void methodsValues(){
        //myContacts.forEach(contact -> System.out.println(contact));
        myContacts.retainAll(myContacts);
        myContacts.toString();
    }
    }
