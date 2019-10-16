package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;

    @Before
    public void before() {
        body = new Body("GLHF", "Ace", "Polkadot");
    }

    @Test
    public void hasMake() {
        assertEquals("GLHF", body.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Ace", body.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Polkadot", body.getColour());
    }

}
