package rework.day_09_05_2020;

//TODO: Ask user for a name and check if he/she is a male or female.

import java.util.Scanner;

public class OperatorsTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String enteredName = scanner.nextLine().toLowerCase();

        checkGender(enteredName);
    }

    static void checkGender(String name) {
        if (!name.endsWith("a") || name.equals("kuba") || name.equals("kosma")) {
            System.out.println("It's a male");
        } else {
            System.out.println("It's a girl!");
        }
    }
}
