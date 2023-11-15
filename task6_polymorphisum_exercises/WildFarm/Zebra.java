package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public class Zebra extends Mammal{
    public Zebra(String name, String type, Double weight, Integer foodEaten, String region) {
        super(name, type, weight, foodEaten, region);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs!");
    }

    @Override
    protected void eat(Food food) {

    }
}
