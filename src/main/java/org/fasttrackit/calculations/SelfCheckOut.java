package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfCheckOut {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the price of item 1: ");
            int itemPrice1 = scanner.nextInt();
            System.out.println("Enter the quantity of item 1: ");
            int item1 = scanner.nextInt();

            System.out.println("Enter the price of item 2: ");
            int itemPrice2 = scanner.nextInt();
            System.out.println("Enter the quantity of item 2: ");
            int item2 = scanner.nextInt();

            System.out.println("Enter the price of item 3: ");
            int itemPrice3 = scanner.nextInt();
            System.out.println("Enter the quantity of item 3: ");
            int item3 = scanner.nextInt();


            int subTotal1 = item1 * itemPrice1;
            int subTotal2 = item2 * itemPrice2;
            int subTotal3 = item3 * itemPrice3;
            int subTotal = subTotal1 + subTotal2 + subTotal3;
            System.out.println("Subtotal: " + subTotal);
            double tax = subTotal * 0.55;
            System.out.println("Tax: " + tax);
            double total = subTotal + tax;
            System.out.println("Total: " + total);
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a valid number.");
        }


    }
}

