package _04_scanner;

import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {

        // data types :
        //1. primitive data types  (key-words --> lower case) ключевые слова
        //2. non=primitive (class   --> upper case)

        int num = 89; // примитивный тип данных пишется с нижнего регистра

        String name = "Adilet"; // не прмитивный тип данных пишется с верхнего регистра

        // Scanner.java.util
        // util --> java --> java --> Scanner


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя:  ");
        String username = scan.nextLine();
        //System.out.println("Привет, " + username);


       // int userAge = scan.nextInt();
       // System.out.println(userAge);
       // System.out.println("user age,    ");


       //int size = scan.nextInt();
       // System.out.println(size);



        //long salary = scan.nextLong();
        //System.out.println(salary);


        //float flo1 = scan.nextFloat();
        //System.out.println(flo1);

        double d1 = scan.nextDouble();
        System.out.println(d1);
    }
}
