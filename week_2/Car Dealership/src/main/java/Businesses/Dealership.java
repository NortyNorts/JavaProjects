package Businesses;

import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(int till, ArrayList<Vehicle> vehicles) {
        this.till = till;
        this.vehicles = vehicles;
    }
}
