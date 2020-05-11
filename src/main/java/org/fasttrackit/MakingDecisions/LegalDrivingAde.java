package org.fasttrackit.MakingDecisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LegalDrivingAde {
    public static void main(String[] args) {
        try {
            System.out.println("What is your age?");
            Scanner scanner = new Scanner(System.in);
            int DrivingAge = scanner.nextInt();
            if (DrivingAge < 18) {
                System.out.println("You are not old enough to legally drive.");
            } else {
                System.out.println("You are old enough to legally drive.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid number.");
        }
    }
}
