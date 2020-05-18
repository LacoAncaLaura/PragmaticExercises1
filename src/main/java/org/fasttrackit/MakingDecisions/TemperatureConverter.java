package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int temperature = scanner.nextInt();
            int celsius = scanner.nextInt();
            int fahrenheit = scanner.nextInt();
            System.out.println("Press F to convert from Fahrenheit to Celsius.");
            System.out.println("Press C to convert from Celsius to Fahrenheit.");
            if (temperature.equals(celsius)){}
        }catch (InputMismatchException e){
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}