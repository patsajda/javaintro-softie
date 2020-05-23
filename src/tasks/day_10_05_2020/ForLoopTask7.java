package tasks.day_10_05_2020;

import java.util.Scanner;

public class ForLoopTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you word: ");
        String inputedWord = scanner.nextLine();
        int inputedWordLength = (inputedWord.length()-1);

        for (int i = 0; (inputedWordLength - 1) < inputedWordLength; i++) {
            char newText = inputedWord.charAt(inputedWordLength);
            inputedWordLength--;
        }
    }
}
