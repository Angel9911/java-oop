package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.WildFarm;

public abstract class Animal {
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;

    public Animal(String name, String type, Double weight, Integer foodEaten) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten = foodEaten;
    }

    protected abstract void makeSound();
    protected void eat(Food food){
        this.foodEaten += food.getQuantity();
    }

}
