package _15_OOP.inheritance;

public class PentHouse extends Apartment{

    public double living_room;
    public double dining_room;

    public PentHouse(int roomNumber, double kitchen, double bedroom, double living_room, double dining_room) {
        super(roomNumber, kitchen, bedroom);
        this.living_room = living_room;
        this.dining_room = dining_room;
    }

    @Override
    public String toString() {
        return "PentHouse{" +
                "roomNumber=" + roomNumber +
                ", kitchen=" + kitchen +
                ", bedroom=" + bedroom +
                '}';
    }

    // overloading -> same methodNames in 1-class, diff params
    // overloading -> same methodNames in another classes, diff implementations


}
