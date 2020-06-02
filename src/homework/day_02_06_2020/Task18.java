package homework.day_02_06_2020;

//TODO: Create a method which will return the number of digits in a passed number.

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digits: ");
        long digits = scanner.nextLong();

        System.out.println(returnDigitsLength(digits));
    }

    public static int returnDigitsLength(long digit) {
        String convertLongToString = String.valueOf(digit);
        int digitsLength = convertLongToString.length();
        return digitsLength;
    }
}