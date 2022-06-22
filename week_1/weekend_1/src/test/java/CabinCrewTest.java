import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew firstOfficer;
    CabinCrew flightAttendant1;
    CabinCrew flightAttendant2;
    CabinCrew flightAttendant3;

    @Before
    public void before() {
        firstOfficer = new CabinCrew("Henry", Rank.FIRST_OFFICER);
        flightAttendant1 = new CabinCrew("Alice", Rank.FLIGHT_ATTENDANT);
        flightAttendant2 = new CabinCrew("Pam", Rank.FLIGHT_ATTENDANT);
        flightAttendant3 = new CabinCrew("Bill", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewHasName() {
        assertEquals("Henry", firstOfficer.getName());
    }

    @Test
    public void changeCabinCrewName(){
        flightAttendant1.setName("Gill");
        assertEquals("Gill", flightAttendant1.getName());
    }

    @Test
    public void cabinCrewHasRank() {
        assertEquals(Rank.FIRST_OFFICER, firstOfficer.getRank());
    }

}


