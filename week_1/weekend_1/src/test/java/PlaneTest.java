import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("B456", 3);
    }

    @Test
    public void planeHasAType(){
        assertEquals("B456", plane.getType());
    }

    @Test
    public void planeHasBags(){
        assertEquals(0, plane.getBags());
    }

}
