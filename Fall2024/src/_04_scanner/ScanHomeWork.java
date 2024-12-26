package _04_scanner;

import java.util.Scanner;

public class ScanHomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     //   System.out.print("Введите ваше имя:    ");
     //   String username = scan.nextLine();
     //   System.out.println("Привет," + username);

        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.hasNextBoolean();
        float num3 = scan.nextFloat();

    }
}
