package tasks.day_23_05_2020;

public class TableTask7 {
    public static void main(String[] args) {
        int[] table1 = {1, 2, 3, 4, 77};

        for (int i = 0; i < table1.length; i++) {
            if (table1[i] == 77) {
                table1[i] = 88;
            }
            System.out.println(table1[i]);
        }
    }
}
