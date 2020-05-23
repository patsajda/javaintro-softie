package programs;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times throw a dice?: ");
        int throwCounter = scanner.nextInt();

        while (throwCounter > 0) {
            System.out.println("Your number is: " + (random.nextInt(6) + 1));
            throwCounter--;
        }
    }
}
