package rework.day_09_05_2020;

//TODO: Read the age and decide if user can enter the club.

import java.util.Scanner;

public class IfLoopTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int enteredAge = scanner.nextInt();

        if (enteredAge >= 18 && enteredAge < 80) {
            System.out.println("You can enter");
        } else if (enteredAge < 18) {
            System.out.println("You are too young!");
        } else {
            System.out.println("You are too old!");
        }
    }
}
