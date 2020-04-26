package org.fasttrackit.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 8; i--) {
                System.out.println("How many people?");
                Scanner scanner = new Scanner(System.in);
                int people = scanner.nextInt();
                System.out.println("There are " + people + " having fun.");
                System.out.println("How many pizzas do you have?");
                int pizza = scanner.nextInt();
                System.out.println(people + " people with " + pizza + " pizza.");
                int pizzaSlices = pizza * 8;
                int peopleSlices = pizzaSlices / people;
                int leftOver = peopleSlices - pizzaSlices;
                System.out.println("Each person get`s " + peopleSlices + " pieces of pizza.\nAnd are " + leftOver + " slices left over.");
                if (peopleSlices == 1){
                    System.out.println("Each person get`s " + peopleSlices + "slice of pizza.");
                }
            }
        }catch (InputMismatchException e){
            throw new RuntimeException("Please enter a valid number.");
        }
    }
}
