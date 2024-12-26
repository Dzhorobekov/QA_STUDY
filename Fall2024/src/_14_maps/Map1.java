package _14_maps;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
//        Integer [] nums = {12, 7, 2, 5, 24, 80, 5};
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(nums));
//        System.out.println(list1);
//        Collections.sort(list1);
//
//        System.out.println(list1);

        // Collections framework
        //1.Interface Collection
        //2.Interface Map

        //Collection --> interface
        //Collection --> class

        System.out.println("___________________________________________________________________________");

        Map<Integer, String> dates = new HashMap<>();
        dates.put(312, "Bishkek");
        dates.put(791, "Russia");
        dates.put(7770, "Kazahstan");
        System.out.println(dates);

        // Ирархия
        // Arrays -> [index] 1)datatype  2)length

        //List    -> [index] -> duplicates          1)datatype

        //Set     -> []      -> no duplicates       1)datatype

        //Map     -> [key]

        Map<String, String> dates2 = new LinkedHashMap<>();
        dates2.put("UAE", "United Arab Emirates");
        dates2.put("UK", "United Kingdom");
        dates2.put("RF", "Russian Federation");
        dates2.put("The Great Britain", "United Kingdom");
        System.out.println(dates2);
        System.out.println(dates2.get("UK"));
        System.out.println(dates2.get("RF"));
        System.out.println(dates2.get("The Great Britain"));

        System.out.println(dates2.get("UK").hashCode());
        System.out.println(dates2.get("The Great Britain").hashCode());

        int [] nums = new int[2];
        nums [0] = 34;
        System.out.println(Arrays.toString(nums));

        // 0, 1 мы не контролируем индексвцию
        // [34,0] мы задаем значения,жава сама определяет инексацию

        Map<Integer, String> dates3 = new LinkedHashMap<>();
        dates3.put(12, "Hello");
        dates3.put(78, null);
        dates3.put(65, "Salam");
        dates3.put(null, "Namaste");
        System.out.println(dates3);

        Integer num = 0;
        Integer num2 = 89;
        Integer num3= null;

        System.out.println("_________________");

        int n1 [] = new int[2];
        System.out.println(Arrays.toString(n1));

        Integer n2 [] = new Integer[2];
        System.out.println(Arrays.toString(n2));

        System.out.println("_________________");

        Map<String, String> city_country = new LinkedHashMap<>();
        city_country.put("SK", "South Korea");
        city_country.put("UA", "Ukraine");
        city_country.put("UK", "United Kingdom");
        city_country.put("U", "Ukraine");
        System.out.println(city_country);


        Map<String, String> group_name = new LinkedHashMap<>();
        group_name.put("F1", "John Doe");
        group_name.put("F2", "John Doe");
        group_name.put("F3", "John Doe");
        group_name.put("F4", "John Doe");
        group_name.put("F5", "John Doe");

        // key -> unique
        // value -> duplicates



    }


}
