package com.pluralsight;

public class Pratices {

    public static void main(String[] args) {
//        int someValue = 4;
//        int factorial = 1;
//        while (someValue > 1) {
//            factorial *= someValue;
//            someValue--;
//
//        }
//        System.out.println(factorial);

//        int iVal = 5;
//        do {
//            System.out.println(iVal);
//            System.out.print(" *2 = ");
//            iVal *= 2;
//            System.out.println(iVal);
//        } while (iVal < 100);

//        int i =1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i);
//            }

        float[] theVals = {10.0f,20.0f,30.0f};
        float sum = 0;
        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
        }
        System.out.println("The sum is " + sum);
    }
}
