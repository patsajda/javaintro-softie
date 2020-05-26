package homework.day_19_05_2020;

//TODO: Calculate the total cost of beer.

public class Task12 {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.addPrice(5);
        Beer beer2 = new Beer();
        beer2.addPrice(12);
        System.out.println("The cost of beer is " + Beer.beerPrice);
    }

    public static class Beer {
        public static int beerPrice = 0;

        public static void addPrice(int newBeerPrice) {
            beerPrice += newBeerPrice;
        }
    }
}

