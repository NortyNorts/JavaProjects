public enum Weapons {

    SWORD(5),
    AXE(7),
    BOW(4),
    NUNCHUCKS(10),;

    private final int damage;

    Weapons(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
