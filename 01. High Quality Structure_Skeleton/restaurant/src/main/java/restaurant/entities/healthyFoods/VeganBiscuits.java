package restaurant.entities.healthyFoods;

import restaurant.entities.healthyFoods.interfaces.HealthyFood;

public class VeganBiscuits extends Food {
    private static final int initialVeganBiscuitsPortion = 205;

    public VeganBiscuits(String name, double price) {
        super(name, initialVeganBiscuitsPortion, price);
    }
}
