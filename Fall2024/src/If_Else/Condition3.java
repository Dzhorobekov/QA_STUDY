package If_Else;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        // 1. If
        // 2. If-Else
        // 3. If-else Ladder

        //A --> 80-100
        //B --> 60-79
        //C --> 40-59
        //D --> < 40 (0-39)

        Scanner input = new Scanner(System.in);
//        int points = input.nextInt();
//
//        if (points >= 0 && points <= 39){
//            System.out.println('D');
//        }
//        else if (points >= 40 && points <= 59){
//            System.out.println('C');
//        }
//        else if (points >= 60 && points <= 79){
//            System.out.println('B');
//        }
//        else if (points >= 80 && points <= 100){
//            System.out.println('A');
        String firstName = "will";
        String lastName = "smith";
        int yob = 1992;

        System.out.println("Please enter your firstName");
        String userFirstName = input.nextLine();
        if (userFirstName.equals(firstName)){
            System.out.println("Please enter lastName");
            String userLastName = input.nextLine();
            if (userLastName.equals(lastName)){
                System.out.println("Please enter year of birth");
                int userYOB = input.nextInt();
                if (userYOB == yob){
                    System.out.println("welcome");
                } else {
                    System.out.println("Wrong YOB");
                }
            } else {
                System.out.println("Wrong Last name");
            }
        }






    }
}
