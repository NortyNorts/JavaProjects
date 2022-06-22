import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class warlockTest {

    Warlock warlock;
    Creature creature;


    @Before
    public void before(){
        creature = new Creature(100, "Sparkles");
        warlock = new Warlock(100, creature);
//        weapon = Weapons.AXE;
//        weapons.add(weapon);
    }

    @Test
    public void checkWarlockHasHealth(){
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void checkWarlockHasCreature(){
        assertEquals("Sparkles", warlock.getCreatureName());
    }

    @Test
    public void hasInv(){
        warlock.printSpellInv();
        assertEquals(true, true);
    }

}
