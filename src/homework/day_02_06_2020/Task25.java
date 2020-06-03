package homework.day_02_06_2020;

//TODO: Rewrite the last exercise but this time display the average after user types “exit”.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String number;
        double average, sum = 0.0;

        List numbersTable = new ArrayList<>();
        do {
            number = scanner.nextLine();
            if (!number.equals("exit")) {
                Integer wrapInt = Integer.valueOf(number);
                numbersTable.add(wrapInt);
                sum += wrapInt;
            }
            average = sum / numbersTable.size();
        }
        while (!number.equals("exit"));
        System.out.println(average);
    }
}
