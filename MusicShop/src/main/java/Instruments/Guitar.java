package Instruments;

public class Guitar extends Instrument implements IPlay{

    private static final String sound = "Wowwww";
    private String model;
    private String colour;
    private GuitarType guitarType;

    public Guitar(double purchasePrice, double salePrice, InstrumentType instrumentType, String brand, String model, String colour, GuitarType guitarType) {
        super(purchasePrice, salePrice, instrumentType, brand, sound);
        this.model = model;
        this.colour = colour;
        this.guitarType = guitarType;

    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String play(String sound){
        return sound;
    }

    public double calculateMarkup(double selling, double buying){
        return selling - buying;
    }

}
