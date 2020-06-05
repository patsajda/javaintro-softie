package rework.day_09_05_2020;

public class LogicalTask1 {
    public static void main(String[] args) {
        System.out.println(containsThree(23, 3, 3));
        System.out.println(containsThree(3, 33, 31));
        System.out.println(containsThree(3, 19, 3));

        System.out.println(containsThreeNumber(23, 3, 3));
        System.out.println(containsThreeNumber(3, 33, 31));
        System.out.println(containsThreeNumber(3, 19, 3));
    }

    static boolean containsThree(int a, int b, int c) {
        if (a == 3 && b == 3)
            return true;
        else if (a == 3 && c == 3)
            return true;
        else if (b == 3 && c == 3)
            return true;
        else return false;
    }

    static boolean containsThreeNumber(int num1, int num2, int num3) {
        int counterOfThree = 0;
        if (num1 == 3) {
            counterOfThree++;
        }
        if (num2 == 3) {
            counterOfThree++;
        }
        if (num3 == 3) {
            counterOfThree++;
        }
        return (counterOfThree >= 2);
    }
}
