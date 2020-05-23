package tasks.day_10_05_2020;

import java.util.Random;

public class ForLoopTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt((6)+1);

        for (int i = number; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
