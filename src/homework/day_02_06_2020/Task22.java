package homework.day_02_06_2020;

//TODO: Use keyboard to enter a name and 3 numbers (year, month and a day). Display data in the following format:
// “My name is {name}, I was born on day/month/year.”

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter a birth day: ");
        int day = scanner.nextInt();
        System.out.println("Enter a birth month: ");
        int month = scanner.nextInt();
        System.out.println("Enter a birth year: ");
        int year = scanner.nextInt();

        System.out.println("My name is " + name + " , I was born on " + day + "/" + month + "/" + year + ".");
    }
}
