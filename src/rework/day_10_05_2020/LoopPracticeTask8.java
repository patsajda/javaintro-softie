package rework.day_10_05_2020;

//TODO: Write a program getting a word and printing every second letter of it.
// Need rework!

import java.util.Scanner;

public class LoopPracticeTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type your word");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i+=2){
            System.out.print(word.charAt(i));
        }
    }
}
