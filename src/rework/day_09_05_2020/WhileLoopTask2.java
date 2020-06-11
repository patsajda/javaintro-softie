package rework.day_09_05_2020;

//TODO: Implement a dice game: Ask user how many times does he/she want to throw the dice.
// Print a random number (1-6) for each throw.

import java.util.Random;
import java.util.Scanner;

public class WhileLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you wanna throw a dice: ");
        int throwTimes = scanner.nextInt();
        int counter = 0;

        while (counter < throwTimes) {
            Random random = new Random();
            System.out.println(random.nextInt(6) + 1);
            counter++;
        }
    }
}
