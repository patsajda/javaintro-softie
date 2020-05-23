package tasks.day_10_05_2020;

import java.util.Random;

public class RandomTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(11));
        System.out.println(random.nextInt(10)+1);

    }
}