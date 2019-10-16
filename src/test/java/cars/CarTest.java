package cars;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before() {
        car = new Car("Ferrari", "A234", "Red");
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
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

}
