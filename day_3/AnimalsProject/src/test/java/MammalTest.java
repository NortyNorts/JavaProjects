import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    private Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal(0);
    }

    @Test
    public void hasFoodInBelly(){
        assertEquals(0, mammal.getBelly());
    }

    @Test
    public void canEat(){
        mammal.setBelly(1);
        assertEquals(1, mammal.getBelly());
    }

    @Test
    public void canBreathe(){
        assertEquals(true, mammal.canBreathe());
    }

    @Test
    public void canTalk(){
        assertEquals("I can talk", mammal.canTalk());
    }


}
