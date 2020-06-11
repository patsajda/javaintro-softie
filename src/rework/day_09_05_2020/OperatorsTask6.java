package rework.day_09_05_2020;

//TODO: Ask user to type the current password and to set a new one.

import java.util.Scanner;

public class OperatorsTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current password: ");
        String enteredCurrentPassword = scanner.nextLine();
        System.out.println("Enter your new password: ");
        String enteredNewPassword = scanner.nextLine();

        setNewPassword(enteredCurrentPassword, enteredNewPassword);
    }

    static void setNewPassword(String currentPassword, String newPassword) {
        if (!currentPassword.equals(newPassword) && newPassword.length() >= 6 &&
                (newPassword.contains("@") || newPassword.contains("#") || newPassword.contains("$") || newPassword.contains("!"))) {
            System.out.println("password saved");
        } else {
            System.out.println("incorrect password");
        }
    }
}
