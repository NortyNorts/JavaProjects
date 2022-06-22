import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 3);
        person1 = new Person("Dave");
        person2 = new Person("Fred");
        person3 = new Person("Clare");
        person4 = new Person("Janet");
    }

    @Test
    public void checkNumberOfPassangers(){
        assertEquals(0, bus.getPassangers());
    }

    @Test
    public void hasCorrectDestination(){
        assertEquals("Edinburgh", bus.getDestination());
    }

    @Test
    public void hasCorrectCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void addPassangersToBus(){
        bus.addPassanger(person1);
        bus.addPassanger(person2);
        bus.addPassanger(person3);
        bus.addPassanger(person4);
        assertEquals(3, bus.getPassangers());
    }

    @Test
    public void removePassangersFromBus(){
        bus.addPassanger(person1);
        bus.addPassanger(person2);
        bus.addPassanger(person3);
        bus.removePassanger(person1);
        assertEquals(2, bus.getPassangers());
    }
}
