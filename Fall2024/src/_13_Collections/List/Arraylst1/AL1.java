package _13_Collections.List.Arraylst1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class AL1 {
    public static void main(String[] args) {
        int nums [] = {12, 45, 79};

        //non-generic
        ArrayList list = new ArrayList();
        list.add(312);
        list.add("K. Tynystanov");
        list.add('U');
        list.add(12.68f);
        System.out.println(list); // [312, K. Tynystanov, U, 12.68]
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(1).hashCode()); //-1984459038
        //                        312
        System.out.println(list.get(0).getClass().getName().hashCode()); //-2056817302

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("______________");

// generic
       ArrayList<String> cars = new ArrayList<>();
       cars.add("Mersedec");
        cars.add("BMW");
        cars.add("Lexus");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("_____________");


        for (String car : cars){
            System.out.println(car);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(90);
        numbers.add(89);
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        // Arralist -> any data type, any size
        // 1. Generic<DataType> --> "white", "black", "Green"...
        // 2. non-Generic       --> "Hi", 87, true, 'P'...

        ArrayList list2 = new ArrayList<>();

        list2.add("hi");
        list2.add(87);
        list2.add(true);
        list2.add('P');
        System.out.println(list2); //[hi, 87, true, P]

        for (Object element : list2){
            System.out.println(element);

        }

        Object number = 45;
        Object name = "Kate";
        Object symbol = 'Y';
        Object answer = false;









    }

}
