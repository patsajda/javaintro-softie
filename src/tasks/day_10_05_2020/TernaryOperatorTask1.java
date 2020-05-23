package tasks.day_10_05_2020;

import java.util.Scanner;

public class TernaryOperatorTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(isAdult(age));
    }

    public static String isAdult(int age) {
        if (age >= 18) {
            return "You are adult!";
        } else {
            return "You are not adult!";
        }

//        adult = (age >= 18) ? "Adult" : "Not adult";
    }
}
