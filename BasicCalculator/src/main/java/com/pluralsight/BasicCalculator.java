package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number : ");
        double number2 = scanner.nextDouble();

        System.out.println("Possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.println("Please select an option : ");
        String option = scanner.next();

        double result = number1 * number2;

        System.out.println( (int)number1 + " * " +  (int)number2 + " = " + (int)result);

        scanner.close();

    }
}
