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


        //Overtime
        float grossPay;
        if(hoursWorked > 40) {
            float regularHours = 40;
            float overtimeHours = hoursWorked - 40;
            grossPay = (regularHours * payRate) + (overtimeHours * payRate * 1.5f);
        }else {
            grossPay = hoursWorked * payRate;
        }

        System.out.println("Employee name: " + name);
        System.out.println("Gross pay: $" + grossPay);

        scanner.close();
    }
}
