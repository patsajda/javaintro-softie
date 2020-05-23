package programs;

import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String inputName = scanner.nextLine();
        System.out.println("Your name is: " + inputName);
    }
}
