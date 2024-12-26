package _HomeWorks;

import com.sun.jdi.Value;

import java.util.*;

public class _HM_14_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = 0, wordCount = 0, charCount = 0; // создаем счетчик для строк, слов и символов
        String longgestWord = " " ; //переменная для хранения самого длинного слова
        Map<String, Integer> wordFrequence = new HashMap<>(); // создаем место для хранения каждого слова

        System.out.println("Введите текс (введите 'STOP' для заверщения): ");

        //создаем бесконечный цикл для чтение строк из консоли, пока не введут STOP
        while (true) {
            String line = scanner.nextLine(); //читаем введенную строку от пользователя
            if (line.equalsIgnoreCase("STOP")) break;//остановка ввода, если введено слово STOP

            lineCount++; //увеличиваем число строк
            charCount += line.length(); // увеличиваем счетсик символов

            // Разделение строки на слова и их подсчет
            for (String word : line.split("\\s+")) { //разделяем строку на слова по пробелам
                word = word.toLowerCase(); // Приводим слово к нижнему регистру для учета регистра

                // делаем проверку на самое длинное слово
                if (word.length() > longgestWord.length()) longgestWord = word;

                //Добавляем слово в карту или увеличиваем его количество
                wordFrequence.put(word, wordFrequence.getOrDefault(word, 0) + 1);
                wordCount++; //Увеличиваем общий счетчик слов
            }

        }
        // сортируем слова и вывод частоты слов
        System.out.println("\nОбщее количество строк: " + lineCount);
        System.out.println("Общее количество слов: " + wordCount);
        System.out.println("Общее количество символов: " + charCount);
        System.out.println("Самое длинное слово: " + longgestWord);

        System.out.println("Частота слов: ");


        Map<String, Integer> wordFrequency = new HashMap<>();
        // Используем поток для сортировки записей карты по значению в убывающем порядке
        Map<String, Integer> sortedWordFrequency = new LinkedHashMap<>();
        wordFrequency.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) // Сортируем по значению в убывающем порядке
                .forEach(entry -> sortedWordFrequency.put(entry.getKey(), entry.getValue())); // Добавляем в отсортированную карту

        // Используем итератор для вывода отсортированной карты
        Iterator<Map.Entry<String, Integer>> iterator = sortedWordFrequency.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue()); // Выводим слово и его частоту
        }
    }
}
