package tasks.day_23_05_2020;

import java.util.Arrays;

public class TableTask8 {
    public static void main(String[] args) {
        int[] table = {3, 67, 13, 432, 1};
        System.out.println(Arrays.toString(twoElements(table)));
    }


    public static int[] twoElements(int[] tab) {
        int[] newTable = new int[2];
        if (tab.length > 0) {
            newTable[0] = tab[0];
            newTable[1] = tab[tab.length - 1];
        }
        return newTable;
    }
}

