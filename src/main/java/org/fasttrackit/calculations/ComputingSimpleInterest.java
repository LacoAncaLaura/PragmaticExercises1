package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the principal: ");
            int principal = scanner.nextInt();
            System.out.println("Enter the rate of interest: ");
            double interest = scanner.nextDouble();
            double interestPercent = interest / 100;
            System.out.println("Enter the number of years: ");
            int years = scanner.nextInt();
            double totalRate = interestPercent * years;
            double rate = 1 + totalRate;
            double investment = principal * rate;
            System.out.println("After " + years + " years at " + interest + "%,the investment will be worth $" + investment);
        }catch (InputMismatchException e){
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}
