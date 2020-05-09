package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        int orderAmount = scanner.nextInt();
        System.out.println("What is the state?");
        String state = scanner.nextLine();
        if (scanner.nextLine() == "WI") {
            double tax = 0.55;
            double total = tax + orderAmount;
            System.out.println(state + "\nThe subtotal is " + orderAmount + "\nThe tax is $" + tax + "\nThe total is $" + total);
        }if (scanner.nextLine() == "MN"){
            System.out.println(state + "\nThe subtotal is " + orderAmount  + "\nThe total is $" + orderAmount);

        }

    }
}
