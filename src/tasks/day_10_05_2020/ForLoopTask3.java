package tasks.day_10_05_2020;

public class ForLoopTask3 {
    public static void main(String[] args) {
        System.out.println(countSumUpToNumber(4));
        System.out.println(countSumUpToNumber(10));

    }

    static int countSumUpToNumber(int number) {
        int temporarySum = 0;
        for (int i = 1; i <= number; i++) {
            temporarySum += 1;
        }
        return temporarySum;
    }
}
