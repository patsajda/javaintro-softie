package tasks.day_23_05_2020;

public class TableTask4 {
    public static void main(String[] args) {
        int[] table1 = {2, 20, 200, 77, 20000};

        for (int i = 0; i < table1.length; i++) {
            if (table1[i] == 77) {
                System.out.println("Contains 77!");
            } else {
                System.out.println("Not contains 77!");
            }
        }
    }
}
