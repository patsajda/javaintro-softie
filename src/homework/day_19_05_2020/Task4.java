package homework.day_19_05_2020;

//TODO: In the print method, display the passed string 5 times.

public class Task4 {
    public static void main(String[] args) {
        print("Example how it's works!");
    }

    public static void print(String s) {
        for (int i = 1; i <=5; i++){
            System.out.println(s);
        }
    }
}
