package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press C to convert from Celsius to Fahrenheit.");
//            boolean isCelsius = "C".equalsIgnoreCase("c");
            System.out.println("Press F to convert from Fahrenheit to Celsius.");
//            boolean isFahrenheit = "F".equalsIgnoreCase("f");
            System.out.println("Press K to convert from Kelvin to Celsius.");
//            boolean isKelvin = "K".equalsIgnoreCase("k");
            System.out.println("Press J to convert from Kelvin to Fahrenheit.");
//            boolean isKelvin1 = "J".equalsIgnoreCase("j");
            String choice = scanner.nextLine();
            System.out.println("And your choice is: " + choice);
            if (choice.equalsIgnoreCase("C")) {
                System.out.println("Please enter the temperature in Fahrenheit: ");
                int temperature = scanner.nextInt();
                int second = temperature - 32;
                double C = second * 0.56;
                System.out.println(" The temperature in Celsius is: "  + C);
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println("Please enter the temperature in Celsius: ");
                int temperature = scanner.nextInt();
                double forth = temperature * 1.8;
                double F = 1.8 + forth;
                System.out.println( "The temperature in Fahrenheit is: " + F);
            }else if (choice.equalsIgnoreCase("K")) {
                System.out.println("Please enter the temperature in Celsius:");
                int temperature = scanner.nextInt();
                double K = temperature + 273.16;
                System.out.println("The temperature in Kelvin scale is: " + K);
            } else if (choice.equalsIgnoreCase("J")){
                System.out.println("Please enter the temperature in Fahrenheit:");
                int temperature = scanner.nextInt();
                int sixth = temperature - 32;
                double K1= 0.56 * sixth + 273;
                System.out.println("The temperature in Kelvin scale is: " + K1);
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}