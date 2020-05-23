package tasks.day_10_05_2020;

import java.util.Scanner;

public class OperatorsTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.println(checkGender(name));
    }

    public static String checkGender(String name) {
        if (name.equals("kuba") || name.equals("kosma")) {
            return "male";
        } else if (name.substring(name.length() - 1).equals("a")) {
            return "female";
        } else {
            return "male";
        }
    }
}
