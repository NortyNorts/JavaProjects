import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("John", 29, 117.5);
    }

    @Test
    public void hasName(){
        assertEquals("John", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(29, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(117.5, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
    }
}
