package components;

import org.junit.Before;
import org.junit.Test;
import persons.Driver;

import static org.junit.Assert.assertEquals;

public class DriverTest {
    Driver badDriver;
    Driver goodDriver;


    @Before
    public void before() {
        badDriver = new Driver("Hayden", 2);
        goodDriver = new Driver("Chris", 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Chris", goodDriver.getName());
    }

    @Test
    public void canGetDrivingSkill() {
        assertEquals(2, badDriver.getDrivingSkill());
    }


}
