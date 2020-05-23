package tasks.day_23_05_2020;

public class TableTask3 {
    public static void main(String[] args) {
        int[] table1 = {2, 20, 200, 2000, 20000};
        int sum = 0;

        for (int i = 0; i < table1.length; i++) {
            sum += table1[i];
        }
        System.out.println(sum / table1.length);
    }
}
