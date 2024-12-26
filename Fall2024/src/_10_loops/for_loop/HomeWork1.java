package _10_loops.for_loop;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //заранее задаем переменные, которые будем использовать в коде
        String Login = "qwerty";
        String Password = "12345";

        // переменная для хранения введенного логина
        String userLogin;


        boolean loginSuccess = false; //переменная для проверки логина

        //попытка ввода логина
        for (int a = 0; a < 1; a++){
            System.out.println("Please enter your login: ");
            userLogin = scanner.nextLine();

            //проверка логина и сразу задаем ответ на неправильный ввод
            if (userLogin.equals(Login)){
                loginSuccess = true;
                break;
            } else {
                System.out.println("Invalid login");
            }
        }
        // при правильном логине вводим пароль
        boolean passwordSuccess = false;

        // попытка ввода пароля(три раза)
        for (int a = 0; a <3; a++){
            System.out.println("Please enter your password");
            String userPassword = scanner.nextLine();

            //проверка пароля
            if (userPassword.equals(Password)){
                passwordSuccess = true;
                break;
            }else {
                System.out.println("Invalid password");
            }
        }
        //проверяем успешно ли введен пароль
        if (passwordSuccess){
            System.out.println("Success!!!");
        } else {
            System.out.println("All attempts are exhausted");
        }
    }
}
