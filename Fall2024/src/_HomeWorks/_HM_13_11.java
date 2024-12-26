package _HomeWorks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class _HM_13_11 {
    public static void main(String[] args) {
        int lawFacultyGroupSize = 25; // Определяем размер группы на юридическом факультете
        int economicsFacultyGroupSize = 30; // Определяем размер группы на экономическом факультете

        ArrayList<String> lawFaculty = new ArrayList<>(); // Создаем список студентов юридического факультета
        ArrayList<String> economicsFaculty = new ArrayList<>(); // Создаем список студентов экономического факультета

        // Заполняем юридический факультет двумя группами по 25 студентов
        for (int i = 1; i <= 2 * lawFacultyGroupSize; i++) {
            lawFaculty.add("LawStudent" + i); // Добавляем каждого студента в список
        }

        // Заполняем экономический факультет одной группой из 30 студентов
        for (int i = 1; i <= economicsFacultyGroupSize; i++) {
            economicsFaculty.add("EcoStudent" + i); // Добавляем каждого студента в список
        }

        // Создаем список кандидатов
        ArrayList<String> candidates = new ArrayList<>();
        candidates.add("Candidate A"); // Добавляем кандидата A
        candidates.add("Candidate B"); // Добавляем кандидата B
        candidates.add("Candidate C"); // Добавляем кандидата C

        // Создаем Map для хранения голосов каждого кандидата
        Map<String, Integer> voteCount = new HashMap<>();
        for (String candidate : candidates) {
            voteCount.put(candidate, 0); // Инициализируем голосование, ставим по 0 голосов для каждого кандидата
        }

        // Симулируем голосование для юридического факультета
        simulateVoting(lawFaculty, candidates, voteCount);

        // Симулируем голосование для экономического факультета
        simulateVoting(economicsFaculty, candidates, voteCount);

        // Определяем победителя на основе максимального количества голосов
        String winner = determineWinner(voteCount);

        // Выводим распределение голосов
        System.out.println("Распределение голосов:");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " голосов"); // Печатаем кандидата и его голоса
        }
        System.out.println("Президентом студенческого совета стал: " + winner); // Объявляем победителя
    }

    // Метод для симуляции голосования
    public static void simulateVoting(ArrayList<String> students, ArrayList<String> candidates, Map<String, Integer> voteCount) {
        Random random = new Random(); // Создаем объект Random для случайного выбора
        for (String student : students) {
            String chosenCandidate = candidates.get(random.nextInt(candidates.size())); // Выбираем случайного кандидата
            voteCount.put(chosenCandidate, voteCount.get(chosenCandidate) + 1); // Увеличиваем счет голосов выбранного кандидата
        }
    }

    // Метод для определения победителя
    public static String determineWinner(Map<String, Integer> voteCount) {
        String winner = ""; // Переменная для хранения имени победителя
        int maxVotes = 0; // Переменная для хранения максимального числа голосов

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) { // Сравниваем голоса каждого кандидата
                maxVotes = entry.getValue(); // Обновляем максимальное количество голосов
                winner = entry.getKey(); // Обновляем имя победителя
            }
        }
        return winner; // Возвращаем имя победителя
    }
}

