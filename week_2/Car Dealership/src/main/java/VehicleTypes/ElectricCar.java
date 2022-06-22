package VehicleTypes;

import Components.EngineTypes;
import Components.GearBoxTypes;

public class ElectricCar extends Vehicle {

    public ElectricCar(GearBoxTypes gearBoxType, EngineTypes engineType, int price, String colour, String model) {
        super(gearBoxType, engineType, price, colour, model);
    }
}
