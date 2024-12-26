package Projects._3_;

public class Motorcycle extends  Vehicle{
    public Motorcycle(String licencePlate) {
        super("Motorcycle",licencePlate);
    }

    @Override
    public double calculateRate(long parkedTime) {
        return parkedTime * 0.5;
    }
}
