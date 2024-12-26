package _09_Methods;

public class Phone {


    public String call(int balance) {
        if (balance >= 5) {
            return "Tuuut tuuut tuuut";
        } else {
            return "Insufficient balance";
        }

    }


    public String sendMSG(String message, int balance) {
        if (balance >= 5) {
            ;
            return "Messege: \n" + "[" + message + "]" + "\n..... is sending";
        } else {
            return "Insufficient balance";
        }


    }
}