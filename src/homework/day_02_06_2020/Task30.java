package homework.day_02_06_2020;

//TODO: Implement a method that will take two arguments – String s and int n, and return s multiplied by n times.

public class Task30 {
    public static void main(String[] args) {
        multiplyString("Course", 10);
    }

    public static void multiplyString(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }
}
