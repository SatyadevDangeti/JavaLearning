package com.java.learning;

public class Main {

    public static void main(String[] args) {

        char myChar = 'S';
        char myUnicodeChar = '\u0044';
        char myUnicodeChar1 = '\u00A9';
        System.out.println("My values " + myChar  +myUnicodeChar  +myUnicodeChar1);
        boolean myTrueVal = true;
        boolean myFalseVal = false;
        boolean isCustomerOver18 = true;
        String myStringValue = "This is JavaCourse";
        System.out.println("My String is now :" + myStringValue);
        myStringValue =myStringValue + ", Lets Learn it";
        System.out.println("My String is now :" + myStringValue);
        myStringValue = myStringValue + " \u00A9 2020";
        System.out.println("My String is now :" + myStringValue);

        int myOperandResult = 10;
        myOperandResult++;
        System.out.println("Now the results is :" +myOperandResult);
        myOperandResult -= 5;
        System.out.println("Now the new result is:" +myOperandResult);
        myOperandResult *= 10;
        System.out.println("Now the new result is:" +myOperandResult);
        myOperandResult /= 5;
        System.out.println("Now the new result is:" +myOperandResult);
        myOperandResult %= 5;
        System.out.println("Now the new result is:" +myOperandResult);
        int booleanValueCustomer = 31;
        if(booleanValueCustomer <= 18) {
            System.out.println("Customer is Under Age");
        }
        else {
            System.out.println("Customer is legal Age");
        }
        int feasibleAge = 46;
        if((booleanValueCustomer <=18) || (feasibleAge >46)) {
            System.out.println("Almost there");
        }
        else {
            System.out.println("You still got it");
        }

        double myFirstVariable = 20d;
        double mySecondVariable = 80d;
        double myThirdVariable = (myFirstVariable + mySecondVariable) * 100d;
        System.out.println("Value :" +myThirdVariable);
        myThirdVariable = myThirdVariable % 40;
        System.out.println("Value :" +myThirdVariable);
         boolean isNoRemainder = (myThirdVariable == 0) ? true :false;
        System.out.println("Value :" +isNoRemainder);
    if(!isNoRemainder){
        System.out.println("Got some Remainder");

    }






    }
}
