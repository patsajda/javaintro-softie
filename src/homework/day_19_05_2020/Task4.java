package homework.day_19_05_2020;

//TODO: In the print method, display the passed string 5 times.

public class Task4 {
    public static void main(String[] args) {
        print("Being an automation engineer is nice!");
    }

    public static void print(String s) {
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
        }
    }
}
