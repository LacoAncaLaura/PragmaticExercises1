package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        try {
            System.out.println("Please pick a number!");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            int result = Integer.parseInt(number);
            System.out.println("This is the first number that you`ve picked: " + result);

            System.out.println("Please pick another one.");
            String number1 = scanner.nextLine();
            int result1 = Integer.parseInt(number1);
            System.out.println("And your second choice: " + result1);
            int total = result + result1;
            int total2 = result - result1;
            int total3 = result * result1;
            int total4 = result / result1;
            System.out.println(result + "+" + result1 + "=" + total);
            System.out.println(result  + "-" + result1 + "=" + total2);
            System.out.println(result + "*" + result1 + "=" + total3);
            System.out.println(result + "/" + result1 + "=" + total4);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a positive number");

        }

    }


}