package tasks.day_10_05_2020;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times throw a dice?: ");
        int throwCounter = scanner.nextInt();

        do {
            System.out.println("Your number is: " + (random.nextInt(6) + 1));
            throwCounter--;
        }
        while (throwCounter > 0);
    }
}
