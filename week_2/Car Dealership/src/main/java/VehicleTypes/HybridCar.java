package VehicleTypes;

import Components.EngineTypes;
import Components.GearBoxTypes;

public class HybridCar extends Vehicle{

    public HybridCar(GearBoxTypes gearBoxType, EngineTypes engineType, int price, String colour, String model) {
        super(gearBoxType, engineType, price, colour, model);
    }
}
