package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeterminingCompoundInterest {
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
            int months = years*12;
            double totalRate = interestPercent * months;
            double rate = 1 + totalRate;
            double investment = principal * rate;
            System.out.println("After " + years + " years at " + interest + "%,the investment will be worth $" + investment);
        }catch (InputMismatchException e){
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}
