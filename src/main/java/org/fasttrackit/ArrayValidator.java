package org.fasttrackit;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {
    public static String validateArray(int[]numbers){
        return "Valid";
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("C:\\Users\\laura\\IdeaProjects\\PragmaticExercises1\\src\\main\\java\\org\\fasttrackit\\exercise 6 - input - Copie.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\laura\\IdeaProjects\\PragmaticExercises1\\src\\main\\java\\org\\fasttrackit\\exercise 6 - output - Copie.txt",
                        true));
        int testCaseCount = scanner.nextInt();

        for (int i = 1; i <= testCaseCount;i++){
            int arrayLength = scanner.nextInt();

            int[] numbers = new int [arrayLength];

            for (int j = 0 ; j < arrayLength ; j++){
                numbers[j] = scanner.nextInt();
            }
            String result = validateArray(numbers);

            String resultLine = "CASE #" + i + ": " + result;
            bufferedWriter.write(resultLine);
        }

    }

}
