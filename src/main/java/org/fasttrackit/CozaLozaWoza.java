package org.fasttrackit;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("CozaWoza");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("LozaWoza");
            } else if (i % 3 == 0) {
                System.out.print("Coza");
            } else if (i % 5 == 0) {
                System.out.println("Loza");
            } else if (i % 7 == 0) {
                System.out.println("Woza");
            } else {
                System.out.print(i);
            }
            if (i % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}

