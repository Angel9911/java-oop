package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public class Mouse extends Mammal{

    public Mouse(String name, String type, Double weight, Integer foodEaten, String region) {
        super(name, type, weight, foodEaten, region);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            throw new IllegalArgumentException("The mouse doesn't eat this type of food");
        }
        super.eat(food);
    }
}
