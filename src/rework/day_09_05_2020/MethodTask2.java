package rework.day_09_05_2020;

//TODO: Write a method calculateArea() to calculate and return the area of a circle for given the radius.
// Call the method in the main method on two different values.

public class MethodTask2 {
    public static void main(String[] args) {
        System.out.println(calculateArea(2));
        System.out.println(calculateArea(10));
    }

    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
}
