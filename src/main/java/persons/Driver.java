package persons;

public class Driver extends Person {
    private int drivingSkill;

    public Driver(String name, int drivingSkill) {
        super(name);
        this.drivingSkill = drivingSkill;
    }

    public int getDrivingSkill() {
        return this.drivingSkill;
    }

}
