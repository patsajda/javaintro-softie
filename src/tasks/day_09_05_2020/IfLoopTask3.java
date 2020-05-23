package tasks.day_09_05_2020;

import java.util.Scanner;

public class IfLoopTask3 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        inputNumber = scanner.nextInt();

        if (inputNumber == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}