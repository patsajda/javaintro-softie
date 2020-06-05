package homework.day_02_06_2020;

//TODO: Create a Soldier class. The soldier should have 4 attributes: age, weight, strength and agility. Also implement boolean fight(Soldier anotherSoldier)
// method that will return true if a fight was won and false if it was lost. Design your own fight algorithm.

public class Task23 {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier(28, 80, 75, 80);
        Soldier soldier2 = new Soldier(35, 90, 90, 70);

        System.out.println(soldier1.fight(soldier2));
    }

    public static class Soldier {
        private int age;
        private int weight;
        private int strength;
        private int agility;

        public Soldier(int age, int weight, int strength, int agility) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
            this.agility = agility;
        }

        public boolean fight(Soldier anotherSoldier) {
            if (countSoliderSkills(this) > countSoliderSkills(anotherSoldier)) return true;
            else return false;
        }

        public int countSoliderSkills(Soldier soldier) {
            return ((soldier.strength * soldier.agility) - soldier.weight / soldier.age);
        }
    }
}
