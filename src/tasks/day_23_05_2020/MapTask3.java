package tasks.day_23_05_2020;

import java.util.HashMap;

public class MapTask3 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Adam", 45);
        ageOfPeople.put("Jacek", 63);
        ageOfPeople.put("Adam", 23);
        ageOfPeople.put("Bartosz", 37);

        checkIfContains(ageOfPeople, "Bartosz", 38);
    }

    static void checkIfContains(HashMap<String, Integer> map, String name, Integer age) {
        if (map.get(name).equals(age) ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
