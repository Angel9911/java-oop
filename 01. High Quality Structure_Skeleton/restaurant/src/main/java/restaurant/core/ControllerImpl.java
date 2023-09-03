package restaurant.core;

import restaurant.common.ExceptionMessages;
import restaurant.common.OutputMessages;
import restaurant.core.interfaces.Controller;
import restaurant.entities.drinks.Fresh;
import restaurant.entities.drinks.Smoothie;
import restaurant.entities.healthyFoods.Food;
import restaurant.entities.healthyFoods.Salad;
import restaurant.entities.healthyFoods.VeganBiscuits;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.entities.tables.InDoors;
import restaurant.entities.tables.InGarden;
import restaurant.entities.tables.interfaces.Table;
import restaurant.repositories.interfaces.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static restaurant.common.ExceptionMessages.*;
import static restaurant.common.OutputMessages.*;

public class ControllerImpl implements Controller {

    private HealthFoodRepository<HealthyFood> healthFoodRepository;
    private BeverageRepository<Beverages> beverageRepository;
    private TableRepository<Table> tableRepository;
    private double totalMoney = 0;

    public ControllerImpl(HealthFoodRepository<HealthyFood> healthFoodRepository, BeverageRepository<Beverages> beverageRepository, TableRepository<Table> tableRepository) {
        this.healthFoodRepository = healthFoodRepository;
        this.beverageRepository = beverageRepository;
        this.tableRepository = tableRepository;
    }

    @Override
    public String addHealthyFood(String type, double price, String name) {
       HealthyFood food;
        if(type.equals("Salad")) {
            food = new Salad(name, price);
        } else if(type.equals("Food")){
            food = new VeganBiscuits(name,price);
        } else {
            return "Invalid type";
        }

        if(this.healthFoodRepository.foodByName(name) == null){
            this.healthFoodRepository.add(food);
            return String.format(FOOD_ADDED,name);
        }

        throw new IllegalArgumentException(String.format(FOOD_EXIST,name));
    }

    @Override
    public String addBeverage(String type, int counter, String brand, String name) {
        Beverages beverage;

        if(type.equals("Fresh")){
            beverage = new Fresh(name,counter,brand);
        } else if(type.equals("Smoothie")){
            beverage = new Smoothie(name,counter,brand);
        } else {
            return "Invalid type";
        }

        if(this.beverageRepository.beverageByName(name,brand) == null){
            this.beverageRepository.add(beverage);
            return String.format(BEVERAGE_ADDED,type,brand);
        }

        throw new IllegalArgumentException(String.format(BEVERAGE_EXIST,name));
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        Table table;

        if(type.equals("Indoors")){
            table = new InDoors(tableNumber,capacity);
        } else if(type.equals("InGarden")){
            table = new InGarden(tableNumber,capacity);
        } else {
            return "Invalid type";
        }

        if(this.tableRepository.byNumber(tableNumber) == null){
            this.tableRepository.add(table);
            return String.format(OutputMessages.TABLE_ADDED,tableNumber);
        }

        throw new IllegalArgumentException(String.format(TABLE_IS_ALREADY_ADDED,tableNumber));
    }

    @Override
    public String reserve(int numberOfPeople) {

        Collection<Table> allTables = this.tableRepository.getAllEntities();
        String message = "";
        if(allTables != null){

           /* Table table1 = allTables.stream() another approach with stream
                    .filter(table -> !table.isReservedTable())
                    .findFirst()
                    .orElse(null);

            if(table1 != null){
                table1.reserve(numberOfPeople);
                return String.format(TABLE_RESERVED,table1.getTableNumber(),numberOfPeople);
            }*/

            for(Table table:allTables){

                if(!table.isReservedTable()){

                    if(table.getSize() >= numberOfPeople){

                        table.reserve(numberOfPeople);
                        return String.format(TABLE_RESERVED,table.getTableNumber(),numberOfPeople);
                    } else{
                         message = String.format(OutputMessages.RESERVATION_NOT_POSSIBLE,numberOfPeople);
                    }
                }
            }
        }

        return message;
    }

    @Override
    public String orderHealthyFood(int tableNumber, String healthyFoodName) {

        Table table = tableRepository.byNumber(tableNumber);

        if(table == null){

            return String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber);
        }

        HealthyFood healthyFood = healthFoodRepository.foodByName(healthyFoodName);

        if(healthyFood == null){

            return String.format(NONE_EXISTENT_FOOD,healthyFoodName);
        }

        table.orderHealthy(healthyFood);
        return String.format(FOOD_ORDER_SUCCESSFUL,healthyFoodName,tableNumber);
    }

    @Override
    public String orderBeverage(int tableNumber, String name, String brand) {
        Table table = tableRepository.byNumber(tableNumber);

        if(table == null){

            return String.format(OutputMessages.WRONG_TABLE_NUMBER, tableNumber);
        }

        Beverages beverage = beverageRepository.beverageByName(name,brand);

        if(beverage == null){

            return String.format(NON_EXISTENT_DRINK,name,brand);
        }

        table.orderBeverages(beverage);
        return String.format(OutputMessages.BEVERAGE_ORDER_SUCCESSFUL,name,tableNumber);
    }

    @Override
    public String closedBill(int tableNumber) {

        Table table = tableRepository.byNumber(tableNumber);
        double bill = 0;
        if(table != null){
            bill = table.bill();
            totalMoney +=bill;
            table.clear();
        }
        return String.format(OutputMessages.BILL,tableNumber,bill);
    }


    @Override
    public String totalMoney() {
        return String.format(OutputMessages.TOTAL_MONEY,totalMoney);
    }
}
