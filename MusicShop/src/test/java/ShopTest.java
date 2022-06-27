import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.Instrument;
import Instruments.InstrumentType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop raysMusicShop;
    ArrayList<Instrument> stock;
    Guitar electricGuitar;

    @Before
    public void before(){
        stock = new ArrayList<>();
        raysMusicShop = new Shop(stock, 5000);
        electricGuitar = new Guitar(300, 500, InstrumentType.STRING, "Fender","Stratocaster", "Blue", GuitarType.ELECTRIC);
    }

    @Test
    public void addItemToStock(){
        stock.add(electricGuitar);
        assertEquals(1, raysMusicShop.getStock());
        System.out.println(stock);
    }

    @Test
    public void removeItemToStock(){
        stock.add(electricGuitar);
        stock.remove(electricGuitar);
        assertEquals(0, raysMusicShop.getStock());
        System.out.println(stock);
    }

}
