package _HomeWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagment {

    // Make Task class static
    static class Task {
        String title;
        String category;
        String priority;
        String status;

        public Task(String title, String category, String priority, String status) {
            this.title = title;
            this.category = category;
            this.priority = priority;
            this.status = status;
        }

        @Override
        public String toString() {
            return "[" + title + ", категория: " + category + ", приоритет: " + priority + ", статус: " + status + "]";
        }
    }

    static final int MAX_TASKS = 3;
    static List<Task> tasks = new ArrayList<>();
    static List<String> history = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Просмотреть все задачи");
            System.out.println("3. Просмотреть задачи по категории");
            System.out.println("4. Найти задачу по ключевым словам");
            System.out.println("5. Фильтровать задачи по приоритету");
            System.out.println("6. Удалить задачу");
            System.out.println("7. Изменить статус задачи");
            System.out.println("8. Редактировать задачу");
            System.out.println("9. Просмотреть историю изменений");
            System.out.println("10. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    viewTasksByCategory(scanner);
                    break;
                case 4:
                    searchTasks(scanner);
                    break;
                case 5:
                    filterTasksByPriority(scanner);
                    break;
                case 6:
                    deleteTasks(scanner);
                    break;
                case 7:
                    changeTasksStatus(scanner);
                    break;
                case 8:
                    editTask(scanner);
                    break;
                case 9:
                    viewHistory(scanner);
                    break;
                case 10: {
                    saveTasks(scanner);
                    System.out.println("Сохранение задач и истории завершено. Программа завершена.");
                    return;
                }
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        if (tasks.size() >= MAX_TASKS) {
            System.out.println("Достигнуто максимальное количесвтво задач (" + MAX_TASKS + ").");
            return;
        }
        // Получаем данные о задаче от пользователя
        System.out.print("Введите название задачи: ");
        String title = scanner.nextLine();
        System.out.print("Введите категорию задачи (Работа, Личное, Учёба): ");
        String category = scanner.nextLine();
        System.out.print("Введите приоритет (высокий, средний, низкий): ");
        String priority = scanner.nextLine();
        System.out.print("Статус задачи (выполнено/не выполнено): ");
        String status = scanner.nextLine();

        // Добавляем задачу в список
        tasks.add(new Task(title, category, priority, status));
        // Записываем действие в историю
        history.add("Добавлена задача: " + title);
        System.out.println("Задача добавлена!");
    }

    // 2 Просмотреть все задачи
    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("=== Список задач ===");
            // Выводим все задачи с их индексами
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    static void viewTasksByCategory(Scanner scanner) {
        System.out.print("Введите категорию (Работа, Личное, Учёба): ");
        String category = scanner.nextLine();
        tasks.stream().filter(task -> task.category.equalsIgnoreCase(category)).forEach(System.out::println);
    }

    // 4 Найти задачу по ключевым словам
    static void searchTasks(Scanner scanner) {
        System.out.println("Введите ключевое слово: ");
        String keyword = scanner.nextLine();
        tasks.stream()
                .filter(task -> task.title.contains(keyword))
                .forEach(System.out::println);
    }

    static void filterTasksByPriority(Scanner scanner) {
        System.out.println("Введите приоритет (высокий, средний, низкий): ");
        String priority = scanner.nextLine();
        tasks.stream()
                .filter(task -> task.priority.equalsIgnoreCase(priority))
                .forEach(System.out::println);
    }

    private static void deleteTasks(Scanner scanner) {
        return;
    }

    private static void changeTasksStatus(Scanner scanner) {
        return;
    }

    private static void editTask(Scanner scanner) {
        return;
    }

    private static void viewHistory(Scanner scanner) {
        return;
    }

    private static void saveTasks(Scanner scanner) {
        return;
    }
}
