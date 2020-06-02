package rework.day_09_05_2020;

//TODO: Read the number and check if it is equal to 2. Print boolean value.

import java.util.Scanner;

public class IfLoopTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredValue = scanner.nextInt();

        System.out.println(enteredValue == 2);
    }
}
