package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("BAE", "R1", 200);
    }

    @Test
    public void hasMake() {
        assertEquals("BAE", engine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("R1", engine.getModel());
    }

    @Test
    public void hasSpeed() {
        assertEquals(200, engine.getSpeed());
    }
}
