package tasks.day_23_05_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask6 {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(1993);
        listOfNumbers.add(15);


        System.out.println(listOfColours);
        Collections.sort(listOfColours);
        System.out.println(listOfColours);


        System.out.println(listOfNumbers);
        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}