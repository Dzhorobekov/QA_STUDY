package _15_OOP.inheritance;

public class Apartment {

    public int roomNumber;
    public double kitchen;
    public double bedroom;

    public Apartment(int roomNumber, double kitchen, double bedroom) {
        this.roomNumber = roomNumber;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
    }

    public String renovation(String room, double area){
        return "Renovate " + room + "\n Area : " + area;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "roomNumber=" + roomNumber +
                ", kitchen=" + kitchen +
                ", bedroom=" + bedroom +
                '}';
    }
}
