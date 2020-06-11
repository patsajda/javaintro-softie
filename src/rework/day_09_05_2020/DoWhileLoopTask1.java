package rework.day_09_05_2020;

//TODO: Implement the dice game using do-while loop.

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you wanna throw a dice: ");
        int throwTimes = scanner.nextInt();
        int counter = 0;

        do {
            Random random = new Random();
            System.out.println(random.nextInt(6) + 1);
            counter++;
        } while (counter < throwTimes);
    }
}
