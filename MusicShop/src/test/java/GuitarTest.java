import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar electricGuitar;

    @Before
    public void before(){
        electricGuitar = new Guitar(300, 500, InstrumentType.STRING, "Fender","Stratocaster", "Blue", GuitarType.ELECTRIC);
    }

    @Test
    public void guitarHasPurchasePrice(){
        assertEquals(300, electricGuitar.getPurchasePrice(),0.2);
    }

    @Test
    public void guitarHasSalePrice(){
        assertEquals(500, electricGuitar.getSalePrice(), 0.2);
    }

    @Test
    public void guitarHasInstrumentType(){
        assertEquals(InstrumentType.STRING, electricGuitar.getInstrumentType());
    }

    @Test
    public void guitarHasModel(){
        assertEquals("Fender", electricGuitar.getBrand());
    }

    @Test
    public void guitarHasBrand(){
        assertEquals("Stratocaster", electricGuitar.getModel());
    }

    @Test
    public void guitarHasColour(){
        assertEquals("Blue", electricGuitar.getColour());
    }

    @Test
    public void guitarHasGuitarType(){
        assertEquals(GuitarType.ELECTRIC, electricGuitar.getGuitarType());
    }

    @Test
    public void guitarCanBePlayed(){
        System.out.println(electricGuitar.play(electricGuitar.getSound()));
    }

    @Test
    public void guitarCanBeSold(){
        assertEquals(200, electricGuitar.calculateMarkup(electricGuitar.getSalePrice(),electricGuitar.getPurchasePrice()), 0.2);
    }

}
