package restaurant.repositories;

import restaurant.entities.healthyFoods.Food;
import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.repositories.interfaces.HealthFoodRepository;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class HealthFoodRepositoryImpl implements HealthFoodRepository<HealthyFood> {
    private Map<String,HealthyFood> healthyFoodMap;

    public HealthFoodRepositoryImpl() {
        this.healthyFoodMap = new LinkedHashMap<>();
    }

    @Override
    public HealthyFood foodByName(String name) {
        return healthyFoodMap.get(name);
    }

    @Override
    public Collection<HealthyFood> getAllEntities() {
        return this.healthyFoodMap.values();
    }

    @Override
    public void add(HealthyFood entity) {
        this.healthyFoodMap.put(entity.getName(),entity);
    }
}
