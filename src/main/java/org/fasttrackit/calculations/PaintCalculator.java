package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        try {
            System.out.println("For how many square feet you need paint?");
            Scanner scanner = new Scanner(System.in);
            int squareFeet = scanner.nextInt();
            double squareMeters = squareFeet * 0.09290304;
            for (int i = 0; 350 <= squareFeet; i++) {
                System.out.println("You will need to purchase " + (i+1) + " gallons of paint to cover " + squareFeet + " square feet.\nOr " + squareMeters + " square meters.");
                if (squareFeet < 350) {
                    System.out.println("You will need to purchase only one gallon for " + squareFeet + " square feet.\nOr " + squareMeters + " square meters.");
                }
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please give a valid number.");
        }
    }

}
