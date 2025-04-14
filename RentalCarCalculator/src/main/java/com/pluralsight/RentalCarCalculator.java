package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double Basic_Rental_Rate = 29.99;
        final double Toll_Rate = 3.95;
        final double GPS_Rate = 2.95;
        final double Road_Side_Assistance_Rate = 3.95;
        final double Underage_Rate = 0.30;         //surcharge percent

        System.out.println("Welcome to the Rental Car Calculator");

        System.out.println("Enter pickup date (MM/DD/YYYY): ");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter number of days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();

        boolean wantsTollTag;
        while(true) {
            System.out.println("Do you want a toll tag at 3.95/day (yes/no): ");
            String tollTag = scanner.nextLine();
              if (tollTag.equals("yes")) {
                  wantsTollTag = true;
                  break;
              }else if (tollTag.equals("no")) {
                  wantsTollTag = false;
                  break;
              }else{
                  System.out.println("please enter yes or no");
            }
        }
        boolean wantsGPS;
        while(true) {
            System.out.println("Do you want GPS (yes/no): ");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                wantsGPS = true;
                break;
            } else if (gps.equals("no")) {
                wantsGPS = false;
                break;
            }else {
                System.out.println("please enter yes or no");
            }
        }
        boolean wantsRoadSideAssistance;
        while(true) {
            System.out.println("Do you want road side assistance (yes/no): ");
            String roadSideAssistance = scanner.nextLine();
            if(roadSideAssistance.equals("yes")){
                wantsRoadSideAssistance = true;
                break;
            } else if (roadSideAssistance.equals("no")) {
                wantsRoadSideAssistance = false;
                break;
            }else  {
                System.out.println("please enter yes or no");
            }
        }

        // Age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        double basicRentalRate = Basic_Rental_Rate * rentalDays;

        double optionsCost = 0;
         if (wantsTollTag)
             optionsCost += Toll_Rate * rentalDays;
         if (wantsGPS)
             optionsCost += GPS_Rate * rentalDays;
         if (wantsRoadSideAssistance)
             optionsCost += Road_Side_Assistance_Rate * rentalDays;

         double surcharge = 0;
         if (age < 25){
             surcharge = basicRentalRate * Underage_Rate;
         }

         double totalCost = basicRentalRate + optionsCost + surcharge;

         System.out.println("Your total cost is $" + totalCost);

         scanner.close();

    }
}
