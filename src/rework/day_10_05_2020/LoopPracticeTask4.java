package rework.day_10_05_2020;

//TODO: Implement a program getting number and printing the sum of numbers from 0 to this number.

import java.util.Scanner;

public class LoopPracticeTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int enteredNumber = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= enteredNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
