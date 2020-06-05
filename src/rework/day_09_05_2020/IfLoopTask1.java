package rework.day_09_05_2020;

//TODO: Read the age and decide if user can enter the alcohol-related website. Print “you are too young” or “you can enter” depending on provided age.
// Test your app – what test cases would you prepare?

import java.util.Scanner;

public class IfLoopTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int enteredAge = scanner.nextInt();

        checkAge(enteredAge);
    }

    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("you can enter");
        } else {
            System.out.println("you are too young");
        }
    }
}
