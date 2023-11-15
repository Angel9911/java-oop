package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle{
    private Double fuelLiters;
    private Double fuelConsumption;

    public VehicleImpl(Double fuelLiters, Double fuelConsumption) {
        this.fuelLiters = fuelLiters;
        this.setFuelConsumption(fuelConsumption);
    }

    public void setFuelLiters(Double fuelLiters) {
        this.fuelLiters = fuelLiters;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getFuelLiters() {
        return fuelLiters;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String drive(int distance) {
        String result = null;

        double litersConsumption = distance  * this.getFuelConsumption();

        if (litersConsumption > this.getFuelLiters()) {

            result = this.getClass().getSimpleName()+" needs refueling";
        } else {

            double leftLetters = this.getFuelLiters() - litersConsumption;
            this.setFuelLiters(leftLetters);
            DecimalFormat formatter = new DecimalFormat("##.##");
            result =String.format("%s travelled %s km", this.getClass().getSimpleName(), formatter.format(distance));
        }

        return result;
    }

    @Override
    public void refuel(double liters) {
        this.fuelLiters += liters;
    }

    @Override
    public String toString() {
        return String.format(" %s: %.2f",this.getClass().getSimpleName(),this.fuelLiters);
    }
}
