package tasks.day_23_05_2020;

public class MultiTableTask1 {
    public static void main(String[] args) {
        String[][] multiTable = {{"cat", "dog", "mouse"}, {"ford", "audi", "fiat", "mercedes"}};

        for (int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable[i].length; j++) {
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
