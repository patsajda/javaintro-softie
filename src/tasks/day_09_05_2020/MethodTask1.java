package tasks.day_09_05_2020;

public class MethodTask1 {
    public static void main(String[] args) {
        System.out.println(avgNumber(2, 5, 10));

    }

    static float avgNumber(int number1, int number2, int number3) {
        float avgNumbers = (number1 + number2 + number3) / 3.0f;
        return avgNumbers;
    }
}
