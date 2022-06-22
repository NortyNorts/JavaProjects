import java.util.ArrayList;

public class Dungeon {

    private ArrayList<EnemyBrawler> enemies;

    public Dungeon(ArrayList<EnemyBrawler> enemies) {
        this.enemies = enemies;
    }

    public void addEnemyToDungeon(EnemyBrawler enemyBrawler){
        this.enemies.add(enemyBrawler);
    }

    public ArrayList<EnemyBrawler> getEnemies() {
        return enemies;
    }

    public void checkIfDead(EnemyBrawler brawler){
            if(brawler.getHealth() <= 0){
                enemies.remove(brawler);
            }
        }





//    public void victoryCondition(){
//        while(enemies.size() > 0){
//            keep fighting;}
//        else{
//            System.out.println("You have defeated the enemies in this dungeon, well done adventurer!");
//        }
}
