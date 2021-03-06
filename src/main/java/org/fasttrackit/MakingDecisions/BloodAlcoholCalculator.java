package org.fasttrackit.MakingDecisions;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your weight: ");
            int weight = scanner.nextInt();
            System.out.println("Please enter your gender: ");
            String gender = scanner.nextLine();
            String Female = scanner.nextLine() ;
            String Male = scanner.nextLine();
            System.out.println("Please enter the number of drinks you had: ");
            int drinks = scanner.nextInt();
            System.out.println("When you had the last drink? \n(In hours,please)");
            int numberOfH = scanner.nextInt();
            if (gender.equalsIgnoreCase(Female)) {
                double first = drinks * 5.14;
                double fe = weight * 0.66;
                double second = first / fe;
                double third = 0.015 * numberOfH;
                double BAC = second - third;
                System.out.println("Your BAC is " + BAC + " and it`s not legal to drive.");
            }if (gender.equalsIgnoreCase(Male)) {
                double first1 = drinks * 5.14;
                double fe = weight * 0.73;
                double second = first1 / fe;
                double third = 0.015 * numberOfH;
                double BAC = second - third;
                System.out.println("Your BAC is " + BAC + " and it`s not legal to drive.");
            }
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}