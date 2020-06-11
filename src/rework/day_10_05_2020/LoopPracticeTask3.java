package rework.day_10_05_2020;

//TODO: Implement a program printing odd numbers in range 1-100 using for loop.

public class LoopPracticeTask3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }
}
