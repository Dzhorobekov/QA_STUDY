package _HomeWorks;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _HM_12_11 {
    static class StudentRating{
        static Map<String, ArrayList<Integer>> students = new HashMap<>(); // создаем Мар для хранения студентов и их оценок
        static Scanner scanner = new Scanner(System.in); // Создаемсканнер один раз для ввода данных

        public static void main(String[] args) {
            addStudent("Alice", 90);
            addStudent("Bob", 85);
            addStudent("Kate", 77);
            addStudent("Elizabet", 35);
            addStudent("John", 0);
            addStudent("Tony", 100);
            printStudents();
            System.out.println("Best student: " + findBestStudent()); // печатаем лучшего студента

        }

        public static void addStudent(String name, int grade){ //
        students.putIfAbsent(name, new ArrayList<>()); // если студента еще нет, создаем новый список его оценки
            students.get(name).add(grade); // Добавляем оценку в список студента
        }
        public static double getAverage(String name){ // Метод для расчета среднего балла студента
            ArrayList<Integer> grades = students.get(name); // Получаем список оценок студента
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0); // считаем средний балл и возвращаем его
        }

        public static String findBestStudent(){ // Метод для нахождения лучшего студента по среднему баллу
            return students.entrySet().stream()// проходим по каждой записи в Мар
                    .max((a, b) -> Double.compare(getAverage(a.getKey()), getAverage(b.getKey()))) // Находим студента с наивысшим средним
                    .map(Map.Entry::getKey).orElse("No students"); // Возвращаем имя лучшего студента

        }

        public static void removeStudent(String name){ //метод для удаления студента из системы
            students.remove(name); //удаляем студента по его имени
        }
        public static void printStudents(){ // метод для печати для всех студентов с их средним баллом
            students.forEach((name, grades) ->
                    System.out.println(name + " - Average Grade: " + getAverage(name))); //печатаем имя и средний балл


        }
    }


}
