package com.pluralsight;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Currency conversion rates:
        double usdToEur = 0.85;
        double usdToGbp = 1.25;
        double eurToUsd = 1.15;
        double gbpToUsd = 0.70;

        while (true) {
            System.out.println("Welcome to the currency converter!");

            //Asking user to input the amount of currency
            System.out.print("Enter the amount of currency: ");
            double amount = scanner.nextDouble();

            System.out.println("Which currency do you want to convert from?");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            int fromCurrency = scanner.nextInt();

//            / Ask user for the currency they want to convert to
            System.out.println("Which currency do you want to convert to?");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            int toCurrency = scanner.nextInt();


            //performed the conversion based on user input
            double convertedAmount = 0;
            String fromCurrencyName = "";
            String toCurrencyName = "";

            if (fromCurrency == 1 && toCurrency == 2) { // USD to EUR
                convertedAmount = amount * usdToEur;
                fromCurrencyName = "USD";
                toCurrencyName = "EUR";
            } else if (fromCurrency == 1 && toCurrency == 3) { // USD to GBP
                convertedAmount = amount * usdToGbp;
                fromCurrencyName = "USD";
                toCurrencyName = "GBP";
            } else if (fromCurrency == 2 && toCurrency == 1) { // EUR to USD
                convertedAmount = amount * eurToUsd;
                fromCurrencyName = "EUR";
                toCurrencyName = "USD";
            } else if (fromCurrency == 3 && toCurrency == 1) { // GBP to USD
                convertedAmount = amount * gbpToUsd;
                fromCurrencyName = "GBP";
                toCurrencyName = "USD";
            } else {
                System.out.println("Invalid selection. Please try again.");
                continue;
            }
            System.out.printf("%.2f %s converted to %.2f %s", amount, fromCurrencyName, convertedAmount, toCurrencyName);

            // Ask if the user wants to perform another conversion
            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String response = scanner.next();
            if (response.equals("no")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Thank you for using the currency converter");
    }
}
