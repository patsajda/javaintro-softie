package rework.day_09_05_2020;

//TODO: Ask user to type a polish zip code.

import java.util.Scanner;

public class OperatorsTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter zip code: ");
        String enteredZipCode = scanner.nextLine();

        checkPolishZipCode(enteredZipCode);
    }

    static void checkPolishZipCode(String zipCode) {
        if (zipCode.length() == 6 && zipCode.charAt(2) == '-' && Character.isDigit(zipCode.charAt(0)) && Character.isDigit(zipCode.charAt(1))
                && Character.isDigit(zipCode.charAt(3)) && Character.isDigit(zipCode.charAt(4)) && Character.isDigit(zipCode.charAt(5))) {
            System.out.println("Correct zip code");
        } else System.out.println("Incorrect zip code");
    }
}
