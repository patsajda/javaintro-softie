package rework.day_09_05_2020;

//TODO: Implement a program printing odd numbers in range 1-100 using for loop.

public class ForLoopTask3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
