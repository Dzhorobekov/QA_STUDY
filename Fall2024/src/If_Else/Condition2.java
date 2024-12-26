package If_Else;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
//        int num1 = 55;
//        int userNum = input.nextInt();
//
//        if (userNum ==1){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("no");

        System.out.println("Please enter your number");
        int number = input.nextInt();

//        int n1 = 10;
//        int n2 = 20;

//        if (number >= 0 && number <= 10){
//            System.out.println("ten");
//        }
//        else if (number >= 11 && number <= 20){
//            System.out.println("twenty");
//        }
//        else {
//            System.out.println("invalid number");
//        }
        int digit = input.nextInt();

        if (digit == 1){
            System.out.println("Salam");
        }
        else if (digit == 2)
            System.out.println("hello");
        else if (digit == 15){
            System.out.println("privet");
        }
        else {
            System.out.println("oops");
        }











    }
}
