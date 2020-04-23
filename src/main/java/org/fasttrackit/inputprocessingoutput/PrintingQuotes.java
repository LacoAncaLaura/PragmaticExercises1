package org.fasttrackit.inputprocessingoutput;

public class PrintingQuotes {
    public static void main(String[] args) {
        String quote = new String("\"Friendship is the hardest thing to explain.\n It's not something you can learn in school.\n But if you haven't learned what friendship means,you haven't learned anything.");
        String author = new String("Muhammad Ali");

        System.out.println("What is the quote? " + quote);

        System.out.println("Who said it? " + author);

        System.out.println(author + "says, " + quote);

    }
}
