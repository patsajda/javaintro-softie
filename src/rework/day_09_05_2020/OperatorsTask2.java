package rework.day_09_05_2020;

//TODO: Given three integers – a, b and c, return true if two or more of them are equal.

public class OperatorsTask2 {
    public static void main(String[] args) {
        System.out.println(containsEqualNumber(23, 19, 23));
        System.out.println(containsEqualNumber(23, 33, 32));
        System.out.println(containsEqualNumber(3, 19, 3));
        System.out.println(containsEqualNumber(4, 4, 4));
    }

    static boolean containsEqualNumber(int a, int b, int c) {
        if (a == b || a == c || b == c) return true;
        else return false;
    }
}
