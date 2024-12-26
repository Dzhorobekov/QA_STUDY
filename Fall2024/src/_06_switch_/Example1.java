package _06_switch_;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("What kind of internet do you want to use?");
      System.out.println("Options: Mobile o!, Mobile Beeline, Mobile MegaCom, Aknet");

      String userInt = scan.nextLine();
      if (userInt.equals("Mobile o!") || userInt.equals("Mobile Beeline") || userInt.equals("Mobile MegaCom") || userInt.equals("Aknet")) {
        System.out.println("Great! Now select a tariff for" + userInt);

        String tariff = scan.nextLine();
        switch (userInt) {
          case "Mobile o!":
            if (tariff.equals("220 per week") || tariff.equals("800 per month") || tariff.equals("130 per week")) {
              System.out.println("you have chosen a Mobile o! tariff.");
            } else {
              System.out.println("This tariff is not available for Mobile o!");
            }
            break;
          case "Mobile Beeline":
            if (tariff.equals("unlimited 500") || tariff.equals("Comfortable 500") || tariff.equals("Start")) {
              System.out.println("You have chosen a Mobile Beeline tariff.");
            } else {
              System.out.println("This tariff is not available for Mobile Beeline.");
            }
            break;
          case "Mobile MegaCom":
            if (tariff.equals("super profitable") || tariff.equals("for week") || tariff.equals("for four week")) {
              System.out.println("You have chosen a Mobile MegaCom tariff.");
            } else {
              System.out.println("This tariff is not available for Mobile MegaCom");
            }
            break;
          case "Aknet":
            if (tariff.equals("990") || tariff.equals("1200") || tariff.equals("1650")) {
              System.out.println("You have chosen an Internet provider Aknet tariff.");
            } else {
              System.out.println("This tariff is not available for Aknet.");
            }
            break;
          default:
            System.out.println("Sorry, we could not find the provider you selected.");
        }
      }else {
        System.out.println("The selected provider is not available. Please choose from the provided options.");
      }
      }




    }

