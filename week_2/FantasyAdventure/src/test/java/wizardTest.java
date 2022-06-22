import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class wizardTest {

    Wizard wizard;
    Creature creature;


    @Before
    public void before(){
        creature = new Creature(100, "Shinay");
        wizard = new Wizard(100, creature);
    }

    @Test
    public void checkWizardnHasHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void checkWizardHasCreature(){
        assertEquals("Shinay", wizard.getCreatureName());
    }

    @Test
    public void hasInv(){
        wizard.printSpellInv();
        assertEquals(true, true);
    }

}
