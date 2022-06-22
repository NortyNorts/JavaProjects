import org.junit.Before;
import org.junit.Test;

import javax.tools.Tool;

import static org.junit.Assert.assertEquals;

public class healerTest {

    Healer healer;
    Barbarian barbarian;

    @Before
    public void before(){
        healer = new Healer(100, Tools.SALVE);
        barbarian = new Barbarian(100, Weapons.AXE);
    }

    @Test
    public void healerHasHealth(){
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void healerHasTool(){
        assertEquals(Tools.SALVE, healer.getEquipedTools());
    }

    @Test
    public void hasInv(){
        healer.printInv();
        assertEquals(true, true);
    }

    @Test
    public void healerHasTools(){
        assertEquals(5, healer.getToolsInv());
    }


    @Test
    public void healerCanUseSalve(){
        healer.useSalve(barbarian);
        assertEquals(4, healer.getToolsInv());
        assertEquals(110,barbarian.getHealth());
    }




}
