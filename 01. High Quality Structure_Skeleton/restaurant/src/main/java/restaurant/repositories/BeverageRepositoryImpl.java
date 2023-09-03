package restaurant.repositories;

import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.repositories.interfaces.BeverageRepository;

import java.util.*;

public class BeverageRepositoryImpl implements BeverageRepository<Beverages> {
    private List<Beverages> beveragesMap;

    public BeverageRepositoryImpl() {
        this.beveragesMap = new ArrayList<>();
    }

    @Override
    public Beverages beverageByName(String drinkName, String drinkBrand) {
        return beveragesMap.stream()
                .filter(beverage -> beverage.getName().equals(drinkName))
                .filter(beverage -> beverage.getBrand().equals(drinkBrand))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Beverages> getAllEntities() {
        return beveragesMap;
    }

    @Override
    public void add(Beverages entity) {
        this.beveragesMap.add(entity);
    }
}
