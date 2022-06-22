import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void checkVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkRemoves10FromVolume(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyChangesVolumeTo0(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillChangesVolumeTo100(){
        assertEquals(100, waterBottle.fill());
    }

}
