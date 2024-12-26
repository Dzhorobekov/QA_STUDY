package _15_OOP.constructor;

import java.util.ArrayList;

public class TikTokMain {
    public static void main(String[] args) {

        char [] saidasPassword = {'B','i','s','h','3','1','2',};
        char [] aiperisPassword = {'H','e','l','l','o','W','!',};
        char [] timursPassword = {'q','w','e','r','t','y'};

        Account SaidasAccount = new Account("Saida", "SaidaPantera", saidasPassword );
        Account aiperisAccount = new Account("Aiperi", "angel007", saidasPassword );
        Account timursAccount = new Account("Timur", "simpoBoyNoNeTvoi", saidasPassword );

        ArrayList<Account> tikTokAccounts = new ArrayList<>();
        tikTokAccounts.add(SaidasAccount);
        tikTokAccounts.add(aiperisAccount);
        tikTokAccounts.add(timursAccount);


        ArrayList<String> listOfSories = new ArrayList<>();
        listOfSories.add("DastansStories");
        listOfSories.add("NasyiktStories");
        listOfSories.add("DauletsStories");
        listOfSories.add("NuriasStories");

        TikTok media = new TikTok(tikTokAccounts, "With sunglasses", listOfSories );

        System.out.println(SaidasAccount);
        System.out.println(media);
    }
}
