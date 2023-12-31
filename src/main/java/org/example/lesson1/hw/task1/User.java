package org.example.lesson1.hw.task1;

import java.util.ArrayList;

public class User extends Basket{
    private String login;
    private String password;

    public User(ArrayList<Product> baskets, String login, String password) {
        super(baskets);
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
