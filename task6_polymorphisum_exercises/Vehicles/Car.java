package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Vehicles;

public class Car extends VehicleImpl {
    private static final double airConditConsump = 0.9;


    public Car(double liters, double fuelConsumption) {
        super(liters, fuelConsumption);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + airConditConsump);
    }


}
