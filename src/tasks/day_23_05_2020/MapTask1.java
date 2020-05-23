package tasks.day_23_05_2020;

import java.util.HashMap;

public class MapTask1 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Adam", 45);
        ageOfPeople.put("Jacek", 63);
        ageOfPeople.put("Adam", 23);
        ageOfPeople.put("Bartosz", 37);

        System.out.println(ageOfPeople);
    }
}
