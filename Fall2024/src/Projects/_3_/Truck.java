package Projects._3_;

public class Truck extends  Vehicle{
    public Truck(String licencePlate) {
        super("Truck",licencePlate);
    }

    @Override
    public double calculateRate(long parkedTime) {
        return parkedTime * 1.1;
    }
}
