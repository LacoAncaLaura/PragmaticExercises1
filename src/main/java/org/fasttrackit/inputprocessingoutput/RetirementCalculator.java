package org.fasttrackit.inputprocessingoutput;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        System.out.println("What`s your current age?");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        int currentAge = Integer.parseInt(age);
        System.out.println("So your age is: " + currentAge);


        System.out.println("At what age would you like to retire?");
        String age1 = scanner.nextLine();
        int retireAge1 = Integer.parseInt(age1);
        System.out.println("Your expectation: " + retireAge1);

        int yearsLeftToWork = retireAge1 - currentAge;
        System.out.println("You have " + yearsLeftToWork + " Years left until you can retire.");
        int year = now.get(Calendar.YEAR) + yearsLeftToWork;
        System.out.println("It`s " + now.get(Calendar.YEAR) + ",so you can retire in " + year);
    }
}
