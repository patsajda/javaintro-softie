package rework.day_09_05_2020;

//TODO: Ask user for PESEL and print his/her gender.

import java.util.Scanner;

public class IfLoopTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PESEL: ");
        String enteredPESEL = scanner.nextLine();

        int lengthPESEL = enteredPESEL.length();

        if (lengthPESEL != 11) {
            System.out.println("Wrong PESEL length!");

            //TODO: Finish task...
        }
    }
}
