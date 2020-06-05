package rework.day_09_05_2020;

public class ConditionalTask1 {
    public static void main(String[] args) {
        checkAge(79);
    }

    public static void checkAge(int age) {
        if (age >= 18) {
            if (age >= 80) {
                System.out.println("you are too old!");
            } else {
                System.out.println("welcome!");
            }
        } else {
            System.out.println("you are too young!");
        }
    }
}
