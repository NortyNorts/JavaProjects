import java.util.ArrayList;

public abstract class Brawler extends Player{


//    private ArrayList<IChangeWeapon> weapons;
    private Weapons equipedWeapon;
    private ArrayList<Weapons> inventory;

    public Brawler(int health, Weapons equipedWeapon) {
        super(health);
        this.equipedWeapon = equipedWeapon;
        this.inventory = new ArrayList<>();
        inventory.add(Weapons.AXE);
        inventory.add(Weapons.NUNCHUCKS);
        inventory.add(Weapons.SWORD);
        inventory.add(Weapons.BOW);
    }

    public Weapons getWeapon() {
        return equipedWeapon;
    }


    public void setWeapons(Weapons equipedWeapon) {
        this.equipedWeapon = equipedWeapon;
    }

    public void printInv(){
        System.out.println(this.inventory);
    }


    public void protagonistAttack(EnemyBrawler enemy) {
        enemy.health -= this.equipedWeapon.getDamage();
    }

    public void enemyAttack(Barbarian barbarian, EnemyBrawler enemy) {
        barbarian.health -= enemy.getWeapon().getDamage();
    }


}
