package components;

import cars.Car;
import org.junit.Before;
import org.junit.Test;
import persons.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {
    Driver badDriver;
    Driver goodDriver;
    Car car;
    Engine fastEngine;
    Body body;
    SetOfWheels setOfWheels;


    @Before
    public void before() {
        badDriver = new Driver("Hayden", 1);
        goodDriver = new Driver("Chris", 3);

        fastEngine = new Engine("BAE", "398", 450);
        body = new Body("Ace", "AGE", "Turquoise");
        setOfWheels = new SetOfWheels("Michelin", "GEFR");
        car = new Car("Ferrari", "A234", fastEngine, setOfWheels, body);
    }

    @Test
    public void canGetName() {
        assertEquals("Chris", goodDriver.getName());
    }

    @Test
    public void canGetDrivingSkill() {
        assertEquals(1, badDriver.getDrivingSkill());
    }

    @Test
    public void canGetDrivingSpeed() {
        assertEquals("I can drive a Ferrari A234 at 150.", badDriver.drive(car));
        assertEquals("I can drive a Ferrari A234 at 450.", goodDriver.drive(car));
    }


}
