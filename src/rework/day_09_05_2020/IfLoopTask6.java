package rework.day_09_05_2020;

//TODO: Ask user for PESEL and print his/her gender.

import java.util.Scanner;

public class IfLoopTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PESEL: ");
        String pesel = scanner.nextLine();

        if (pesel.length() != 11) {
            System.out.println("Wrong PESEL length!");
        } else if (Integer.parseInt(pesel.substring(pesel.length() - 2, pesel.length() - 1)) % 2 == 0) {
            System.out.println("You are female");
        } else System.out.println("You are male!");
    }
}
