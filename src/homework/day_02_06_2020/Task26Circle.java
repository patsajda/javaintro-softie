package homework.day_02_06_2020;

//TODO: In the Circle class, create a constructor that initializes all the variables except area. Use a proper formula to initialize area.

public class Task26Circle {
    public double x;
    public double y;
    public double r;
    public static double area;

    public Task26Circle() {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public static void main(String[] args) {
        Task26Circle example = new Task26Circle();
        Task26Circle.area = example.r * example.x;
    }
}
