package rework.day_09_05_2020;

//TODO: Print a random integral number in the range of <0; 10>.

import java.util.Random;

public class RandomTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(11));
    }
}
