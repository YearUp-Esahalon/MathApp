package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1:
        // Declare Variables
        double bobSalary = 20000;
        double garySalary = 30000;

        //Determine Highest Salary
        double highestSalary = Math.max(bobSalary, garySalary);

        //Print result
        System.out.println("The highest salary is: " + highestSalary);

        //Question 2:
        //Declare Variables
        double carPrice = 18000;
        double truckPrice = 22000;

        //Determine the smallest price
        double smallestPrice = Math.min(carPrice, truckPrice);

        //Print the result
        System.out.println("The smallest price is: " + smallestPrice);

        //Question 3
        //Define the Radius
        double radius = 7.25;

        //Calculate the area of the circle
         double area =Math.PI * radius * radius;

         //Print the area
        System.out.printf("The area of the circle with a radius %.2f is: %.2f%n", radius, area);

        //Question:4
        // Set the variable
        double number = 5.0;

        // Calculate the square root
        double squareRoot = Math.sqrt(number);

        // Print the result
        System.out.printf("The square root of %.2f is: %.2f%n", number, squareRoot);

        //Question:5
        // Define the points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // Calculate distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Print the result
        



    }

}