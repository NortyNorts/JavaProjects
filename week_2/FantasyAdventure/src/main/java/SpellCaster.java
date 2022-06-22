import java.util.ArrayList;

public abstract class SpellCaster extends Player{

    private Creature creature;
    private ArrayList<Spells> spellInv;

    public SpellCaster(int health, Creature creature) {
        super(health);
        this.creature = creature;
        this.spellInv = new ArrayList<>();
        spellInv.add(Spells.STRIKINGTIDE);
        spellInv.add(Spells.FIREBALL);
        spellInv.add(Spells.TERRASMASH);
        spellInv.add(Spells.BOLTOFLIGHTNING);
        spellInv.add(Spells.WHISPERINGWINDS);
    }

    public String getCreatureName() {
        return creature.getName();
    }

    public void printSpellInv(){
        System.out.println(this.spellInv);
    }

}
