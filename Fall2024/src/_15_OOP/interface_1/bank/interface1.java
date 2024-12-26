package _15_OOP.interface_1.bank;

import java.util.Random;

public class interface1 {

    char KASSA = 'K';
    char CREDIT = 'C';
    char OP = 'O';


    private String getTalon(char department){
        String result ;
        Random r = new Random();
        int number;
        if (department == KASSA){
            number = r.nextInt();
            result = KASSA + "-" + number;
        }else if (CREDIT == department){
            number = r.nextInt();
            result = CREDIT + "-" + number;
        } else if (OP == department) {
            number = r.nextInt();
            result = OP + "-" + number;
        }
        else {
            result = "LunchTime";
            return result;
        }
        return result;
    }

    static String consultation(String talon){
        if ()
    }
}
