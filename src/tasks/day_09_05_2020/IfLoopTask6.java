package tasks.day_09_05_2020;

import java.util.Scanner;

public class IfLoopTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your PESEL: ");
        String pesel = scanner.nextLine();
        int peselLength = pesel.length();

        String checkPeselNumber = pesel.substring(9, 10);
        int numberCheck = Integer.parseInt(checkPeselNumber);

        if (peselLength != 11){
            System.out.println("Invalid Pesel format!");
        }
        else if (numberCheck % 2 == 0) {
            System.out.println("It's female!");
        } else {
            System.out.println("It's male!");
        }
    }
}
