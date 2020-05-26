package homework.day_19_05_2020;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(sumDigits(6222));
    }

    public static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}