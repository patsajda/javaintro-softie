package homework.day_02_06_2020;

import java.util.Scanner;

//TODO: Use the keyboard to enter an integer. Display information on the console whether it’s apositive/negative and even/odd number, or 0.
// Run the program until user provides number 1000.

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number;

        do {
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("0");
            }

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("Positive, even number");
                } else {
                    System.out.println("Positive, odd number");
                }
            }

            if (number < 0) {
                if (number % 2 == 0) {
                    System.out.println("Negative, even number");
                } else {
                    System.out.println("Negative, odd number");
                }
            }
        }
        while (number != 1000);
    }
}
