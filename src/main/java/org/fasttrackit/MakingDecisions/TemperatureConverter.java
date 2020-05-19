package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press C to convert from Celsius to Fahrenheit.");
            String Celsius = "C".toLowerCase();
//            boolean isCelsius = "C".equalsIgnoreCase("c");
            System.out.println("Press F to convert from Fahrenheit to Celsius.");
            String Fahrenheit = "F".toLowerCase();
//            boolean isFahrenheit = "F".equalsIgnoreCase("f");
            System.out.println("Press K to convert from Kelvin to Celsius.");
            String Kelvin = "K".toLowerCase();
//            boolean isKelvin = "K".equalsIgnoreCase("k");
            System.out.println("Press J to convert from Kelvin to Fahrenheit.");
            String Kelvin1 = "J".toLowerCase();
//            boolean isKelvin1 = "J".equalsIgnoreCase("j");
            String choice = scanner.nextLine();
            System.out.println("And your choice is: " + choice);
            if (choice.equals(Celsius)) {
                System.out.println("Please enter the temperature in Fahrenheit: ");
                int temperature = scanner.nextInt();
                int second = temperature - 32;
                double C = second * 0.56;
                System.out.println(" The temperature in Celsius is: "  + C);
            } else if (choice.equals(Fahrenheit)) {
                System.out.println("Please enter the temperature in Celsius: ");
                int temperature = scanner.nextInt();
                double forth = temperature * 1.8;
                double F = 1.8 + forth;
                System.out.println( "The temperature in Fahrenheit is: " + F);
            }else if (choice.equals(Kelvin)) {
                System.out.println("Please enter the temperature in Celsius:");
                int temperature = scanner.nextInt();
                double K = temperature + 273.16;
                System.out.println("The temperature in Kelvin scale is: " + K);
            } else if (choice.equals(Kelvin1)){
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