package restaurant.entities.drinks;

import restaurant.common.ExceptionMessages;
import restaurant.entities.drinks.interfaces.Beverages;

import static restaurant.utils.StringUtils.nullOrEmpty;

public abstract class BaseBeverages implements Beverages {
    private String name;
    private int counter;
    private double price;
    private String brand;

    protected BaseBeverages(String name, int counter, double price, String brand) {
       this.setName(name);
       this.setCounter(counter);
       this.setPrice(price);
       this.setBrand(brand);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    private void setName(String name) {

        nullOrEmpty(name,ExceptionMessages.INVALID_NAME);

        this.name = name;
    }

    private void setCounter(int counter) {

        if(counter < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_COUNTER);
        }

        this.counter = counter;
    }

    private void setPrice(double price) {

        if(price < 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_PRICE);
        }

        this.price = price;
    }

    private void setBrand(String brand) {

        nullOrEmpty(brand,ExceptionMessages.INVALID_BRAND);

        this.brand = brand;
    }
}
