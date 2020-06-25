package com.java.learning;


import com.java.coding.Animal;
import com.java.coding.Hippo;
import com.java.coding.InterfaceDemo;



import java.util.*;


public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

//        /*Positive Negative Zero Challenge*/
//        PositiveNegativeZero.checkNumber(0);
//        System.out.println("**************************");
//        /* Speed Converter Challenge */
//        System.out.println("**************************");
//        SpeedConverter.printConversion(10.5);
//        /* Other way to get the Speed Converter challenge */
//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles:" + miles);
//        SpeedConverter.printConversion(10.5);
//        System.out.println("**************************");
//        /*printMegaBytesAndKiloBytes Challenge*/
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        System.out.println("**************************");
//        /*Barking Dog Challenge*/
//        BarkingDog.shouldWakeUp(false, 7);
//        System.out.println("**************************");
//        int value = 1924;
//        int value1 = value % 100;
//        System.out.println(value1);
//        System.out.println("**************************");
//        /* Leap Year Calculator Challenge*/
//        LeapYearCalculator.isLeapYear(1924);
//        System.out.println("**************************");
//        /*Feet conversion*/
//        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-1, 1);
//        InchCentimeterFeetConverter.calcFeetAndInchesToCentimeters(-165);
//        System.out.println("**************************");
//        /*Switch Value Challenge*/
//        SwitchValue.switchCaseCheck('A');
//        SwitchValue.switchCaseCheck("October");
//        SwitchValue.printDayOfTheWeek(6);
//        System.out.println("**************************");
//        /*For Loop Challenge-Calculate Interest*/
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
//        }
//        System.out.println("**************************");
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", forLoopTask.calculateInterest(10000.0, i)));
//        }
//        System.out.println("**************************");
//        System.out.println("**************************");
//        int count = 0;
//        for (int i = 10; i <= 50; i++) {
//            if (forLoopTask.isPrime(i)) {
//                count++;
//                System.out.println(i + " is a prime number");
//                if (count == 15) {
//
//                    System.out.println("Exiting the loop");
//                    break;
//                }
//            }
//        }
//        System.out.println("**************************");
//        double j = Math.sqrt(2);
//        System.out.println(j);
//        System.out.println("**************************");
//        forLoopTask.isPrime(11);
//        System.out.println("**************************");
//        /*While Loop- WhileDoWhileClass*/
//        int number = 5;
//        int finishNumber = 50;
//        int evenNumberFound = 0;
//        while (number <= finishNumber) {
//            number++;
//            if (!IsEvenNumberValue.isEvenNumber(number)) {
//                continue;
//
//            }
//            System.out.println("Even Number" + number);
//            evenNumberFound++;
//            if (evenNumberFound >= 10) {
//                break;
//            }
//
//        }
//        System.out.println("No of Even Number is " + evenNumberFound);
//        System.out.println("**************************");
//
//        /*do while loop -WhileDoWhileClass*/
//
//        int number1 = 45 % 60;
//        int number2 = 45 / 60;
//
//        System.out.println(number1 + " " + number2);
//
//        /*Decimal Comparator*/
//        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
//        /*EqualSumChecker*/
//        EqualSumChecker.hasEqualSum(1, 0, 1);
//        /*Teen Number Checker*/
//        TeenNumberChecker.hasTeen(12,4,12);
//        TeenNumberChecker.isTeen(4);
//        /*Seconds & Minutes Challenge*/
//
//        System.out.println(HourMinuteSecond.getDurationString(150, 45));
//        System.out.println(HourMinuteSecond.getDurationString(3567L));
//        System.out.println(HourMinuteSecond.getDurationString(-34));
//        /*Area Calculator*/
//        System.out.println(AreaCalculator.area(15));
//        System.out.println(AreaCalculator.area(10,10));
//        System.out.println(AreaCalculator.area(-2));
//        System.out.println(AreaCalculator.area(-1,0));
//        /*Conversion*/
//        long hours = 3600 / 60;
//        long remainingmin = 3600 % 60;
//        long days = hours / 24;
//        long year = days / 365;
//        long remainsdays = days % 365;
//
//        System.out.println(hours + "  " + remainingmin + "  " + days + " " + year + "  "+ remainsdays );
//        /*Minutes2Days2Hours*/
//        Minutes2Years2Days.printYearAndDays(1440);
//        /*Equality Printer*/
//        EqualityPrinter.printEqual(1,1,1);
//        EqualityPrinter.printEqual(-1,1,1);
//        EqualityPrinter.printEqual(1,2,1);
//        EqualityPrinter.printEqual(2,1,1);
//        EqualityPrinter.printEqual(2,1,2);
//        EqualityPrinter.printEqual(1,1,2);
//        EqualityPrinter.printEqual(1,2,3);
//        /*Playing Cat*/
//        System.out.println(PlayingCat.isCatPlaying(true,10));
//        System.out.println(PlayingCat.isCatPlaying(false,36));
//        System.out.println(PlayingCat.isCatPlaying(false,35));
//        System.out.println(PlayingCat.isCatPlaying(true,45));
//        /*Number In Word Challenge*/
//        NumberInWord.printNumberInWord(-1);
//        /*Number of Days in Month*/
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2019));
//        /*Is ODD*/
//        System.out.println(SumOdd.isOdd(-1));
//        /*Sum Odd Challenge*/
//        System.out.println(SumOdd.sumOdd(1,50));
//          /*Palindrome Challenge*/
//        System.out.println(Palindrome.isPalindrome(-1221));
//        /*First And Last Number*/
//        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(010));
//        /*Loop Sum*/
//        System.out.println(FirstAndLastDigitSum.loopSum(010));
//          /*Even Sum Challenge*/
//        System.out.println(EvenDigitSum.getEvenDigitSum(458));
//         /* Shared Digit*/
//        System.out.println(SharedDigit.hasSharedDigit(19,99));
//        /*Last Digit Checker*/
//        System.out.println(LastDigitChecker.hasSameLastDigit(11,42,21));
//        /* Greatest Common Divisor*/
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(56,12));
//          /*Factors printer*/
//        FactorPrinter.printFactors(21);
//          /*Perfect Number*/
//        System.out.println(PerfectNumber.isPerfectNumber(28));
//          /*Number2Word*/
//        System.out.println(NumberToWords.reverse(5200));
//        System.out.println(NumberToWords.getDigitCount(1000));
//        NumberToWords.numberToWords(5430);
//        /*Flour Packer challenge*/
//        System.out.println(FlourPacker.canPack(1,0,4));
//         /*Largest Prime Number*/
//        System.out.println(LargestPrime.getLargestPrime(45));
//       System.out.println(LargestPrime.getLargestPrimeNumber(45));
//         /*Diagonal Star*/
//        DiagonalStar.printSquareStar(5);
//         /*Min Max Number with User Input*/
//        MinMaxNumber.minMaxNumber();
//        /*Input Calculator*/
//        InputCalculator.inputThenPrintSumAndAverage();
//         /*Array Descending Sort Challenge*/
//        int[] sortNumbers = ArrayChallenge.getIntegers(5);
//        ArrayChallenge.printArray(sortNumbers);
//          In built Array
//          int[] sortNumbers = ArrayChallenge.getIntegers(5);
//          ArrayChallenge.printArray(sortNumbers);
        /* Minimum Element Challenge*/
