package restaurant.entities.tables;

import restaurant.common.ExceptionMessages;
import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.entities.tables.interfaces.Table;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTable implements Table {
    private List<HealthyFood> healthyFood;
    private List<Beverages> beverages;
    private int number;
    private int size;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReservedTable;
    private double allPeople;


    protected BaseTable(int number, int size, double pricePerPerson) {
        this.setNumber(number);
        this.setSize(size);
        this.setPricePerPerson(pricePerPerson);
        this.healthyFood = new ArrayList<>();
        this.beverages = new ArrayList<>();
        //to do validation on setters
    }

    @Override
    public int getTableNumber() {
        return this.number;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int numberOfPeople() {
        return this.numberOfPeople;
    }

    @Override
    public double pricePerPerson() {
        return this.pricePerPerson;
    }

    @Override
    public boolean isReservedTable() {
        return this.isReservedTable;
    }

    @Override
    public double allPeople() {
        return this.allPeople;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if(numberOfPeople <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
        this.isReservedTable = true;
    }

    @Override
    public void orderHealthy(HealthyFood food) {
        if(food != null){
            this.healthyFood.add(food);
        }
    }

    @Override
    public void orderBeverages(Beverages beverages) {
        if(beverages != null){
            this.beverages.add(beverages);
        }
    }

    @Override
    public double bill() {
        double foodBill = 0;
        if(!this.healthyFood.isEmpty()){
            for(HealthyFood healthyFood: this.healthyFood){
                foodBill = foodBill + healthyFood.getPrice();
            }
        }

        double beveragesBill = this.beverages.stream()
                .mapToDouble(Beverages::getPrice)
                .sum();

        return foodBill+beveragesBill + (numberOfPeople*pricePerPerson);
    }

    @Override
    public void clear() {
        this.isReservedTable = false;
        this.numberOfPeople = 0;
        this.beverages.clear();
        this.healthyFood.clear();
        this.pricePerPerson = 0;
    }

    @Override
    public String tableInformation() {
        String tableInfo = String.format(
                "Table - {%d}\"\n" +
                        "Size - {$d}%n" +
                        "Type - {%s}%n" +
                        "All price - {%.2f}"
                ,this.number
                ,this.size
                ,this.getClass().getSimpleName()
                ,this.pricePerPerson
        );

        return tableInfo;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private void setSize(int size) {

        if(size <= 0){
            throw new IllegalArgumentException(ExceptionMessages.INVALID_TABLE_SIZE);
        }

        this.size = size;
    }

    private void setPricePerPerson(double pricePerPerson) {

        this.pricePerPerson = pricePerPerson;
    }
}
