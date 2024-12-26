package _HomeWorks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class taskmanager {

    public enum Category {
        /* "enum" специальн тип данных который позволяет создать список фиксированных значений
        здесь это задачи WORK, PERSONAL, STUDY
         */
        WORK, PERSONAL, STUDY;

        @Override
        public String toString() {
            /* toString(): Переопределение метода, чтобы возвращать строковое представление
            каждой категории. Например вместо WORK будет отображаться "Работа"
             */
            switch (this) {
                case WORK:
                    return "Работа";
                case PERSONAL:
                    return "Личное";
                case STUDY:
                    return "Учёба";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }
    public enum Priority {
        HIGH, MEDIUM, LOW;

        @Override
        public String toString() {
            switch (this) {
                case HIGH: return "Высокий";
                case MEDIUM: return "Средний";
                case LOW: return "Низкий";
                default: throw new IllegalArgumentException();
            }
        }
    }

    public enum Status {
        COMPLETED, NOT_COMPLETED;

        @Override
        public String toString() {
            switch (this) {
                case COMPLETED: return "Выполнено";
                case NOT_COMPLETED: return "Не выполнено";
                default: throw new IllegalArgumentException();
            }
        }
    }

    public static class Task {
        String name;
        Category category;
        Priority priority;
        Status status;

        public Task(String name, Category category, Priority priority, Status status) {
            this.name = name;
            this.category = category;
            this.priority = priority;
            this.status = status;
            // конструктор TASK позволяет создавать объект задачи, задавая все его свойства
        }
    }

    private static List<Task> tasks = new ArrayList<>(); // Список всех задач
    private static List<String> history = new ArrayList<>(); // Список изменений(например, какие задачи добавлены или удалены)
    private static final int limit = 3; //Максимальное количество задач

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Меню ===");
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
                    findTaskByKeyword(scanner);
                    break;
                case 5:
                    filterTasksByPriority(scanner);
                    break;
                case 6:
                    deleteTask(scanner);
                    break;
                case 7:
                    changeTaskStatus(scanner);
                    break;
                case 8:
                    editTask(scanner);
                    break;
                case 9:
                    viewHistory();
                    break;
                case 10:
                    System.out.println("Сохранение задач и истории завершено.");
                    return;
                default:
                    System.out.println("Некорректный ввод.");
            }
        }

    }
    // Проверяем, достигнут ли лимит задач. Если да, задача н доьавляется
    private static void addTask(Scanner scanner) {
        if (tasks.size() >= limit) {
            System.out.println("Достигнут лимит задач.");
            return;
        }

        System.out.print("Введите название задачи: ");
        String name = scanner.nextLine();

        System.out.println("Выберите категорию задачи:");
        System.out.println("1. Работа");
        System.out.println("2. Личное");
        System.out.println("3. Учёба");
        System.out.print("Ваш выбор: ");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine();
        Category category = getCategoryByChoice(categoryChoice);
        //Пользователь выбирает категорию. Ввод преобразуется в соответствующее значение "Category"
        // c помощью метода "getCategoryByChoice"

        System.out.println("Выберите приоритет задачи:");
        System.out.println("1. Высокий");
        System.out.println("2. Средний");
        System.out.println("3. Низкий");
        System.out.print("Ваш выбор: ");
        int priorityChoice = scanner.nextInt();
        scanner.nextLine();
        Priority priority = getPriorityByChoice(priorityChoice);

        System.out.println("Выберите статус задачи:");
        System.out.println("1. Выполнено");
        System.out.println("2. Не выполнено");
        System.out.print("Ваш выбор: ");
        int statusChoice = scanner.nextInt();
        scanner.nextLine();
        Status status = getStatusByChoice(statusChoice);

        Task task = new Task(name, category, priority, status);
        tasks.add(task);
        history.add("Задача добавлена: " + task.name);
        System.out.println("Задача добавлена!");
    }

    private static Category getCategoryByChoice(int choice) {
        switch (choice) {
            case 1: return Category.WORK;
            case 2: return Category.PERSONAL;
            case 3: return Category.STUDY;
            default: throw new IllegalArgumentException("Неверный выбор категории.");
        }
    }
    private static Priority getPriorityByChoice(int choice) {
        switch (choice) {
            case 1: return Priority.HIGH;
            case 2: return Priority.MEDIUM;
            case 3: return Priority.LOW;
            default: throw new IllegalArgumentException("Неверный выбор приоритета.");
        }
    }

    private static Status getStatusByChoice(int choice) {
        switch (choice) {
            case 1: return Status.COMPLETED;
            case 2: return Status.NOT_COMPLETED;
            default: throw new IllegalArgumentException("Неверный выбор статуса.");
        }
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач.");
        } else {
            System.out.println("=== Список задач ===");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println(i + ": " + task.name + ", категория: " + task.category + ", приоритет: " + task.priority + ", статус: " + task.status);
            }
        }
    }

    private static void viewTasksByCategory(Scanner scanner) {
        System.out.println("Выберите категорию для фильтрации:");
        System.out.println("1. Работа");
        System.out.println("2. Личное");
        System.out.println("3. Учёба");
        System.out.print("Ваш выбор: ");
        int categoryChoice = scanner.nextInt();
        scanner.nextLine();
        Category category = getCategoryByChoice(categoryChoice);

        System.out.println("Задачи в категории \"" + category + "\":");
        for (Task task : tasks) {
            if (task.category == category) {
                System.out.println(task.name + ", приоритет: " + task.priority + ", статус: " + task.status);
            }
        }
    }

    private static void findTaskByKeyword(Scanner scanner) {
        System.out.print("Введите ключевое слово для поиска: ");
        String keyword = scanner.nextLine();
        boolean found = false;
        for (Task task : tasks) {
            if (task.name.contains(keyword)) {
                System.out.println(task.name + ", категория: " + task.category + ", приоритет: " + task.priority + ", статус: " + task.status);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Задачи не найдены.");
        }
    }

    private static void filterTasksByPriority(Scanner scanner) {
        System.out.println("Выберите приоритет для фильтрации:");
        System.out.println("1. Высокий");
        System.out.println("2. Средний");
        System.out.println("3. Низкий");
        System.out.print("Ваш выбор: ");
        int priorityChoice = scanner.nextInt();
        scanner.nextLine();
        Priority priority = getPriorityByChoice(priorityChoice);

        System.out.println("Задачи с приоритетом \"" + priority + "\":");
        for (Task task : tasks) {
            if (task.priority == priority) {
                System.out.println(task.name + ", категория: " + task.category + ", статус: " + task.status);
            }
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.print("Введите индекс задачи для удаления: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.remove(index);
            history.add("Задача \"" + task.name + "\" была удалена.");
            System.out.println("Задача удалена!");
        } else {
            System.out.println("Задача с таким индексом не существует.");
        }
    }

    private static void changeTaskStatus(Scanner scanner) {
        System.out.print("Введите индекс задачи для изменения статуса: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            System.out.println("Текущий статус задачи: " + task.status);
            System.out.println("Выберите новый статус:");
            System.out.println("1. Выполнено");
            System.out.println("2. Не выполнено");
            System.out.print("Ваш выбор: ");
            int statusChoice = scanner.nextInt();
            scanner.nextLine();
            task.status = getStatusByChoice(statusChoice);
            history.add("Статус задачи \"" + task.name + "\" изменён на " + task.status + ".");
            System.out.println("Статус задачи изменён!");
        } else {
            System.out.println("Задача с таким индексом не существует.");
        }
    }

    private static void editTask(Scanner scanner) {
        System.out.print("Введите индекс задачи для редактирования: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            System.out.println("Редактирование задачи: " + task.name);
            System.out.print("Введите новое название задачи (оставьте пустым для отмены): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) task.name = name;

            System.out.println("Выберите новую категорию:");
            System.out.println("1. Работа");
            System.out.println("2. Личное");
            System.out.println("3. Учёба");
            System.out.print("Ваш выбор: ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine();
            task.category = getCategoryByChoice(categoryChoice);

            System.out.println("Выберите новый приоритет:");
            System.out.println("1. Высокий");
            System.out.println("2. Средний");
            System.out.println("3. Низкий");
            System.out.print("Ваш выбор: ");
            int priorityChoice = scanner.nextInt();
            scanner.nextLine();
            task.priority = getPriorityByChoice(priorityChoice);

            history.add("Задача \"" + task.name + "\" была изменена.");
            System.out.println("Задача отредактирована!");
        } else {
            System.out.println("Задача с таким индексом не существует.");
        }
    }

    private static void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("История изменений пуста.");
        } else {
            System.out.println("=== История изменений ===");
            for (String entry : history) {
                System.out.println(entry);
            }
        }
    }
}
