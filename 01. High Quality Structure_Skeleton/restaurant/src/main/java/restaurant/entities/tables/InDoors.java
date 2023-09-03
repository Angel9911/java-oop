package restaurant.entities.tables;

public class InDoors extends BaseTable {
    private static final double inDoorsPrice = 3.50;

    public InDoors(int number, int size) {
        super(number, size, inDoorsPrice);
    }

}
