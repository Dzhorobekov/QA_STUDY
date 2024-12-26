package _06_switch_;

import DataTypes.Casting1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int season = scanner.nextInt();
//        if (season == 1){
//            System.out.println("Winter");
//        } else if (season == 2){
//            System.out.println("Spring");
//        }else if (season == 3){
//            System.out.println("Summer");
//        }else if (season == 4){
//            System.out.println("Fall");
//        }else {
//            System.out.println("Does not exist");
//        }


//         int season = scanner.nextInt();
//
//        switch (season){
//            case 1 :
//                System.out.println("Winter");
//                break;
//            case 2:
//                System.out.println("Spring");
//                break;
//            case 3:
//                System.out.println("Summer");
//                break;
//            case 4:
//                System.out.println("Fall");
//                break;
//            default: //дефолт начначает что то по умолчанию, может стоять и в начале и в конце кода
//                System.out.println("Invalid number");
//        }

//        String month = scanner.nextLine();
//
//        switch (month){
//            case "January":
//            case "February":
//            case "March":
//                System.out.println("1-st quarter");
//                break;
//            case "April":
//            case "May":
//            case "June":
//                System.out.println("2-quarter");
//                break;
//            case "July":
//            case "August":
//            case "September":
//                System.out.println("3-quarter");
//                break;
//            case "October":
//            case "November":
//            case "December":
//                System.out.println("4-quarter");
//                break;
//            default:
//                System.out.println("Does not exist");





//        String extend = scanner.nextLine();
//        String myExtend;
//
//        switch (extend){
//            case "java":
//                myExtend = "java file";
//                break;
//            case "mp4":
//                myExtend = "Video";
//                break;
//            case "xls":
//                myExtend = "excel file";
//                break;
//            default:
//                myExtend = "ERROR";
//
//        }
//        System.out.println(myExtend);// video


        int num = scanner.nextInt();
        System.out.println("Please enter number from 1 to 12");
        if (num % 2 == 0){
            switch (1){
                case 1:
                    System.out.println("Fish");
                    break;
                case 2:
                    System.out.println("Lion");
                    break;
                default:
                    System.out.println("Chunga changa");
            }
        }

    }
}
