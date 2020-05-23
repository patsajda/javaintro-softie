package tasks.day_10_05_2020;

import java.util.Scanner;

public class SwitchLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your operator number: ");
        String inputOperator = scanner.nextLine();
        System.out.println("Enter your first number: ");
        int inputFirstNumber = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int inputSecondNumber = scanner.nextInt();

        switch (inputOperator) {
            case "+":
                System.out.println(inputFirstNumber + inputSecondNumber);
                break;
            case "-":
                System.out.println(inputFirstNumber - inputSecondNumber);
                break;
            case "*":
                System.out.println(inputFirstNumber * inputSecondNumber);
                break;
            case "/":
                System.out.println(inputFirstNumber / inputSecondNumber);
                break;
        }
    }
}

