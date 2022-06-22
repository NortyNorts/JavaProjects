import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Passanger passanger;
    Plane plane;
    CabinCrew flightAttendant;

    @Before
    public void before(){
        pilot = new Pilot("James", Rank.CAPTAIN, "A123");
        plane = new Plane("B456", 3);
        flightAttendant = new CabinCrew("Dan", Rank.FLIGHT_ATTENDANT);
        passanger = new Passanger("Emilie", 1);
        flight = new Flight(
                pilot,
                plane,
                "X098",
                "GLA",
                "EDI",
                1000);
    }

    @Test
    public void checkNumberOfSeats(){
        assertEquals(3, plane.getCapacity());
    }

    @Test
    public void bookPassangerToFlight(){
        flight.addPassanger(passanger);
        assertEquals(1, flight.getPassangersList());
    }

}
