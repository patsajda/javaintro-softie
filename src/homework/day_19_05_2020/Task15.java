package homework.day_19_05_2020;

//TODO: Use the keyboard to enter a year, and then determine the number of days in the year.
// For a leap year – 366, for an ordinary one – 365.

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int enteredYear = scanner.nextInt();

        if (enteredYear % 4 == 0) {
            if (enteredYear % 100 == 0) {
                if (enteredYear % 400 == 0) {
                    System.out.println("Entered year days value: 366");
                }
                System.out.println("Entered year days value: 365");
            }
            System.out.println("Entered year days value: 366");
        } else {
            System.out.println("Entered year days value: 365");
        }
    }
}
