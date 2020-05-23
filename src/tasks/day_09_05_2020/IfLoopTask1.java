package tasks.day_09_05_2020;

import java.util.Scanner;

public class IfLoopTask1 {
    public static void main(String[] args) {
        int inputAge;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        inputAge = scanner.nextInt();

        if (inputAge >= 18) {
            System.out.println("you can enter");
        } else {
            System.out.println("you are too young");
        }
    }
}