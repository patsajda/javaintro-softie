package homework.day_19_05_2020;

//TODO: Display a 10 x 10 multiplication table in the following form.

public class Task8 {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            System.out.println("");
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b);
                System.out.print(" ");
            }
        }
    }
}