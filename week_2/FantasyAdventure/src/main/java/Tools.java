public enum Tools {

    SALVE(10),
    POTION(20),
    POKEMON(50),
    HYPERPOTION(100),;

    private final int heal;

    Tools(int heal){
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
}
