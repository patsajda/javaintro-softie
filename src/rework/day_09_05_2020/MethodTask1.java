package rework.day_09_05_2020;

//TODO: Create a new class. Write a method avgNumber().
// Call avgNumber() in main method on three different set of numbers.

public class MethodTask1 {
    public static void main(String[] args) {
        System.out.println(avgNumber(15, 10, 5));
        System.out.println(avgNumber(35, 2, 17));
        System.out.println(avgNumber(99, 74, 34));
    }

    public static int avgNumber(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}