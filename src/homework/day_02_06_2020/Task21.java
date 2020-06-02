package homework.day_02_06_2020;

//TODO: Read numbers from the keyboard and after typing number 0, display the sum of all previously provided numbers.

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number, sum = 0;

        do {
            number = scanner.nextInt();
            sum += number;
        }
        while (number != 0);
        System.out.println(sum);
    }
}