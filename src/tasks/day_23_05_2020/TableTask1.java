package tasks.day_23_05_2020;

public class TableTask1 {
    public static void main(String[] args) {
        int[] table1 = {2, 20, 200, 2000, 20000};

        for (int i = 0; i < 5; i++) {
            System.out.println(table1[i]);
        }
        for (int element : table1
        ) {
            System.out.println(element);
        }
    }
}
