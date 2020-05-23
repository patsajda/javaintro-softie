package homework.day_19_05_2020;

//TODO: Write a program that displays the square of current year on the screen.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input current year: ");
        int inputedYear = scanner.nextInt();

        System.out.println(square(inputedYear));
    }

    public static int square(int inputedYear) {
        if (inputedYear == 2020) {
            int result = inputedYear * inputedYear;
            return result;
        } else {
            System.out.println("It's not current year!");
        }
        return inputedYear;
    }
}

