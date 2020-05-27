package homework.day_19_05_2020;

//TODO: Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
// Determine whether a triangle with these sides can exist.

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A: ");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B: ");
        int sideB = scanner.nextInt();
        System.out.println("Enter side C: ");
        int sideC = scanner.nextInt();

        checkTriangle(sideA, sideB, sideC);
    }

    public static void checkTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("The triangle is not possible.");
        } else {
            System.out.println("The triangle is possible.");
        }
    }
}
