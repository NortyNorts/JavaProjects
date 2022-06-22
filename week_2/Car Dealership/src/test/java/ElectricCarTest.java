
import VehicleTypes.ElectricCar;

import Components.EngineTypes;
import Components.GearBoxTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(GearBoxTypes.SINGLESPEED, EngineTypes.ELECTRIC,12000, "Black", "Tesla");
    }

    @Test
    public void carHasGearBoxType(){
        assertEquals(GearBoxTypes.SINGLESPEED, electricCar.getGearBoxType());
    }

    @Test
    public void carHasEngineType(){
        assertEquals(EngineTypes.ELECTRIC, electricCar.getEngineType());
    }

    @Test
    public void carHasPrice(){
        assertEquals(12000, electricCar.getPrice());
    }

    @Test
    public void carPriceCanChange(){
        electricCar.setPrice(15000);
        assertEquals(15000, electricCar.getPrice());
    }

    @Test
    public void carHasColour(){
        assertEquals("Black", electricCar.getColour());
    }

    @Test
    public void carCanBeSprayPaintedADifferentColour(){
        electricCar.setColour("Blue");
        assertEquals("Blue", electricCar.getColour());
    }

    @Test
    public void carHasModelType(){
        assertEquals("Tesla", electricCar.getModel());
    }

}
