package tasks.day_23_05_2020;

import java.util.ArrayList;
import java.util.List;

public class ListTask2 {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");
        listOfColours.add(0, "Brown");

        System.out.println(listOfColours);
    }
}
