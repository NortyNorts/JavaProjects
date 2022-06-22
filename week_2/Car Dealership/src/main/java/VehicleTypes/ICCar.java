package VehicleTypes;

import Components.EngineTypes;
import Components.GearBoxTypes;

public class ICCar extends Vehicle{

    public ICCar(GearBoxTypes gearBoxType, EngineTypes engineType, int price, String colour, String model) {
        super(gearBoxType, engineType, price, colour, model);
    }
}
