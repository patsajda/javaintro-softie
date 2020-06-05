package homework.day_02_06_2020;

//TODO: In the Circle class, create a constructor that initializes all the variables except area. Use a proper formula to initialize area.

public class Task26 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, 5.5, 2.5, 2);
    }

    public static class Circle {
        public double x;
        public double y;
        public double r;
        public double area;

        public Circle(double x, double y, double r, double area) {
            this.x = x;
            this.y = y;
            this.r = r;
            this.area = area;
        }

        public void setArea() {
            area = Math.PI * r * r;
        }
    }
}
