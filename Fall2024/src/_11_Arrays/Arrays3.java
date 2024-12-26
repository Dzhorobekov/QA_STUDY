package _11_Arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {


        String cities[] = new String[4];
        cities[0] = "Bishkek";
        cities[1] = "Almaty";
        cities[2] = "Taskent";
        cities[3] = "Dushanbe";

        System.out.println(cities.length);
        System.out.println(Arrays.toString(cities));

//        for (int i = 0; i < cities.length; i++){
//            System.out.println(cities[i] + " ");
//        }

        for (String city : cities) {
            System.out.println(city);
        }

        double prises[] = new double[5];
        prises[0] = 12.6;
        prises[1] = 39.76;
        prises[2] = 0.25;
        prises[3] = 88.8;
        prises[4] = 90.3;
        System.out.println(Arrays.toString(prises));


        for (double price : prises) {
            if (price > 10.5) {
                System.out.println(price);

            }
        }
    }
}

