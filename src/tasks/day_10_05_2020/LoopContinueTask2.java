package tasks.day_10_05_2020;

public class LoopContinueTask2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
