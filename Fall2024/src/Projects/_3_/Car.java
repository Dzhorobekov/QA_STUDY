package Projects._3_;

public class Car extends  Vehicle{
    public Car(String licencePlate) {
        super("Car" , licencePlate);
    }

    @Override
    public double calculateRate(long parkedTime) {
        return parkedTime * 1.6;
    }
}

