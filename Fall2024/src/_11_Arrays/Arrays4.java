package _11_Arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {

        int numbers [] = {45, 90, 24, 65, 1, 54, 20, 9};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String names [] = {"Negimai", "Nasyikat", "Akylay", "julia", "Nasyikat"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        // binarySearch() - двоичный поиск

        String brands [] = {"Dior", "MaxMara", "YSL", "Channel"};
//        for (String brand : brands){
//            if (brand.equals("YSL")){
//                brand = "Yves Saint laurent";
//            }
//            System.out.println(brand);
//        }

        Arrays.sort(brands);
        System.out.println(Arrays.toString(brands));
        System.out.println(Arrays.binarySearch(brands, "Channel"));

    }
}
