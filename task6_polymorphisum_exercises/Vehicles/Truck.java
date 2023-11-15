package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Vehicles;

public class Truck extends VehicleImpl {
    private static final double AC_COND_CONSUMPTION = 1.6;
    private static final double REFUEL_PERCENTAGE = 0.95;

    public Truck(double liters, double fuelConsumption) {
        super(liters, fuelConsumption);
    }


    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption+AC_COND_CONSUMPTION);
    }


    @Override
    public void refuel(double liters) {
        super.refuel(liters * REFUEL_PERCENTAGE);
    }
}


