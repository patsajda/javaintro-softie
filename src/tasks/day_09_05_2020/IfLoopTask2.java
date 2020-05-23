package tasks.day_09_05_2020;

import java.util.Scanner;

public class IfLoopTask2 {
    public static void main(String[] args) {
        String inputText;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        inputText = scanner.nextLine();

        if (inputText.contains("cat")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}