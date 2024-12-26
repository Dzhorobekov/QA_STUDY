package Projects._3_;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Vehicle {
    protected String licencePlate;
    protected LocalDateTime entryTime;
    protected String type;

    public Vehicle(String licencePlate, String type) {
        this.licencePlate = licencePlate;
        this.type = type;
    }

    public void enterParking(){
        entryTime = LocalDateTime.now();
        System.out.println(type + " with licence Plate" + licencePlate + " entered the parking. ");
    }

    public void exitParking(){
        LocalDateTime exitTime = LocalDateTime.now();
        long parkedTime = Duration.between(entryTime, exitTime).toMinutes();
        double rate = parkedTime;
        System.out.println(type + " with licence Plate" + licencePlate + " exited thr parking.\n"
        + "time parked : " + parkedTime + " minutes \n"
        + "fee : " + rate);

    }

    public abstract double calculateRate(long parkedTime);
}
