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


    }

}