package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean choice = scanner.nextBoolean();
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press C to convert from Celsius to Fahrenheit.");
    }
}
