package rework.day_09_05_2020;

//TODO: Read the word and check if it contains “cat” String. Print boolean value.

import java.util.Scanner;

public class IfLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String enteredText = scanner.nextLine();

        System.out.println(enteredText.contains("cat"));
    }
}
