package rework.day_09_05_2020;

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
            System.out.println("You can enter!");
        } else {
            System.out.println("You are too young!");
        }
    }
}