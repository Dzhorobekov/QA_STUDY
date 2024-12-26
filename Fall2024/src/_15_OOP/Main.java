package _15_OOP;

public class Main {
    public static void main(String[] args) {
        // Создаём объект ActorHome
        ActorHome actor = new ActorHome("Leonardo DiCaprio", 1974, true);

        // Добавляем фильмы
        actor.addMovie("Titanic", false, 0); // Не получил Оскар
        actor.addMovie("The Revenant", true, 2016); // Получил Оскар

        // Выводим фильмы, за которые он получил Оскар
        System.out.println(actor.detectOscarMovieAndYear());

        // Выводим все данные актёра
        System.out.println(actor);
    }
}

