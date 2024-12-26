package _13_Collections.List.Arraylst1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Al3 {
    public static void main(String[] args) {


        ArrayList<StringBuffer> list1 = new ArrayList<>();
        list1.add(new StringBuffer("Hello"));
        list1.add(new StringBuffer("Salam"));
        list1.add(new StringBuffer("Privet"));
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1          // ArrayList
                .get(1)                  // StringBuffer
                .toString()             //String
                .charAt(2));           //char

        char result = list1.get(1).toString().charAt(3);

        String color = "Pink";

        ArrayList<Character> latters = new ArrayList<>();
        for (int i = 0; i < color.length(); i++){
            latters.add(color.charAt(i));
            System.out.println(latters);
        }
//        latters.add(color.charAt(0));
//        System.out.println(latters);

        System.out.println("_______________");
        Float numbers [] = new Float[3];
        numbers [0] = 5.3f;
        numbers [1] = 8.9f;
        numbers [2] = 6.1f;
        System.out.println(Arrays.toString(numbers));

//        ArrayList<Float> listOfFloats = new ArrayList<>();
//        for (float number : numbers){
//            listOfFloats.add(number);
//        }
//        System.out.println("ArrayList:" + listOfFloats);

        ArrayList<Float> floatList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("My ArrayList: " + floatList);

//        int nums [] = new int[]{12,34,46};
//        Integer nums2[] = new Integer[]{34,78,90};
//        System.out.println(Arrays.toString(nums));


        Float floatArrays [] =floatList.toArray(new Float[0]);
        System.out.println(Arrays.toString(floatArrays));

        Integer [] num2 = {12,34,45,21};
        System.out.println(Arrays.toString(num2));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(num2));
        Collections.sort(list2);
        System.out.println(list2);


        // immutable    mutable
        //String        StringBuilder/StringBuffer
        //Arrys         ArrayList

        String str = "hello";
        StringBuffer sb1 = new StringBuffer(str);
        String str2 = sb1.toString();

        String str3 = "Baby shark ";  // Исходная строка
        ArrayList<Character> vowels = new ArrayList<>();  // Список для хранения гласных
        ArrayList<Character> vowelChars = new ArrayList<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        // Проходим по каждому символу строки
        for (int i = 0; i < str3.length(); i++) {
            char ch = str3.charAt(i);  // Текущий символ

            // Проверяем, есть ли символ в списке гласных
            if (vowelChars.contains(ch)) {
                vowels.add(ch);  // Если символ - гласная, добавляем его в список
            }
        }

        // Выводим все гласные
        System.out.println("Гласные буквы: " + vowels);

        // Выводим количество гласных
        System.out.println("Количество гласных букв: " + vowels.size());
        



    }
}
