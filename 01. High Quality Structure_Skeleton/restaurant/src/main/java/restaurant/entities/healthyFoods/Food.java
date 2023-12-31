package restaurant.entities.healthyFoods;

import restaurant.common.ExceptionMessages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;

import static restaurant.utils.StringUtils.nullOrEmpty;

public abstract class Food implements HealthyFood {
    private String name;
    private double portion;
    private double price;

    protected Food(String name, double portion, double price) {
        this.setName(name);
        this.setPortion(portion);
        this.setPrice(price);
        // to do add validation with setters
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPortion() {
        return portion;
    }

    @Override
    public double getPrice() {
        return price;
    }

    private void setName(String name) {

        nullOrEmpty(name,ExceptionMessages.INVALID_NAME);

        this.name = name;
    }

    private void setPortion(double portion) {

        if(portion < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PORTION);
        }

        this.portion = portion;
    }

    private void setPrice(double price) {

        if(price < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }

        this.price = price;
    }
}
