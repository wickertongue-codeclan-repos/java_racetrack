package cars;

import components.Body;
import components.Engine;
import components.SetOfWheels;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine fastEngine;
    Body body;
    SetOfWheels setOfWheels;

    @Before
    public void before() {
        fastEngine = new Engine("BAE", "398", 450);
        body = new Body("Ace", "AGE", "Turquoise");
        setOfWheels = new SetOfWheels("Michelin", "GEFR");
        car = new Car("Ferrari", "A234", fastEngine, setOfWheels, body);
    }

    @Test
    public void hasMake() {
        assertEquals("Ferrari", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("A234", car.getModel());
    }

    @Test
    public void canGetEngine() {
        assertEquals("BAE", car.getEngine().getMake());
        assertEquals(450, car.getEngine().getSpeed());
    }

    @Test
    public void canGetSpeed() {
        assertEquals(450, car.getSpeed());
    }

}
