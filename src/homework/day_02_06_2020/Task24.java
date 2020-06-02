package homework.day_02_06_2020;

//TODO: Use keyboard to enter numbers until user enters -1. Then display the average of all entered numbers excluding the last one.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number;
        double average, sum = 0.0;

        List numbersTable = new ArrayList<>();
        do {
            number = scanner.nextInt();
            if (number != -1) {
                numbersTable.add(number);
                sum += number;
            }
            average = sum / numbersTable.size();
        }
        while (number != -1);
        System.out.println(average);
    }
}