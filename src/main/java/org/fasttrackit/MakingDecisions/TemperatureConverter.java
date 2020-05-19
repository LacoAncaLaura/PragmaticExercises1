package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press C to convert from Celsius to Fahrenheit.");
            String Celsius = "C".toLowerCase();
            boolean isCelsius = "C".equalsIgnoreCase("c");
            System.out.println("Press F to convert from Fahrenheit to Celsius.");
            String Fahrenheit = "F".toLowerCase();
            boolean isFahrenheit = "F".equalsIgnoreCase("f");
            String choice = scanner.nextLine();
            System.out.println("And your choice is: " + choice);
            if (choice.equals(Celsius)) {
                System.out.println("Please enter the temperature in Fahrenheit: ");
                int temperature = scanner.nextInt();
                double first = 5 / 9;
                int second = temperature - 32;
                double C = second * first;
                System.out.println(" The temperature in Celsius is: "  + C);
            } else if (choice.equals(Fahrenheit)) {
                System.out.println("Please enter the temperature in Celsius: ");
                int temperature = scanner.nextInt();
                double third = 9 / 5;
                double forth = temperature * third;
                double F = third + forth;
                System.out.println( "The temperature in Fahrenheit is: " + F);
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}