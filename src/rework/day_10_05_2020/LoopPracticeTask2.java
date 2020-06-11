package rework.day_10_05_2020;

//TODO: Implement a program printing 10 random numbers (1-6) using for loop.

import java.util.Random;

public class LoopPracticeTask2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(6) + 1);
        }
    }
}
