package org.fasttrackit.inputprocessingoutput;

import org.fasttrackit.Guy;

import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {
        System.out.println( "What`s your name?");
        Scanner scanner = new Scanner(System.in);
        String yourname = scanner.nextLine();

        System.out.println("Entered name: " + yourname);
        System.out.println();

        System.out.println("Hello, " + yourname +" ,nice meeting you!");
    }
}
