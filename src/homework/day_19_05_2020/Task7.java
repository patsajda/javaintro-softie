package homework.day_19_05_2020;

//TODO: Write code for the convertUsdToPln method, which converts dollars to polish zlotys at a given exchange rate.
//      Use a return statement to return the result from the method. In the main method call the method 3 times and display results.

public class Task7 {
    public static void main(String[] args) {
        System.out.println(convertUsdToPln(100, 4.2));
        System.out.println(convertUsdToPln(33, 3.92));
        System.out.println(convertUsdToPln(15, 4.31));
    }

    public static double convertUsdToPln(int usd, double exchangeRate) {
        double convert = usd * exchangeRate;
        return convert;
    }
}
