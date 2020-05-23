package programs;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        a = 30;
        b = 15;

        String operacja = "/";

        switch (operacja) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;

            default:
        }
    }
}
