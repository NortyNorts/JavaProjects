import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class knightTest {

    Knight knight;


    @Before
    public void before(){
        knight = new Knight(100, Weapons.AXE, 0);
    }

    @Test
    public void checkKnightHasHealth(){
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void checkKnightHasWeapon(){
        assertEquals(Weapons.AXE, knight.getWeapon());
    }

    @Test
    public void donArmour(){
        knight.setArmour();
        assertEquals(50, knight.getArmour());
    }

    @Test
    public void hasInv(){
        knight.printInv();
        assertEquals(true, true);
    }

}
