package tasks.day_23_05_2020;

import java.util.ArrayList;
import java.util.List;

public class ListTask3 {
    public static void main(String[] args) {
        List<String> listOfColours = new ArrayList<>();
        listOfColours.add("Red");
        listOfColours.add("Blue");
        listOfColours.add("Yellow");

        firstAndThird(listOfColours);

    }

    public static void firstAndThird(List<String> list){
        if (list.size() > 0 ) {
            System.out.println(list.get(0));
        } if (list.size() > 2) {
            System.out.println(list.get(2));
        }
    }
}
