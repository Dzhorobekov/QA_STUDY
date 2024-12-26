package _06_switch_;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Draft {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // final String dob = "15.02.1989"; // final делает константу, тоесть окончательный вариант


         final String nike = "Nike";
        String air = "Air";
        String jordan = "Jordan";
        String zoom = "Zoom";

        final String adidas = "Adidas";
        String samba = "Samba";
        String gazelle = "Gazelle";
        String yeezy = "Yeezy";

        String model = scanner.nextLine();

        System.out.println("Please choose the brand");
        String variant = scanner.nextLine();


        switch (variant){
            case nike:
                System.out.println("Please choose model of " + nike);

//                Stringmodel = scanner.nextLine();


                }



//            case adidas:
//                System.out.println("Please choose model of " + adidas);
//                model = scanner.nextLine();
//
//        switch (model){

        }


    public void addProduct(ArrayList<String> products) {
    }

    public void showProducts(ArrayList<String> products) {
        Draft obj = new Draft();

    }

    public void deleteProduct(ArrayList<String> products) {
        Draft obj = new Draft();
    }
}
