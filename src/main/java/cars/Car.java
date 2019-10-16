package cars;

import components.Body;
import components.Engine;
import components.SetOfWheels;

public class Car {
    private String make;
    private String model;
    private Engine engine;
    private SetOfWheels setOfWheels;
    private Body body;

    public Car(String make, String model, Engine engine, SetOfWheels setOfWheels, Body body) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.setOfWheels = setOfWheels;
        this.body = body;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public SetOfWheels getSetOfWheels() {
        return this.setOfWheels;
    }

    public Body getBody() {
        return this.body;
    }

    public int getSpeed() {
        return engine.getSpeed();
    };


}
