package VehicleTypes;

import Components.EngineTypes;
import Components.GearBoxTypes;

public abstract class Vehicle {

    private GearBoxTypes gearBoxType;
    private EngineTypes engineType;
    private int price;
    private String colour;
    private String model;

    public Vehicle(GearBoxTypes gearBoxType, EngineTypes engineType, int price, String colour, String model) {
        this.gearBoxType = gearBoxType;
        this.engineType = engineType;
        this.price = price;
        this.colour = colour;
        this.model = model;
    }

    public GearBoxTypes getGearBoxType() {
        return gearBoxType;
    }

    public EngineTypes getEngineType() {
        return engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

}
