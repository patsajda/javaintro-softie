package tasks.day_23_05_2020;

public class TableTask5 {
    public static void main(String[] args) {
        int[] table1 = {2, 3, 200, 3, 20000};

        for (int i = 0; i < table1.length; i++) {
            if (table1[i] == 3) {
                System.out.println(i);
            } else {
                System.out.println("Not found 3 in table!");
            }
        }
    }
}
