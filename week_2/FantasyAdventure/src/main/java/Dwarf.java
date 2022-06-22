import java.util.ArrayList;

public class Dwarf extends Brawler{

    private Weapons weapons;

    public Dwarf(int health, Weapons weapons) {
        super(health, weapons);
    }


    public String sprint() {
        return "We Dwarfs are natural sprinters";
    }
}
