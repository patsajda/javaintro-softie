package tasks.day_23_05_2020;

import java.util.ArrayList;
import java.util.List;

public class ListTask5 {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");

        System.out.println(listOfColours);
        listOfColours.remove(listOfColours.size() - 1);
        System.out.println(listOfColours);
    }
}