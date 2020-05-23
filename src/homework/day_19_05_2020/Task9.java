package homework.day_19_05_2020;

//TODO: Enter the number and name from the keyboard. Display the following string:

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number of months: ");
        int number = scanner.nextInt();

        System.out.println(name + " will be an automation tester in " + number + " months!");
    }
}
