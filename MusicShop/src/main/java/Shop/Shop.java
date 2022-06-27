package Shop;

import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    ArrayList<Instrument> stock;
    private double till;

    public Shop(ArrayList<Instrument> stock, double till) {
        this.stock = stock;
        this.till = till;
    }

    public int getStock() {
        return stock.size();
    }
}
