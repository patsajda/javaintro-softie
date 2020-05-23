package tasks.day_09_05_2020;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name:");
        String inputName = scanner.nextLine();
        System.out.println("Input your age:");
        int inputAge = scanner.nextInt();
        System.out.println(inputName + " is " + inputAge + " years old.");
    }
}
