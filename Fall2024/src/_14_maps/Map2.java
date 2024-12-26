package _14_maps;

import java.util.*;

public class Map2 {
    public static void main(String[] args) {

        Map<String, String> fullname = new LinkedHashMap<>();
        fullname.put("Aidana", "Adiletovna");
        fullname.put("Aigerim", "Kasymova");
        fullname.put("Nurlan", "Dairov");
        fullname.put("Turan", "Abdykadyrov");

        System.out.println(fullname);
        System.out.println(fullname.keySet());
        System.out.println(fullname.values());

        Map<String, String> fullName2 = new HashMap<>();
        fullName2.put("Maksim", "Iurchenko");
        fullName2.putAll(fullname);
        System.out.println(fullName2);
        System.out.println(fullName2.get("Nurlan"));
        System.out.println(fullName2);
        fullName2.replace("Nurlan", "Beisheev");
        System.out.println(fullName2);
        fullName2.replace("Aigerim", "Kasymova", "Sardarbekova");
        fullName2.replace("Turan", "Baialiev", "Omorbekov");
        System.out.println(fullName2);


        Map<Integer, Character> map1 = new TreeMap<>();
        map1.put(12, '*');
        map1.put(68, '$');
        map1.put(18, '+');
        map1.put(34, '!');
        map1.put(9, '%');
        System.out.println(map1);
        map1.replace(12, '&');
        map1.replace(43, '!', 'W');
        System.out.println(map1);

        Map<Integer, String> map2 = new TreeMap<>(); // Создаем Map с Integer ключами и String значениями
        map2.put(1, "M");
        map2.put(6, "6");
        map2.put(3, "L");

        map2.replaceAll((k, v) -> "Key: " + k + ", Value: " + v); // Форматируем каждый элемент в строку

        System.out.println(map2); // Выводим результат


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{12,89,34}));
        System.out.println(list1);
//        for (int k = 0; k < list1.size(); k++){
//            if (list1.get(k) <50){
//                list1.remove(k);
//            }
//        }
        System.out.println(list1.removeIf(i -> i > 50));
        System.out.println(list1);

        Map<String, String> map3 = new LinkedHashMap<>();
        map3.put("Bishkek", "KG");
        map3.put("Ankara", "Turkiye");
        map3.put("Tashkent", "Uzbekistan");
        System.out.println(map3);
        map3.replaceAll((key,value) ->  value.toUpperCase());

        map3.replaceAll((city, country) -> String.valueOf(  city.charAt(0) )
                .toUpperCase() + city.substring(1) + " " + country.toUpperCase());

        map3.remove("Ankara", "Ankara TURKIYE");
        System.out.println(map3);



    }
}
