package tasks.day_23_05_2020;

public class MultiTableTask2 {
    public static void main(String[] args) {
        int[][] multiTable = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
        myNumbers(multiTable);
    }

    public static void myNumbers(int[][] table) {
        System.out.println(table[1][2]);
    }
}
