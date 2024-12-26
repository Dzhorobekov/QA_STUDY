package _15_OOP.encupsulation;

public class Contact {


    public String name;
    public String phoneNumber;
    private String secondPhoneNumber;

    public Contact(String name, String phoneNumber, String secondPhoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getSecondPhoneNumber(){
        return secondPhoneNumber;
    }
    public void setSecondPhoneNumber(String phoneNumber2){
        this.secondPhoneNumber = phoneNumber2;

    }

    public String showContactInfo(){
        return "____________________________________" + "\n" +
                "Contact - name : " + name + "\'\n" +
                "phoneNumber : " + phoneNumber + "\'\n" +
                "SecondPhoneNumber : " + secondPhoneNumber + "\'\n" +
                "__________________________________________";
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
