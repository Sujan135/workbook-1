package com.pluralsight;


import java.util.Scanner;

class Person {
    String name;

    Person(String data) {
        System.out.println(data);
    }
}

public class Constructors {

    public static void main(String[] args) {
//        Person person1 = new Person("Sujan");
//        Person person2 = new Person("Ishika");
//        Person person3 = new Person("Kavi");
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt for age and salary
//        System.out.print("How old are you? ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your salary? ");
//        double salary = scanner.nextDouble();
//
//        // Output the values entered
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//
//
//        final int maxStudents = 25;
//        final int someVariable;
//        final int someOtherVariable= 100;
//        someVariable = someOtherVariable;
//        System.out.println(someVariable);

//        int x = 5;
//        int i = x++;
//
////        System.out.println(x++);
//        System.out.println(i);

//        int myOtherValue = 100;
//        int val1 = 5;
//        int val2 = 10;
//        myOtherValue /= val1 * val2;
//        System.out.println(myOtherValue);

//        var v1 = 50;
//        var myValue = 100.0;
////        var v1 = 55;
//
//        int i = 25;
//        var total = i + v1;
//        System.out.println(total);
//        System.out.println(total + myValue);


        var thisValue = 7.5f;
        int v1 = (int)thisValue;
        System.out.println(v1);

        /*
        Conditional assignment
         */
        int value1 = 7;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println(maxValue);






    }
}
