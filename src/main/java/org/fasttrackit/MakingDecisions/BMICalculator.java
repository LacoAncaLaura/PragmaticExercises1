package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your weight: ");
            int weight = scanner.nextInt();
            double pounds = weight * 2.2;
            System.out.println("Please enter your height: ");
            int height = scanner.nextInt();
            double inches = height * 0.39;
            double HxH = inches * inches;
            double first = pounds / HxH;
            double BMI = first * 703;
            System.out.println("Your BMI is " + BMI);
  //aici as fi pus conditia (BMI >=18.5 || BMI <= 25) dar nu merge
            if (BMI  <= 25) {
                System.out.println("You are within the ideal weight range.");
            } else {
                System.out.println("You are overweight. You should see your doctor.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid number.");
        }
    }
}