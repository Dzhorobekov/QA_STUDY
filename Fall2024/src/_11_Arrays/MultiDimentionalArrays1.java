package _11_Arrays;

import java.util.Arrays;

public class MultiDimentionalArrays1 {
    public static void main(String[] args) {

        int num1 [] = {12, 34, 46, 89};

        //                  {  0   }    {  1   }    {   2   }
        int num2 [] [] = { {10, 20}, {77, 88}, {100, 200}};
//                           0   1     0   1     0     1

        System.out.println(num2 [0][1]);
        System.out.println(num2[1][1]);
        System.out.println(num2[2][0]);


        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.deepToString(num2));
        System.out.println(Arrays.toString(num2[1]));
        System.out.println(Arrays.toString(num2[2]));
        Arrays.sort(num2);
        System.out.println(Arrays.deepToString(num2));
    }
}
