package _09_Methods.void_methods;

import java.util.Scanner;

public class M2 {

    public void getSize(int userSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your size");
       // int userSize = scanner.nextInt();
        String size = "";
        if (userSize >= 30 && userSize <= 35) {
            size = "XXS";
        } else if (userSize > 35 && userSize <= 37) {
            size = "XS";
        } else if (userSize > 37 && userSize <= 39) {
            size = "M";
        } else if (userSize > 42 && userSize <= 45) {
            size = "L";
        } else {
            size = "XXX";
        }
        System.out.println(size);
    }

    public void botMessege(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hi! I am Piter Pen! \n" + "Whats is your name");
        String userName = scanner.nextLine();
        System.out.println("Please choose language: RU, ENG, KG");
        String russian = "RU";
        String english = "ENG";
        String kyrhyz = "KG";
        String language = scanner.nextLine();
        if (language.equals(russian)){
            System.out.println("Привет " + userName);
        }else if (language.equals(english)) {
            System.out.println("HI!" + userName);
        } else if (language.equals(kyrhyz)){
            System.out.println("Салам!" + userName);
        }
        else {
            System.out.println("Please enter RU, ENG or KG");
        }
    }
}