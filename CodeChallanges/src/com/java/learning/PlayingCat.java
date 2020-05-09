package com.java.learning;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if ((!summer) && ((temperature >= 25) && (temperature <= 35))) {
//            System.out.println("true");
//
//            return true;
//        } else if ((summer) && ((temperature >= 25) && (temperature <= 45))) {
//
//            System.out.println("true");
//            return true;
//
//        } else {
//            System.out.println("false");
//
//            return false;
//        }
/*Learn Ternary Operator Usage & Examples*
dataType variable = booleanVariable ? true condition : false condition
/
 */
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;

    }
}
