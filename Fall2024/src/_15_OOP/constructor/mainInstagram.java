package _15_OOP.constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class mainInstagram {
    public static void main(String[] args) {


        Instagram media = new Instagram(); //конструктор вызывается строго при оздании метода

        char[] bemsPassword = {'q','w', 'e', 'r', 't', 'y'};
        System.out.println(Arrays.toString(bemsPassword));
        System.out.println(bemsPassword[3]);
        bemsPassword[0] = 'M';
        System.out.println(Arrays.toString(bemsPassword));
        Instagram Media2 = new Instagram("Bermet", "LadyBems", bemsPassword);
        System.out.println(Media2);
        
    }
}
