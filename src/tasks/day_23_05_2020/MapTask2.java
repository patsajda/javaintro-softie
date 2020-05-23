package tasks.day_23_05_2020;

import java.util.HashMap;

public class MapTask2 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageOfPeople = new HashMap<>();
        ageOfPeople.put("Adam", 45);
        ageOfPeople.put("Jacek", 63);
        ageOfPeople.put("Adam", 23);
        ageOfPeople.put("Bartosz", 37);

        System.out.println(sizeOfTheMap(ageOfPeople));

    }

    static Integer sizeOfTheMap(HashMap<String, Integer> map) {
        return map.size();
    }
}
