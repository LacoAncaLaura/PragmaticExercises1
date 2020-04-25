package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfARectangularRoom {
    public static void main(String[] args) {
        try {
            System.out.println("What is the length of the room in feet?");
            Scanner scanner = new Scanner(System.in);
            int length = scanner.nextInt();
            System.out.println("Length: " + length);

            System.out.println("What is the width of the room in feet?");
            int width = scanner.nextInt();
            System.out.println("Width: " + width);
            System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
            int squareFeet = length * width;
            double squareMeters = squareFeet * 0.09290304;
            System.out.println("The area is: \n" + squareFeet + " square feet. \n" + squareMeters + " square meters.");

        } catch (InputMismatchException e) {
            throw new RuntimeException("Enter a number please!");
        }
    }
}

