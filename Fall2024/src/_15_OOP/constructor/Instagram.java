package _15_OOP.constructor;

import java.util.Arrays;

public class Instagram {

    public String name;
    public String login;
    public char[] password;

    public Instagram(){ //пустой конструктор по умолчанию
        // class -> default constructor
        //default constructor->empty constructor

        //constructor:
        //1.Java-default
        //2.User-empty constructor, constructor with params

        //method calls
        //1. constructor - calls when we will create new object
        // custom method - any time, anywhere

    }

    public Instagram (String myName, String myLogin, char[] myPassword){
        name = myName;
        login = myLogin;
        password = myPassword;

    }


    public void makeReels(String video){
        System.out.println("Reels with - ");

    }

    public void makeStories(String filter){
        System.out.println("Story with - " + filter);
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password=" + Arrays.toString(password) +
                '}';
    }
}
