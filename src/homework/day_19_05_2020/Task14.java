package homework.day_19_05_2020;

//TODO: Use the keyboard to enter a number. If the number is positive, then double it.
// If the number is negative, raise it to power 2. If the entered number is zero, don’t change it.
// Display the result on the screen.

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int enteredNumber = scanner.nextInt();

        if (enteredNumber > 0) {
            System.out.println(enteredNumber *= 2);
        } else if (enteredNumber < 0) {
            System.out.println(Math.pow(enteredNumber, 2));
        } else if (enteredNumber == 0) {
            System.out.println(enteredNumber);
        }
    }
}

