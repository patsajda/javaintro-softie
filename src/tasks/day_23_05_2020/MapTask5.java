package tasks.day_23_05_2020;

import java.util.HashMap;
import java.util.TreeSet;

public class MapTask5 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Adam", 45);
        ageOfPeople.put("Jacek", 63);
        ageOfPeople.put("Bartosz", 37);

        TreeSet<Integer> sortedList = new TreeSet<>(ageOfPeople.values());
        System.out.println(sortedList);
    }
}
