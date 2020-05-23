package tasks.day_09_05_2020;

import java.util.Scanner;

public class IfLoopTask7 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter first number: "); // 1
        int a = inputNumber.nextInt();
        System.out.println("Enter second number: "); // 2
        int b = inputNumber.nextInt();
        System.out.println("Enter third number: "); // 3
        int c = inputNumber.nextInt();

        if (a > b && b > c) {
            System.out.println(c);
        } else if (a > c && b < c) {
            System.out.println(c);
        } else if (a < b && a < c) {
            System.out.println(a);
        }

    }
}

