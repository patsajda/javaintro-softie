package rework.day_09_05_2020;

//TODO: Given 2 integers – return their sum. However, if at least one number is in the range 11-20 inclusive, return 99.

public class OperatorsTask3 {
    public static void main(String[] args) {
        System.out.println(numSum(10, 1));
        System.out.println(numSum(14,13));
        System.out.println(numSum(10,13));
        System.out.println(numSum(3,4));

    }

    static int numSum(int num1, int num2) {
        if (num1 >= 11 && num1 <= 20 || num2 >= 11 && num2 <= 20) return 99;
        else return num1 + num2;
    }
}
