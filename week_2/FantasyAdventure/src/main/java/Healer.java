import java.util.ArrayList;

public class Healer extends Player{

    private Tools equippedTool;
    private ArrayList<Tools> toolsInv;

    public Healer(int health, Tools equippedTool) {
        super(health);
        this.equippedTool = equippedTool;
        this.toolsInv = new ArrayList<>();
        toolsInv.add(Tools.SALVE);
        toolsInv.add(Tools.SALVE);
        toolsInv.add(Tools.HYPERPOTION);
        toolsInv.add(Tools.POKEMON);
        toolsInv.add(Tools.POTION);
    }

    public Tools getEquipedTools() {
        return equippedTool;
    }

    public void printInv(){
        System.out.println(this.toolsInv);
    }

    public int getToolsInv() {
        return toolsInv.size();
    }

    public void useSalve(Player player) {
        player.health += Tools.SALVE.getHeal();
        toolsInv.remove(Tools.SALVE);
    }
}
