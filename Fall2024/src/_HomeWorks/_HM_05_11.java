package _HomeWorks;

import java.util.ArrayList;

public class _HM_05_11 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(12.5);    // Добавляем элемент 12.5
        list.add(63.78);   // Добавляем элемент 63.78
        list.add(34.0);    // Добавляем элемент 34
        list.add(5.0);     // Добавляем элемент 5
        list.add(79.0);    // Добавляем элемент 79
        list.add(21.09);   // Добавляем элемент 21.09

        // находим сумму элементов с индексом 0,1,5
        double sum = list.get(0) + list.get(1) + list.get(5);// сумма элементом под этими индексами
        System.out.println("Сумма ( 12.5 + 63.78 + 21.09) " + " = " + sum);

        // находим произведение элементов под индексами 2,3,4
        double product = list.get(2) * list.get(3) * list.get(4); // произведение 34.0, 5, 79
        System.out.println("Произведение (34.0 * 5.0 * 79.0) " + " = " + product);
    }
}



