package cars;

public class Car {
    private String make;
    private String model;
    private String colour;

    public Car(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
