package _15_OOP.constructor;

import java.util.ArrayList;
import java.util.Iterator;

public class TikTok {

    public ArrayList<Account> accounts;
    public String photo;
    public ArrayList<String> stories;

    public TikTok(ArrayList<Account> accounts, String photo, ArrayList<String> stories) {
        this.accounts = accounts;
        this.photo = photo;
        this.stories = stories;
    }

    public String showAccounts(){

//        Iterator<Account> itr = accounts.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        return


        ArrayList<String> accountList = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++){
            accountList.add(accounts.get(i).toString());
        }

        String result = "";
        for (String element : accountList){
            result += element + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "account: \n" +  showAccounts() +
                "\nphoto='" + photo + '\'' +
                ", stories=" + stories +
                "}\n";
    }
}
// this -> link with field & methods in current class (ссылка на поля и методы в текучем классе)