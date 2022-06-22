import java.util.ArrayList;

public class Flight {

    Pilot pilot;
    ArrayList<CabinCrew> cabinCrew;
    ArrayList<Passanger> passengers;
    Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private int departureTime;

    Flight(
            Pilot pilot,
            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            int departureTime){
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

        public int getPassangersList(){
        this.passengers.size();
        }

        public void addPassanger(passanger) {
            this.passengers.add(0,passenger);
        }

}
