package homework.day_02_06_2020;

//TODO: Create a Dog class with a static dogCount variable that will store the number of Dog class instances (objects) created. Design a proper constructor.

public class Task28 {
    public static void main(String[] args) {
        System.out.println(Dog.dogCount);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(Dog.dogCount);
    }

    static class Dog {
        static int dogCount = 0;

        public Dog() {
            dogCount++;
        }
    }
}
