package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Sandwich size
        System.out.println("Welcome to Sandwich Shop");
        System.out.println("Enter sandwich size (1 for Regular, 2 for Large):");
        int size = scanner.nextInt();

        double basePrice = 0;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size");
            return;
        }

//        customer age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        double discount = 0;
        if (age < 17) {
            discount = 0.10;    //10% for students
        } else if (age >= 65) {
            discount = 0.20;    //20% for seniors
        }

        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("Total cost of Sandwich is: $%.2f\n ", finalPrice);

        scanner.close();


    }
}
