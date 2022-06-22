package People;

import VehicleTypes.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> cars;

    public Customer(int money, ArrayList<Vehicle> cars) {
        this.money = money;
        this.cars = cars;
    }
}
