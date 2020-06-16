package rework.day_10_05_2020;

//TODO: Implement a program which prints numbers between 20-30 but omits 23 and 25. Use continue.

public class LoopContinueTask1 {
    public static void main(String[] args) {
        for (int i = 20; i <= 30; i++) {
            if (i == 23 || i == 25)
                continue;
            System.out.println(i);
        }
    }
}
