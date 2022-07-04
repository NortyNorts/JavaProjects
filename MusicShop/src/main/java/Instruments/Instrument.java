package Instruments;

import Shop.ISell;

public abstract class Instrument implements ISell {

    private double purchasePrice;
    private double salePrice;
    private InstrumentType instrumentType;
    private String brand;
    private String sound;

    public Instrument(double purchasePrice, double salePrice, InstrumentType instrumentType, String brand, String sound) {
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.instrumentType = instrumentType;
        this.brand = brand;
        this.sound = sound;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public String getSound() {
        return sound;
    }

    public double calculateMarkup(double selling, double buying){
        return selling - buying;
    }

}