//        System.out.println("Enter count of the Array: ");
//        int count = scan.nextInt();
//        scan.nextLine();
//        int[] returnedArray = MinimumElement.readIntegers(count);
//        int returnedMin = MinimumElement.findMin(returnedArray);
//        System.out.println("Array is : " + Arrays.toString(returnedArray));
//
//        System.out.println("Minimum Element in the Array is : " +returnedMin);
//        /*Reverse Array Challenge*/
//        ReverseArray.reverse(returnedArray);
/******************** Arrays Decompiling and Exercises from java books *******************************/
/* Decompile Arrays*/
//        Books[] myBooks = new Books[3];
//        int x = 0;
//        myBooks[0] = new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
//        myBooks[0].title = "The Grapes of Java";
//        myBooks[1].title = "The Java Gatsby";
//        myBooks[2].title = "The Java Cookbook";
//        myBooks[0].author = "Bob";
//        myBooks[1].author = "Sue";
//        myBooks[2].author = "Ian";
//        while(x <3){
//            System.out.println(myBooks[x].title + " by " + myBooks[x].author);
//            x = x+1;
//        }
//        Books[] h = new Books[3];
//        int z = -1;
//        while(z<2){
//            z = z +1;
//            h[z] = new Books();
//
//            h[z].name = "bilbo";
//
//            if(z ==1){
//
//                h[z].name = "frodo";
//            }
//            if(z==2){
//                h[z].name = "sam";
//            }
//            System.out.println(h[z].name + " is a good Hobbit name");
//        }
/*Code Magnet Arrays*/
//        int[] index = new int[4];
//        index[0] = 1;
//        index[1] = 3;
//        index[2] = 0;
//        index[3] = 2;
//        String[] islands = new String[4];
//        islands[0] = "Bermuda";
//        islands[1] = "Fiji";
//        islands[2] = "Azores";
//        islands[3] = "Cozumel";
//
//          int y = 0;
//          int ref;
//          while(y <4){
//              ref = index[y];
//              System.out.print("island = ");
//              System.out.println(islands[ref]);
//              y = y +1;
//          }
        /*Pool Puzzle*/
//        int x =0;
//        Triangle[] ta = new Triangle[4];
//
//        while(x < 4){
//            ta[x] = new Triangle();
//            ta[x].height = (x + 1) * 2;
//            ta[x].length = x + 4;
//            System.out.print("triangle " +x+ ", area");
//            System.out.println(" = " + ta[x].setArea());
//            x = x+1;
//        }
//        int y = x;
//        x= 27;
//        Triangle t5 = ta[2];
//        ta[2].area = 343;
//        System.out.println("y = " +y);
//        System.out.println(", t5 area = " +t5.area);
        /*Heap Quiz Arrays-Book*/
