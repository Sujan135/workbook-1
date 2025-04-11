package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String  name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("Enter your pay rate: ");
        float payRate = scanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("Employee name: " + name);
        System.out.println("Gross pay: $" + grossPay);

        scanner.close();
    }
}
