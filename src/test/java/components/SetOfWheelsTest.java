package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetOfWheelsTest {

    SetOfWheels setOfWheels;

    @Before
    public void before() {
        setOfWheels = new SetOfWheels("Michelin", "DE23");
    }

    @Test
    public void hasMake() {
        assertEquals("Michelin", setOfWheels.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("DE23", setOfWheels.getModel());
    }

}
