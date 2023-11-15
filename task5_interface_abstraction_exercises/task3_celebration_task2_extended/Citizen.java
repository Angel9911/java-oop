package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task3_celebration_task2_extended;

public class Citizen implements Person, Identifiable, Birthable {

    private String name;
    private int age;
    private String idCard;
    private String birthDay;

    public Citizen(String name, int age, String idCard, String birthDay) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String getId() {
        return idCard;
    }
}
