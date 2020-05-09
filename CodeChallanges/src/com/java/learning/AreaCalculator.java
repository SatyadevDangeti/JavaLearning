package com.java.learning;

public class AreaCalculator {
    private static final double PI = Math.PI;

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double area = (radius * radius * PI);
        return area;
    }

    public static double area(double length, double width) {
        if (length < 0 | width < 0) {
            return -1.0;
        }
        double area = length * width;
        return area;
    }
}
