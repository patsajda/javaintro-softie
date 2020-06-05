package rework.day_09_05_2020;

//TODO: Copy task 1. and change it to handle various „adulthood” definitions; Ask user for a country and age and then calculate if he/she can enter the website or not.

public class IfLoopTask8 {
    public static void main(String[] args) {
        checkAge(17, "pl");
    }

    public static void checkAge(int age, String country) {
        if (age >= 18 && !country.toUpperCase().equals("USA") && !country.toUpperCase().equals("UK")) {
            System.out.println("you can enter the website");
        } else if (age >= 16 && country.toUpperCase().equals("USA")) {
            System.out.println("you can enter the website");

        } else if (age >= 21 && country.toUpperCase().equals("UK")) {
            System.out.println("you can enter the website");
        } else {
            System.out.println("you can't enter the website");
        }
    }
}
