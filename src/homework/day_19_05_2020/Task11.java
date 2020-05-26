package homework.day_19_05_2020;

//TODO: Fix one of the most common errors in the code below so that the person’s age is changed.

public class Task11 {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.changeAge(person.age);
        System.out.println("New age: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void changeAge(int ageToChange) {
            age = age + 20;
            System.out.println("The age in changeAge() is " + age);
        }
    }
}
