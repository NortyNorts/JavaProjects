import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passangers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passangers = new ArrayList<>();
    }

    public int getPassangers() {
        return passangers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassanger(Person person) {
        if(getPassangers() < capacity){
            this.passangers.add(person);
        }else{
            System.out.println("The bus is full");
        }
    }

    public void removePassanger(Person person) {
        this.passangers.remove(person);
    }
}
