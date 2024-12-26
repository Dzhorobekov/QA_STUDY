package _10_loops.for_loop;

public class AddSpaceHomeWork {
    public static void main(String[] args) {
        String input = "CatchMeIfYouCan";

        String result = addSpaces(input);

        System.out.println(result);
    }

    public static String addSpaces(String str) {

        StringBuilder newStr = new StringBuilder();

        int index = 0;
        // Используем цикл while для перебора всех символов строки
        while (index < str.length()) {
            char currentChar = str.charAt(index);
            // Если символ заглавный и это не первый символ, добавляем пробел перед ним
            if (Character.isUpperCase(currentChar) && index != 0) {
                newStr.append(" "); // Добавляем пробел
            }
            newStr.append(Character.toLowerCase(currentChar));
            index++;
        }
        return newStr.toString();

    }
}
