package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task3_celebration_task2_extended;

public class Pet implements Birthable{

    private String birthDate;

    private String name;

    public Pet(String name,String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getBirthDay() {
        return birthDate;
    }

}
