package _11_Arrays;

public class ArraysHomeWork2 {
    public static void main(String[] args) {
        int [] steps = {8000, 9000, 7000, 6000, 8500, 7300, 5250};

        int totalSteps = 0; // переменная для хранения общего количества шагов

        for (int step : steps){ // создаем цикл для проверки всех значения масива
            totalSteps += step; // добавляем каждый элемент к общей сумме
        }
        System.out.println("Total number of steps --> " + totalSteps);

        double averageSteps = (double) totalSteps / steps.length;
        System.out.println("Average number of steps per day --> " + averageSteps);

        int maxSteps = steps[0];
        int minSteps = steps[0];
        int maxDay = 0;
        int minDay = 0;

        for (int i = 1; i < steps.length; i++){
            if (steps[i] > maxSteps){
                maxSteps = steps[i];
                maxDay = i;
            }
            if (steps[i] < minSteps){
                minSteps = steps[i];
                minDay = i;
            }
        }
        System.out.println("Maximum number of steps --> " + maxSteps + " per day " + (maxDay + 1));
        System.out.println("Minimum number of steps --> " + minSteps + " per day " + (minDay + 1));


    }
}

