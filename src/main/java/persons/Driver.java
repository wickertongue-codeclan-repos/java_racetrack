package persons;

import behaviours.IDrive;
import cars.Car;

public class Driver extends Person implements IDrive {
    private int drivingSkill;

    public Driver(String name, int drivingSkill) {
        super(name);
        this.drivingSkill = drivingSkill;
    }

    public int getDrivingSkill() {
        return this.drivingSkill;
    }

    public String drive(Car car) {
        if (drivingSkill == 1) {
           int speed = car.getSpeed() / 3;
           return "I can drive a " + car.getMake() + " " + car.getModel() + " at " + speed + ".";
        } else if (drivingSkill == 2) {
            int speed = car.getSpeed() / 2;
            return "I can drive a " + car.getMake() + " " + car.getModel() + " at " + speed + ".";
        } else if (drivingSkill == 3){
            int speed = car.getSpeed();
            return "I can drive a " + car.getMake() + " " + car.getModel() + " at " + speed + ".";
        } else {
            return "I cannot drive a " + car.getMake() + " " + car.getModel() + ". I will Crash!";
        }
    }
}
