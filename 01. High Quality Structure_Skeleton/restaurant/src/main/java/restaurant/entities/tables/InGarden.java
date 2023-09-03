package restaurant.entities.tables;

public class InGarden extends BaseTable{
    private static final double inGardenPrice = 4.50;

    public InGarden(int number, int size) {
        super(number, size, inGardenPrice);
    }


}
