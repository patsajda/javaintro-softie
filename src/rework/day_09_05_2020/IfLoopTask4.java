package rework.day_09_05_2020;

//TODO: Ask user for a number and check if it can be divided by 3.

import java.util.Scanner;

public class IfLoopTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();

        if (enteredValue % 3 == 0) {
            System.out.println("Your number " + enteredValue + " can be devided by 3.");
        } else {
            System.out.println("Your number " + enteredValue + " can not be devided by 3.");
        }
    }
}
