package tasks.day_09_05_2020;

public class IfLoopTask5 {
    public static void main(String[] args) {
        enterTheClub(18);
        enterTheClub(60);
        enterTheClub(16);
        enterTheClub(82);
    }

    static void enterTheClub(int age) {
        if (age >= 18) {
            System.out.println("You can enter.");
        } else if (age < 80) {
            System.out.println("You are too old.");
        } else {
            System.out.println("You are too young.");
        }
    }
}


