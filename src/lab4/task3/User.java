package lab4.task3;

public class User {
    private final String login = "admin";
    private final String password = "1234";

    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}
