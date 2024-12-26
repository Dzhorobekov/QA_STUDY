package _04_scanner;

import java.util.Scanner;

public class ScanHomeWork2_1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String username = scan.next(); // дает возможномть дальше писать в консоле на одной строке
        System.out.println("Привет, " + username);
        // заправшиваем возраст
        System.out.println("Сколько тебе лет? ");
        // вводим возраст
        int userage = scan.nextInt(); // вводим возраст
        scan.nextLine(); // очищаем буфер после nextInt()

        // Запрашиваем откуда пользователь
        System.out.println("Откуда ты? ");
        String userCity = scan.nextLine(); // вводим город

        //логическая цeпочка
        if (userage < 18) {
            System.out.println(username + ", тебе меньше 18 лет, поэтому тебе пока нелья водить машину.");
        } else {
            System.out.println(username + ", тебе " + userage + " лет, так что можешь получить водительские права.");

        }
        // Дополнительный вывод о месте жительства
        System.out.println("Кстати," + userCity + " - это отличный город!");

        scan.close(); // закрываем сканнер










    }
}
