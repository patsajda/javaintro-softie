package programs;

public class PasswordBreak {
    public static void main(String[] args) {
        int date = 0;

        while (date <= 2000) {
            if (checkPassword("marcin.kowlaski", date)) {
                System.out.println("Password correct!");
                break;
            }
            date++;
        }
    }

    public static boolean checkPassword(String login, int password) {
        return (login.equals("marcin.kowlaski") && password == 1989);
    }
}
