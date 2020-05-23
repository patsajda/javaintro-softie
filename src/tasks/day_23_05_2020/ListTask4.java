package tasks.day_23_05_2020;

import java.util.ArrayList;
import java.util.List;

public class ListTask4 {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");

        updateFirstElement(listOfColours, "Pink");
    }


    public static void updateFirstElement(List<String> list, String newColour) {
        System.out.println(list);
        list.set(0, newColour);
        System.out.println(list);
    }
}
