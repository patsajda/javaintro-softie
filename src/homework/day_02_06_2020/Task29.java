package homework.day_02_06_2020;

//TODO: Use keyboard to enter height in meters and weight in kilograms and calculate BMI of the person. Display the category based on the graphics.

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight [kg]: ");
        int weight = scanner.nextInt();
        System.out.println("Enter your height [m]: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Under Weight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Healthy Weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi <= 39.9) {
            System.out.println("Obesity");
        } else {
            System.out.println("Severe Obesity");
        }
    }
}
