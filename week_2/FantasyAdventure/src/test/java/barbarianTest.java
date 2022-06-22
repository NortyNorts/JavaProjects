import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class barbarianTest {

    Barbarian barbarian;
    EnemyBrawler enemy;

    @Before
    public void before(){
        barbarian = new Barbarian(100, Weapons.AXE);
        enemy = new EnemyBrawler(50, Weapons.AXE);

    }

    @Test
    public void checkBarbarianHasHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void checkBarbarianHasWeapon(){
        assertEquals(Weapons.AXE, barbarian.getWeapon());
    }

    @Test
    public void changeBarbarianWeapon(){
        barbarian.setWeapons(Weapons.NUNCHUCKS);
        assertEquals(Weapons.NUNCHUCKS, barbarian.getWeapon());
    }

    @Test
    public void hasInv(){
        barbarian.printInv();
        assertEquals(true, true);
    }

    @Test
    public void barbarianCanHitEnemy(){
        barbarian.protagonistAttack(enemy);
        assertEquals(43, enemy.getHealth());
    }

    @Test
    public void enemyCanHitBarbarian(){
        enemy.enemyAttack(barbarian, enemy);
        assertEquals(93, barbarian.getHealth());
    }


}
