package rework.day_10_05_2020;

//TODO: Implement a program which prints even numbers between 1-20. Use continue.

public class LoopContinueTask2 {
    public static void main(String[] args) {
        for (int i = 20; i <= 30; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
