package tasks.day_23_05_2020;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTask1 {
    public static void main(String[] args) {
        String name1 = "Adam";
        String name2 = "Piotr";
        String name3 = "Jacek";
        String name4 = "Piotr";
        String name5 = "Tomasz";
        String name6 = "Bartosz";
        String name7 = "Jacek";


        HashSet<String> names = new HashSet<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);
        names.add(name6);
        names.add(name7);

        LinkedHashSet linkedNames = new LinkedHashSet();
        linkedNames.add(name1);
        linkedNames.add(name2);
        linkedNames.add(name3);
        linkedNames.add(name4);
        linkedNames.add(name5);
        linkedNames.add(name6);
        linkedNames.add(name7);


        TreeSet setNames = new TreeSet();
        setNames.add(name1);
        setNames.add(name2);
        setNames.add(name3);
        setNames.add(name4);
        setNames.add(name5);
        setNames.add(name6);
        setNames.add(name7);

        System.out.println(names);
        System.out.println(linkedNames);
        System.out.println(setNames);
    }
}
