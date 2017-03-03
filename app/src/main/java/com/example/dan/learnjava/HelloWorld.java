package com.example.dan.learnjava;

/**
 * Created by dan on 2/28/17.
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My first Java program");

        String dan = "Dan Hoying";
        System.out.println(dan);

        int danWeeklySalary = 32;
        int danMonthlySalary = danWeeklySalary * 4;
        System.out.println("Weekly salary: " + danWeeklySalary);
        System.out.println("Monthly salary: " + danMonthlySalary);

        int apples = 6;
        int oranges = 5;
        int fruit = apples - oranges;
        System.out.println("I have " + fruit + " fruit");

        int weeks = 130;
        double years = weeks / 52.0;
        System.out.println(weeks + " weeks is " + years + " years");

        System.out.println("Hello, " + dan + " here");
    }
}
