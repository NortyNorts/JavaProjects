import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;
    private Salmon salmon;
    private River river;

    @Before
    public void before(){
        bear = new Bear("John");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear.eatFishFromRiver(river);
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }

}
