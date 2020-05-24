package homework.day_19_05_2020;

//TODO: Uncomment one line so that the program displays the numbers 30 and 5.

public class Task2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        y = x * y;
        // y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
