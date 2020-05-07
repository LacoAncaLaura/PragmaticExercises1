package org.fasttrackit.calculations;

import java.util.Scanner;


public class CurrencyConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = scanner.nextInt();
        System.out.println("Exchange rate: ");
        double exchangeRate = scanner.nextDouble();
        double dollars = euros * exchangeRate/100;
        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is "
         + dollars + " U.S. dollars.");

    }
}


