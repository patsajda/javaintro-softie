package rework.day_10_05_2020;

//TODO: Implement a game. Get a random number (0-100) and tell user to guess it.

import java.util.Random;
import java.util.Scanner;

public class LoopPracticeTask5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(101);
        int guessedNumber;

        do {
            System.out.println("Enter your number: ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber > numberToGuess) {
                System.out.println("It's too big");
            } else if (guessedNumber < numberToGuess) {
                System.out.println("It's too small");
            } else System.out.println("Correct number!");
        } while (guessedNumber != numberToGuess);
    }
}
