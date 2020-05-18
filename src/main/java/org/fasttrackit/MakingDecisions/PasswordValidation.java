package org.fasttrackit.MakingDecisions;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String passwordSaved = "abc$123";
        System.out.println("Please enter the password:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (passwordSaved.equals(password)) {
            System.out.println("Welcome!");
        }else{
            System.out.println("I don`t know.");
        }
    }
}