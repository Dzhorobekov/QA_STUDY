package _PracticeClass;

import _06_switch_.Draft;

import java.util.ArrayList;
import java.util.Scanner;

public class _PracticeClass3 {
    public void addProduct(ArrayList<String> products){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add product");
        String addProd = scan.nextLine(); // milk
        String result = addProd.trim().substring(0,1).toUpperCase().concat(addProd.trim().substring(1));
        products.add(result);
        System.out.println(result + " Product has been added");
    }

    public void deleteProduct(ArrayList<String> products){
        System.out.println("Please choose the product (" + products + ")");
        Scanner scan = new Scanner(System.in);
        String delProd = scan.nextLine(); // bread
        if (products.contains(delProd)){
            products.remove(delProd.toLowerCase());
        }
        else {
            System.out.println("This product does not exist in this list");
        }


    }

    public ArrayList<String> showProducts(ArrayList<String> products){
        Scanner scan = new Scanner(System.in);
        if (products.isEmpty()){
            System.out.println("Empty list of products");
        }
        else {
            System.out.println("list of products: " + products);
        }
        return products;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<>();
        Draft obj = new Draft();
        for (int i = 0; i < 2;) {
            System.out.println("Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти");
            int choise = scan.nextInt();
            if (choise == 1){
                obj.addProduct(products);
            }
            else if (choise == 2){
                obj.deleteProduct (products);
            } else if (choise == 3){
                obj.showProducts (products);
            } else if (choise == 4) {
                System.out.println("Main menu");
                break;
            }
        }
    }
}

    /*


Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти
1 Добавить товар

Группа товаров
1. dada, lemonade, tea
2. сахар, мука, гречка
2
сахар, гречка

Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти
 (1) Добавить товар
 Группа товаров
1. dada, lemonade, tea
2. сахар, мука, гречка
 2
 мука

 Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти
3
сахар, гречка, мука

Введите название товара: Молоко
Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти
1
Введите название товара: Хлеб
Выберите действие: (1) Добавить товар (2) Удалить товар (3) Показать список (4) Выйти
3
Список покупок: [Молоко, Хлеб]




 */


