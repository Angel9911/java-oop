package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String name, String type, Double weight, Integer foodEaten, String region) {
        super(name, type, weight, foodEaten);
        this.livingRegion = region;
    }

    public String getLivingRegion() {
        return livingRegion;
    }
}
