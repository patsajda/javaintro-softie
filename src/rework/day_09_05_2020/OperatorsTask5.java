package rework.day_09_05_2020;

//TODO: Read the age and gender and decide if user can join the golf club.

import java.util.Scanner;

public class OperatorsTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String enteredGender = scanner.nextLine();
        System.out.println("Enter your age: ");
        int enteredAge = scanner.nextInt();

        joinClub(enteredAge, enteredGender);
    }

    static void joinClub(int age, String gender) {


        if (gender.equals("male") && age >= 20 || gender.equals("female") && age >= 22) {
            if (gender.equals("male") && age < 60 || gender.equals("female") && age < 62) {
                System.out.println("you can join us");
            } else {
                System.out.println("you are too old");
            }
        } else {
            System.out.println("you are too young");
        }
    }
}
