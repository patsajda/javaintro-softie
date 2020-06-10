package homework.day_02_06_2020;

//TODO: Implement a method that will take an array of integers as a parameter and will return it sorted descending.

import java.util.Arrays;

public class Task31 {
    public static void main(String[] args) {
        int[] tab = {1, 4, 2, 3, 345, 62, 43, 6, 7321, 34, 67, 32};
        tab = sortedDescending(tab);

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    static int[] sortedDescending(int[] table) {
        Arrays.sort(table);

        for (int i = 0; i < table.length / 2; i++) {
            int set = table[i];
            table[i] = table[table.length - 1 - i];
            table[table.length - 1 - i] = set;
        }
        return table;
    }
}
