package com.pluralsight;

import com.sun.source.tree.Scope;

public class MathApp {

    public static void main(String[] args) {
        double bobSalary = 50000.0;
        double garySalary = 55000.0;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Question 1: The Highest salary is " + highestSalary);

        System.out.println();

        double carPrice = 15000.0;
        double truckPrice = 20000.0;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Question 2: The lowest price is " + lowestPrice);

        System.out.println();

        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Question 3: The area of the circle with radius " + radius + " is " + areaOfCircle);

        System.out.println();

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Question 4: The square root of " + number + " is " + squareRoot);

        System.out.println();

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Distance formula: √((x2 - x1)² + (y2 - y1)²)
        System.out.println("Question 5: The distance between the points (5, 10) and (85, 50) is " + distance);

        System.out.println();

        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("Question 6: The absolute value of " + negativeValue + " is " + absoluteValue);

        System.out.println();

        double randomValue = Math.random();
        System.out.println("Question 7: A random number between 0 and 1 is " + randomValue);


    }
}
