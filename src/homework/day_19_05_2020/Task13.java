package homework.day_19_05_2020;

//TODO: Use the keyboard to enter a number representing a day of the week.
// Depending on the entered number, display the name of the day of the week.
// If you enter a number greater than 7 or less than 1, display "No such day!".

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number representing a day of the week: ");
        int numberOfDay = scanner.nextInt();

        if (numberOfDay < 1 && numberOfDay > 7) {
            System.out.println("No such day!");
        } else {
            switch (numberOfDay) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
