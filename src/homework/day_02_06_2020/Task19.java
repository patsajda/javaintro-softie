package homework.day_02_06_2020;

//TODO: Use the keyboard to enter two digits: a and b. Using for loop display a x b size rectangle made

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A:");
        int sideA = scanner.nextInt();
        System.out.println("Enter side B:");
        int sideB = scanner.nextInt();

        for (int i = 0; i < sideA; i++) {
            System.out.println("");
            for (int j = 0; j < sideB; j++) {
                System.out.print("0");
            }
        }
    }
}
