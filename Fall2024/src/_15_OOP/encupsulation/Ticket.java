package _15_OOP.encupsulation;

public class Ticket {

    public String HeadLiner;
    public int ticketNumber;
    public String place;
    private String address;
    private boolean funZone;

    public String showPlace(){
        return "Zone : FanZone";
    }

    public String changePlaceInFanZone(){
        if(place == null){
            return funZone + " -> You can change the place";
        }else {
            return funZone + " -> You cannot change the place";
        }
    }

    public Ticket(String headLiner, int ticketNumber, String place, String address, boolean funZone) {
        HeadLiner = headLiner;
        this.ticketNumber = ticketNumber;
        this.place = place;
        this.address = address;
        this.funZone = funZone;

    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "HeadLiner='" + HeadLiner + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", place='" + place + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
