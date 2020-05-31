package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class MultistateSalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        int amount = scanner.nextInt();
        System.out.println("What state do you live in?");
        if (scanner.nextLine().equalsIgnoreCase("Wisconsin")){
            System.out.println("Which county?");
            if (scanner.nextLine().equalsIgnoreCase("Eau Claire")){
                System.out.println("The tax is $0.50.");
                double total1 = amount * 0.005;
                System.out.println("The total is $" + total1);
            }else if (scanner.nextLine().equalsIgnoreCase("Dunn")){
                System.out.println("The tax is $0.04.");
                double total2 = amount * 0.004;
                System.out.println("The total is $" + total2);
            }
        }if (scanner.nextLine().equalsIgnoreCase("Illinois")){
            System.out.println("You will be charged with 8% tax.");
            double total3 = amount * 0.08;
            System.out.println("The total is $" + total3);
        }

    }
}
