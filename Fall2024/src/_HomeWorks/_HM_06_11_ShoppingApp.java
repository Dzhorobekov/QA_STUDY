package _HomeWorks;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class _HM_06_11_ShoppingApp {
    //Создаем список для хранения списка покупок и использовать в дальнейшем
    static ArrayList<String> shoppingList = new ArrayList<>();
    //Создаем сканнер тут, чобы потом каждый раз не создавать его в коде
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //создаем основной метод мейн, далее внутри него создадим бесконечный цикл
        while (true) {
            System.out.println("Select action: (1) add product, (2) remove product, (3) show product, (4) exit)");
            int choice = scanner.nextInt(); //даем возможность выбрать пользователю
            scanner.nextLine();

            if (choice == 1) { // Если пользователь выбрал "Добавить товар"
                addItem(); // Вызов метода для добавления товара
            } else if (choice == 2) {
                removeItem(); // Если пользователь выбрал "Удалить товар"
            } else if (choice == 3) {// Если пользователь выбрал "Показать список"
                showList(); // Вызов метода для отображения списка покупок
            } else if (choice == 4) {// Если пользователь выбрал "Выйти"
                System.out.println("Выход из программы.");
                break; // Прерываем цикл и завершаем программу
            } else {// Если введено недопустимое значение
                System.out.println("Неправильный выбор. Попробуйте снова");
            }
        }
    }

    private static void showList() {
    }

    public static void addItem() {
        System.out.println("Выберите список товаров: ");
        System.out.println("1. dada, lemonade, tea");
        System.out.println("2. сахар, мука, гречка");

        int groupChoice = scanner.nextInt();// Получаем выбор группы
        scanner.nextLine();  // Читаем символ новой строки

        if (groupChoice == 1) {// Если выбрана группа 1
            System.out.println("Выберите товар: dada, lemonade, tea");
            String item = scanner.nextLine(); // Получаем название товара от пользователя
            if (item.equalsIgnoreCase("сахар") || item.equalsIgnoreCase("мука") || item.equalsIgnoreCase("гречка")) {
                shoppingList.add(item);  // Добавляем товар в список покупок
                System.out.println("Товар добавлен.");
            } else {
                System.out.println("Товар не найден в этой группе.");
            }
        }
    }

    public static void removeItem() {
        System.out.println("Введите название товара для удаления: ");
        String item = scanner.nextLine();  // Получаем название товара от пользователя
        if (shoppingList.remove(item)) {// Удаляем товар, если он есть в списке
            System.out.println("Товар удален.");
        } else {
            System.out.println("Товар не найден в списке.");
        }
    }

    public static void showItem() {
        if (shoppingList.isEmpty()) {// Проверяем, пустой ли список покупок
            System.out.println("Список пуст.");
        } else {
            System.out.println("Список покупок: " + shoppingList);// Выводим список покупок
        }
    }
}
