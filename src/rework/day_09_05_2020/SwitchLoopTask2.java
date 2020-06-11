package rework.day_09_05_2020;

//TODO: Implement a simple calculator using switch statement.

import java.util.Scanner;

public class SwitchLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose operation (+,-,*,/): ");
        String enteredOperation = scanner.nextLine();
        System.out.println("Enter first number: ");
        int enteredNum1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int enteredNum2 = scanner.nextInt();

        calculator(enteredOperation, enteredNum1, enteredNum2);
    }

    static void calculator(String operation, int num1, int num2) {
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            switch (operation) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
            }
        } else {
            System.out.println("Wrong operation command");
        }
    }
}
