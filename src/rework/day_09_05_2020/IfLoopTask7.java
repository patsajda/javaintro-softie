package rework.day_09_05_2020;

//TODO: Ask user for 3 numbers and print the biggest one.

public class IfLoopTask7 {
    public static void main(String[] args) {
        System.out.println(checkSmallestNumber(5,2,19));
        System.out.println(checkSmallestNumber(15,12,1));
        System.out.println(checkSmallestNumber(105,201,189));
    }

    static int checkSmallestNumber(int a, int b, int c) {
        int smallestNumber = Math.min(a, b);
        if (smallestNumber > c) return c;
        else return smallestNumber;
    }
}
