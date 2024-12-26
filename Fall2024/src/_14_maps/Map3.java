package _14_maps;

import java.sql.Struct;
import java.util.*;

public class Map3 {
    public static void main(String[] args) {

        Integer nums[] = {78, 93, 59};
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Green");
        list1.add("Yellow");

        Map<Integer, String> map1 = new LinkedHashMap<>();

        if (nums.length == list1.size()) {
            for (int i = 0; i < 3; i++) {
                map1.put(nums[i], list1.get(i));
            }
        }
        System.out.println(map1);

        TreeMap<Integer, String> map2 = new TreeMap<>(map1);
        map2.put(88, "Red");
        System.out.println(map2);
        System.out.println(map2.entrySet());

        System.out.println(map2.keySet());
        System.out.println(map2.values());
        System.out.println(map2.containsKey(88));
        System.out.println(map2.containsValue("Red"));

        for (int i = 0; i < map2.size(); i++) {
            System.out.println(map2.keySet());

            for (int element : map2.keySet()) {
                System.out.println("KEY" + element + " | VALUE: " + map2.get(element));
            }
        }
        for (Map.Entry<Integer, String> elements : map2.entrySet()) {
            System.out.println(elements.getKey() + " --> " + elements.getValue());
        }

        for (String elem : map2.values()) {
            System.out.println(elem);
        }
        Iterator<Map.Entry<Integer, String>> itr = map2.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            if (entry.getValue().equals("Yellow")) {
                itr.remove();
            }

        }
        System.out.println(map2);


        Map<String, String> cars = new LinkedHashMap<>();
        cars.put("Mercedes", "GWagon");
        cars.put("Lexus", "ES");
        cars.put("Subaru", "OutBack");

        List<String> keys = new ArrayList<>(cars.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            if (cars.get(key).equals("ES")) {
                cars.remove(key);
            }
        }

        System.out.println(cars);

    }
}