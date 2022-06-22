public class Creature extends Player{

    private String name;

    public Creature(int health, String name) {
        super(health);
        this.name =name;
    }

    public String getName() {
        return name;
    }
}
