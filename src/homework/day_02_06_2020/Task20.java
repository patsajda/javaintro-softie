package homework.day_02_06_2020;

//TODO: Use the keyboard to enter 3 numbers and display the middle one (not the average).

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scanner.nextInt();
        System.out.println("Enter B:");
        int b = scanner.nextInt();
        System.out.println("Enter C:");
        int c = scanner.nextInt();

        if ((a < b && b < c) || (c < b && b < a))
            System.out.println(b);
        else if ((b < a && a < c) || (c < a && a < b))
            System.out.println(a);
        else
            System.out.println(c);
    }
}
