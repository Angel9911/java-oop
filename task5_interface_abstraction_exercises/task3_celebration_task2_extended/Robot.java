package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task3_celebration_task2_extended;

public class Robot implements Identifiable{

    private String id;

    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return null;
    }
}
