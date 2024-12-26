package _15_OOP.constructor;

import java.util.Arrays;

public class Account {

    public String name;
    public String login;
    public char[] password;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password=" + Arrays.toString(password) +
                '}';
    }

    public Account(String name, String login, char[] password) {
        this.name = name;
        this.login = login;
        this.password = password;



    }
}