//        int x =0;
//        HeapQuiz[] hq = new HeapQuiz[5];
//        while(x<3){
//            hq[x] = new HeapQuiz();
//            hq[x].id = x;
//            x = x+1;
//
//        }
//        hq[3] = hq[1];
//        hq[4] = hq[1];
//        hq[3] = null;
//        hq[4] = hq[0];
//        hq[0] = hq[3];
//        hq[3] = hq[2];
//        hq[2] = hq[0];
//
//        System.out.println(Arrays.toString(hq));
////        System.out.println(hq[0].id);
//        System.out.println(hq[1].id);
////        System.out.println(hq[2].id);
//        System.out.println(hq[3].id);
//        System.out.println(hq[4].id);

 /**************** Code checks and analysis **************************************/
//  int month_days[] = new int[12]; // int num[],num1[],num2[];
//  int [] month_days1 = new int[12];  // int [] num,num1,num2;
//  int month_days2[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//  int [] copy = (int[]) month_days2.clone();
//        System.arraycopy(copy,1,month_days1,0,6);
//        System.out.println(Arrays.toString(copy));
//
//        char[] greet = { 'h','e','l','l','o' };
//        char[] cuss = greet; // cuss holds the same reference
//        cuss[4] = '!'; // Use reference to change an element
//        System.out.println(greet);
//        int x = 10;
//        int y = x;
//
//        System.out.println(x +" + " + y);
//        y = y +x;
//        System.out.println(x +" + " + y);
//        Point p = new Point(1, 2);
//        Point q = p;
//        System.out.println(p.x); // Print out the x coordinate of p: 1.0
//        q.x = 13; // Now change the X coordinate of q
//        System.out.println(p.x); // Print out p.x again; this time it is 13.0
//         /*Grocery List ArrayList Challenge*/
//          GroceryList groceryList = new GroceryList();
//          groceryList.inputGroceryList();
//        /* Mobile phone-Contact challenge*/
//        ArrayList<Contact> contact = new ArrayList<>();
//        MobilePhone mobilePhone = new MobilePhone(123589909,contact);
//        mobilePhone.optionSelection();
         /*FizzBuzz Challenge*/
//        System.out.println("Enter no of lines: " );
//        int n = scan.nextInt();
//
//        scan.nextLine();
//        for(int i = 1; i <= n; i++){
//            String test = "";
//            test += (i % 3) == 0 ? "fizz" : "";
//            test += (i % 5) == 0 ? "buzz" : "";
//            System.out.println(!test.isEmpty() ? test : i);
//        }
         /* Bank Challenge with Arraylists and Boxing and Unboxing*/

//        Bank bank = new Bank("Indian Bank");
//        bank.addBranch("Madhura Nagar");
//        bank.addCustomer("Madhura Nagar", "Satyadev", 98942498.84);
//        bank.addCustomerTransaction("Madhura Nagar","Satyadev", 12937823023.32);
//        System.out.println("Customer Details:");
//        bank.listCustomers("Madhura Nagar",true);
//        /* Autoboxing Compare test*/
//        Integer one = new Integer(1);
//        Integer anotherOne = new Integer(1);
//        System.out.println(" one == anotherOne: " + (one == anotherOne));

//        System.out.println("equals : one to anotherOne = " + (one.equals(anotherOne)));
        /*Mixing object and primitive in equality and relational operator*/
//         Integer arg = null;
//         int x = arg;
//        System.out.println(x);
//        Animal a = new Animal("Rhino");
//        a.behavior();
//        a.testing();
//        Animal b = new Hippo("Rodio");
//        b.behavior();
//        b.testing();
//        Hippo h = new Hippo("Bulky");
//        System.out.println("Hippo Name : " + h.getName());
//        h.behavior();
//        h.testing();
//        h.superUsage();
/*
        InterfaceDemo demo1 = new InterfaceDemo();
        demo1.show();*/
        /*Linked list Playlist Demo*/
/*         Album album = new Album("National Anthem", "India");
         album.addSong("Jana Gana Mana",0.52);
         album.addSong("Vandemataram",0.66);
         album.addSong("Sare Jahase Acha", 1.30);
        albums.add(album);

        album = new Album("Devotional", "Telugu");
        album.addSong("Jaya Jaya Rama",2.52);
        album.addSong("Hanuman Chalisa",5.66);
        album.addSong("Sivathandava stotram", 10.30);
        album.addSong("RamaRaksha stotram", 12.30);
        album.addSong("Vishnu Sahasranamam", 15.30);
        albums.add(album);
        LinkedList<Song> playlist = new LinkedList<Song>();
         albums.get(0).addSongToPlaylist("Jana Gana Mana",playlist);
         albums.get(1).addSongToPlaylist("Hanuman Chalisa", playlist);
         albums.get(0).addSongToPlaylist("Vandemataram", playlist);
         albums.get(1).addSongToPlaylist("Sivathandava stotram", playlist);
         albums.get(1).addSongToPlaylist(4,playlist);
        albums.get(1).addSongToPlaylist(5,playlist);

         Album.play(playlist);*/
       /* Interfaces demo*/

    }
}


