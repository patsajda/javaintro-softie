package rework.day_10_05_2020;

//TODO: Implement a login form. Ask user to guess the secret password ("qwerty123"). If it’s correct print “logged in”, else print “incorrect password”.
// Run the program as long as user types incorrect password.

import java.util.Scanner;

public class LoopPracticeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String correctPassword = "qwerty123";
        String passwordToGuess;

        do {
            passwordToGuess = scanner.nextLine();
            if (!passwordToGuess.equals(correctPassword)) {
                System.out.println("Incorrect password");
            } else {
                System.out.println("Logged in");
            }

        } while (!passwordToGuess.equals(correctPassword));
    }
}
