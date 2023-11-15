package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public class Tiger extends Felime{
    public Tiger(String name, String type, Double weight, Integer foodEaten, String region) {
        super(name, type, weight, foodEaten, region);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Vegetable){
            throw new IllegalArgumentException("The tiger doesn't eat this type of food");
        }
        super.eat(food);
    }
}
