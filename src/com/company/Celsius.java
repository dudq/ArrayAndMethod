package com.company;

import java.util.Scanner;

public class Celsius {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("Celsius is: %5.2f%n",celsius);
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("Fahrenheit is: %5.2f%n", fahrenheit);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static double celsiusToFahrenheit (double celsius){
        double fahrenheit = celsius *(9.0/5)+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        double celsius = (fahrenheit-32)*(5.0/9);
        return celsius;
    }
}
