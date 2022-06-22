import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassangerTest {

    Passanger passanger1;
    Passanger passanger2;
    Passanger passanger3;

    @Before
    public void before(){
        passanger1 = new Passanger("Emilie", 1);
        passanger2 = new Passanger("Adam", 2);
        passanger3 = new Passanger("James", 3);
    }

    @Test
    public void passangerHasName(){
        assertEquals("Emilie", passanger1.getName());
    }

    @Test
    public void changePassangerName(){
        passanger3.setName("Adam");
        assertEquals("Adam", passanger3.getName());
    }

    @Test
    public void passangerHasBags(){
        assertEquals(1, passanger1.getBags());
    }

    @Test
    public void changePassangerBags(){
        passanger2.setBags(1);
        assertEquals(1, passanger2.getBags());
    }

}
