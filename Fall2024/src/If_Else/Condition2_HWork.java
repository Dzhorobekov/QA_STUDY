package If_Else;

import java.util.Scanner;

public class Condition2_HWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a time and we will assign you a day");
        double time = input.nextInt();
        if (time == 9.00){
            System.out.println("Well'll book you in for Monday");
        }
        else if (time == 12.00 ){
            System.out.println("Sorry, but this time is busy! Tuesday is free.");
        }
        else if (time == 14.00){
            System.out.println("I can offer you Wednesday");
        }
        else if (time == 15.00){
            System.out.println("This time a busy, let's do it Thursday");
        }
        else if (time  == 16.00){
            System.out.println("Also busy, let's do Friday");
        }
        else if (time == 17.00){
            System.out.println("Holy shit, this time also busy. Saturday");
        }
        else if (time == 19.00){
            System.out.println("Go to hell! It's already Sunday.");
        }




    }
}
