package _08_StringBuilfer;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your login");
        String login = input.nextLine();

        System.out.println("Write your password: ");
        String password = input.nextLine();

        if (password.length() > 8 && password.matches(".*[#$%].*")) {
            String userInput;
            int attempts = 0; // счетчик попыток
            boolean isPasswordConfirmed = false;

            //тут задаем колчество попыток
            while (attempts < 3) {
                System.out.println("Write your password again to confirm:");
                userInput = input.nextLine();

                if (userInput.equals(password)) {
                    isPasswordConfirmed = true;
                    break;
                } else {;
                    System.out.println("Passwords do not match. Attempts left: " + (3 - attempts));
                }
            }

            if (isPasswordConfirmed) {
                System.out.println("Welcome, " + login + "!");
            } else {
                System.out.println("Too many failed attempts. Authorization failed.");
            }
        } else {
            System.out.println("Password is not valid. It must be longer than 8 characters and contain one of the following symbols: #, $, %.");
        }

    }
}

