package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "What`s your name?");
        Scanner scanner = new Scanner(System.in);
        String yourname = scanner.nextLine();

        System.out.println("Entered name: " + yourname);
        Guy guy = new Guy();
        guy.yourname = "George";

        System.out.println("Hello, " + yourname +" ,nice meeting you");


    }
}
