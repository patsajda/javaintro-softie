package tasks.day_23_05_2020;

public class WrapperClassTask1 {
    public static void main(String[] args) {
        String exampleString = "123324234";
        Integer exampleInteger = Integer.valueOf(exampleString);
        System.out.println(exampleInteger + 2);

        String anotherString = "3.14";
        Double exampleDouble = Double.valueOf(anotherString);
        System.out.println(exampleDouble + 1.14);
    }
}
