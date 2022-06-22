import java.util.ArrayList;

public class Plane {

    private ArrayList bags;
    private String type;
    private int capacity;

    public Plane(String type, int capacity){
        this.bags = new ArrayList<>();
        this.type = type;
        this.capacity = capacity;

    }

    public int getBags() {
        return bags.size();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

}
