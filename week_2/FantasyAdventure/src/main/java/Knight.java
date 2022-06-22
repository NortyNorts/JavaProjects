import java.util.ArrayList;

public class Knight extends Brawler{

    private Weapons weapons;
    private int armour;

    public Knight(int health, Weapons weapons, int armour) {
        super(health, weapons);
        this.armour = armour;
    }

    public void setArmour() {
        this.armour = 50;
    }

    public int getArmour() {
        return armour;
    }
}
