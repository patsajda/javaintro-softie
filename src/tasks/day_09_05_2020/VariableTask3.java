package tasks.day_09_05_2020;

public class VariableTask3 {
    public static void main(String[] args) {
        float exampleVariable = 3.143423f;
        String newText = String.valueOf(exampleVariable).replace(".", "");
        System.out.println(newText);
    }
}
