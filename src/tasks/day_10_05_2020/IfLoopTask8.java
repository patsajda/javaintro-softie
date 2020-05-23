package tasks.day_10_05_2020;

import java.util.Scanner;

public class IfLoopTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you country: ");
        String inputCountry = scanner.nextLine().toUpperCase();
        System.out.println("Enter your age: ");
        int inputAge = scanner.nextInt();


        if (inputAge >= 16 && inputCountry.equals("UK")) {
            System.out.println("you are adult in UK");
        } else if (inputAge >= 21 && inputCountry.equals("USA")) {
            System.out.println("you are adult in USA");
        } else if (inputAge >= 18 && inputCountry.equals("Poland")) {
            System.out.println("you are adult in Poland");
        } else {
            System.out.println("You are adult in your country whatever it is located");
        }
    }
}

