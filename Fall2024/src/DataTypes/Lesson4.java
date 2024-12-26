package DataTypes;

public class Lesson4 {
    public static void main(String[] args) {
        // special characters
        // \t
        int nu = 90;
        String phrase1 = "\t \t My name is Bond? James Bond!";
        // не примитивный тип данных пишется с верхнего регистра и не подсвечивается!
        System.out.println(phrase1);

    // \b
        String phrase2 = "My name is Bond,\b J\bames Bond!";
        System.out.println(phrase2);

        // \n
        String phrase3 = "My name is Bond,\n James Bond!";
        System.out.println(phrase3);

        // \r
        String phrase4 = "My name\r is Bond,James Bond!";
        System.out.println(phrase4);

        // \f(такой f обычно в работе не используется)
        String phrase5 = "My name is Bo\fnd, James Bond!";
        System.out.println(phrase5);

        // \
        String phrase6 = "My name is Bond, \\James Bond!\\";
        System.out.println(phrase6);

        // \"
        String phrase7 = "My name is \"Bond\", James Bond!";
        System.out.println(phrase7);

        // \'
        String phrase8 = "My name is \'Bond\', James Bond!";
        System.out.println(phrase8);




    }
}
