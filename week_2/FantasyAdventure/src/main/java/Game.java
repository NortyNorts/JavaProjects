public class Game {

    public static void brawlerBattle(Dungeon dungeon, Brawler brawler){
        for(EnemyBrawler enemyBrawler: dungeon.getEnemies()){
            brawler.protagonistAttack(enemyBrawler);
            dungeon.checkIfDead(enemyBrawler);

        }
    }

}
