package tasks.day_09_05_2020;

public class MethodTask2 {
    public static void main(String[] args) {
        System.out.printf("Pole koła wynosi: %.2f", calculateArea(3));
    }

    static double calculateArea(int radius) {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }
}
