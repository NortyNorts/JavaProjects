import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Barbarian barbarian;
    EnemyBrawler enemy;
    EnemyBrawler enemy1;
    EnemyBrawler enemy2;
    ArrayList<EnemyBrawler> enemiesInRoom;

    @Before
    public void before(){
        enemy = new EnemyBrawler(50, Weapons.BOW);
        enemy1 = new EnemyBrawler(0, Weapons.BOW);
        enemy2 = new EnemyBrawler(50, Weapons.BOW);
        barbarian = new Barbarian(100, Weapons.NUNCHUCKS);
        enemiesInRoom = new ArrayList<>();
        enemiesInRoom.add(enemy);
        enemiesInRoom.add(enemy1);
        enemiesInRoom.add(enemy2);
        dungeon = new Dungeon(enemiesInRoom);
    }

    @Test
    public void isEnemyInDungeon(){
        assertEquals(1, dungeon.getEnemies().size());
    }

    @Test
    public void canRemoveEnemyFromDungeon(){
        enemiesInRoom.remove(enemy);
        assertEquals(2, enemiesInRoom.size());
    }


//    @Test
//    public void battle(){
//        for(Object enemy: enemiesInRoom){
//            if()
//
//        }
//    }

//    @Test
//    public void canRemoveEnemyWhenDead(){
//        public void removeEnemyFromDungeon(ArrayList enemies){
//            for(Object enemy : enemies){
//                if(enemy. <= 0){
//                    enemies.remove(enemy);
//                }
//            }
//        }
//        dungeon.removeEnemyFromDungeon();
//        assertEquals(2,enemiesInRoom.size());
//    }



}
