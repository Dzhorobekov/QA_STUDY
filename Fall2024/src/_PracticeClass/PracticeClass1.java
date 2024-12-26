package _PracticeClass;

import java.util.Scanner;

public class PracticeClass1 {
    public static void main(String[] args) {
        // проверка простых чисел

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int result = 0;
        int i1 = 1;
        for(int i = 1; i <= num; i++) {
            //   7 % 1 == 0
            //   7 % 2 == 1 false
            //   7 % 3 == 1 false
            //   7 % 4 == 1 false
            //   7 % 5 == 1 false
            //   7 % 6 == 1 false
            //   7 % 7 == 1 false
            if (num % i1 == 0) {
                // 1
                // 2
                result ++;
            }
            //2
            //3
            //4
            //5
            //6
            //7
            i1++;
        }
        

        if (result == 2){
            System.out.println("Простое число");
        } else if (result > 2){
            System.out.println("Не простое число");
        } else {
            System.out.println("LLkascko");
        }
    }
}
