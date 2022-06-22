public enum RoomType {

    SINGLE(1, 2),
    DOUBLE(2,5),
    TRIPPLE(3, 10),
    FAMILY(4, 15);

    private final int value;
    private final int price;

    RoomType(int value, int price) {
        this.value = value;
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public int getPrice() {
        return price;
    }

    RoomType[] roomTypes = RoomType.values();

}
