package tasks.day_23_05_2020;

public class TableTask6 {
    public static void main(String[] args) {
        int[] table1 = {1, 2, 3, 4, 5};
        int[] table2 = new int[table1.length];

        for (int i = 0; i < table1.length; i++) {
            System.out.println(table1[i]);
            table2[i] = table1[i];
            System.out.println("Copied table: " + table2[i]);
        }
    }
}
