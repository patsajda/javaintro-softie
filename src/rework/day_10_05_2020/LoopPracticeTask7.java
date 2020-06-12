package rework.day_10_05_2020;

//TODO: Write a program getting a word and printing it backwards.

import java.util.Scanner;

public class LoopPracticeTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you word: ");
        String word = scanner.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(i);
            System.out.print(word.charAt(i));
        }
    }
}
