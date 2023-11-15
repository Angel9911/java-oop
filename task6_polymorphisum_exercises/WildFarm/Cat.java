package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public class Cat extends Felime{
    private String breed;
    public Cat(String name, String type, Double weight, Integer foodEaten, String region, String breed) {
        super(name, type, weight, foodEaten, region);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww!");
    }
}
