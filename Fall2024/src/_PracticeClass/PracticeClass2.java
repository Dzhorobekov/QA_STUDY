package _PracticeClass;

import java.util.HashSet;

public class PracticeClass2 {
    public static void main(String[] args) {
//        int[] num = {1,28,34,45,34,6,79,82,28,1};
//        for (int i = 0; i < num.length; i++){
//            for (int j = 0; j < num.length; j++){
//                if (num[i] == num[j]){
//                    System.out.println(num[i] + " ");
//                }
//                break;
//            }
//        }
        int[] num = {-12, 89, 5, -3, 77};
        int nul1 = 0;
        int nul2 = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] < 0){
                nul1++;
            } else {
                nul2++;
            }
        }
        System.out.println("Отридцательное цисло:" + nul1);
        System.out.println("Положительное цисло:" + nul2);


    }
}
