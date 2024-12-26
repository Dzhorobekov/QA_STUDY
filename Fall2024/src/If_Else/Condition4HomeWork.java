package If_Else;

import java.util.Scanner;

public class Condition4HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = "Джоробеков Адилет Доолотович";
        String F1 = "Психология, литература";
        System.out.println("укажите ваше ФИО: ");
        String FullName = scan.nextLine();
        String L1 = "Общая психология";
        String L2 = "Психогенетика";
        String L3 = "Теория литературы";


        if (FullName.equals(fullName)) {
            System.out.println("На каком вы курсе: ");

            int C = 3;
            String userC = scan.nextLine();
            System.out.println("Какой у вас факультет: ");

            String userFac = scan.nextLine();
            if (userFac.equals(F1)) {
                System.out.println("выберите три предмета: ");

                String userL1 = scan.nextLine();
                if (userL1.equals(L1)) {
                    String userL2 = scan.nextLine();
                    if (userL2.equals(L2)) {
                        String userL3 = scan.nextLine();
                        if (userL3.equals(L3)) {
                            System.out.println("Отличный выбор!");

                        }

                        }
                    }
                }
            }
        }
    }
