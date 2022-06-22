import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class dwarfTest {

    Dwarf dwarf;
//    private ArrayList<IChangeWeapon> weapons;
//    Weapons weapon;

    @Before
    public void before(){
//        weapons = new ArrayList<>();
        dwarf = new Dwarf(100, Weapons.AXE);
//        weapon = Weapons.AXE;
//        weapons.add(weapon);
    }

    @Test
    public void checkDwarfHasHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void checkDwarfHasWeapon(){
        assertEquals(Weapons.AXE, dwarf.getWeapon());
    }

    @Test
    public void areDwarfsNaturalSprinters(){
        assertEquals("We Dwarfs are natural sprinters", dwarf.sprint());
    }

    @Test
    public void hasInv(){
        dwarf.printInv();
        assertEquals(true, true);
    }


}
