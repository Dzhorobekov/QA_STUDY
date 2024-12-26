package _15_OOP.encupsulation;

public class ContactMain {
    public static void main(String[] args) {

        Contact samat = new Contact("Samat", "+996777123456","+996553234567");
        System.out.println(samat);
        System.out.println(samat.showContactInfo());


        samat.phoneNumber = "+996553112233";
        System.out.println(samat.showContactInfo());

        System.out.println(samat.getSecondPhoneNumber());
        samat.setSecondPhoneNumber("+996500444455");
        System.out.println(samat.getSecondPhoneNumber());

        System.out.println(samat.showContactInfo());
    }
}
