package homework.day_02_06_2020;

//TODO: Write all possible constructors for the Circle class from the previous exercise. Area should not be passed as an argument.
// Count it in a constructor if possible (if you have sufficient data). Remember about the default constructor.

public class Task27 {
    public static void main(String[] args) {
    }

    public static class Circle {
        public double x;
        public double y;
        public double r;
        public double area;

        public Circle() {
        }

        public Circle(double r) {
            this.r = r;
            area = Math.PI * r * r;
        }

        public Circle(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
            area = Math.PI * r * r;
        }
    }
}
