package homework.day_02_06_2020;

//TODO: Write a method that plays ping-pong. It should accept String parameter. If the argument passed to the method equals “ping”, it should return “pong”.
// Otherwise it should return “ping to you”. If you call the method 10 times in a row with "ping" – it should return “You won!”.

public class Task40 {
    private static int count = 0;

    public Task40() {
        count++;
    }

    public static void main(String[] args) {
        pingPong("ping");
        pingPong("pong");
        pingPong("ping");
        pingPong("ping");
        pingPong("pong");
        pingPong("ping");
        pingPong("ping");
        pingPong("ping");
        pingPong("pong");
        pingPong("ping");
        pingPong("ping");
        pingPong("ping");
        pingPong("ping");
    }


    public static void pingPong(String s) {
        if (count == 10) {
            System.out.println("You win!");
        }
        if (s.contains("ping")) {
            count++;
            System.out.println("pong");
        } else if (s.contains("pong")) {
            System.out.println("ping to you");
        }
    }
}
