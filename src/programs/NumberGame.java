package programs;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        boolean luckyNumber = false;

        while (luckyNumber == true) {
            if (number > 0 && number <= 100) {
                System.out.println("");
            }
        }
    }
}
