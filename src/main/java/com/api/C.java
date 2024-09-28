package com.api;


import java.util.Scanner;




public class C {
    // Method to greet
    public static void greet() {
        System.out.println("Hello!");
    }

    // Method to display the current date
    public static void displayDate() {
        System.out.println("Today's date is: " + java.time.LocalDate.now());
    }

    // Method to perform a calculation
    public static int add(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {


        // Calling multiple methods
        C.greet();
        C.displayDate();

        int sum = C.add(22, 96);
        System.out.println("Sum: " + sum);
    }
}




