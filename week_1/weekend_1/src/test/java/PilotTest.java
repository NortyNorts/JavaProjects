import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Dave", Rank.CAPTAIN, "A123");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Dave", pilot.getName());
    }

    @Test
    public void changePilotName(){
        pilot.setName("Ben");
        assertEquals("Ben", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("A123", pilot.getLicenceNumber());
    }



}
