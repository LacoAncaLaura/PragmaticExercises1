package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

    public static void main(String[] args) {
        System.out.println( "What`s your name?");
        Scanner scanner = new Scanner(System.in);
        String yourname = scanner.nextLine();

        System.out.println("Hello, " + yourname +" ,nice meeting you!");
    }
}
