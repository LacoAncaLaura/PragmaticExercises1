package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word below:");
        String homer = scanner.nextLine();
        String letters = new String(homer);
        System.out.println("What is in the input string? " + homer);
        System.out.println(homer + " has " + letters.length() + " characters.");


    }
}