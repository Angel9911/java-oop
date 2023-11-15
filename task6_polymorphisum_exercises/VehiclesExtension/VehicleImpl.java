package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.VehiclesExtension;

import java.text.DecimalFormat;

public class VehicleImpl implements Vehicle {
    private double fuelLiters;
    private double fuelConsumption;
    private int tankCapacity;

    protected VehicleImpl(double fuelLiters, double fuelConsumption, int tankCapacity) {
        this.fuelLiters = fuelLiters;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
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

    public Integer getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Integer tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String drive(double distance) {
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

        if(liters <= 0){
            System.out.println("Fuel must be a positive number");
        }else if((this.fuelLiters + liters) > this.tankCapacity){
            System.out.println("Cannot fit fuel in tank");
        }
        this.fuelLiters += liters;
    }

    @Override
    public String toString() {
        return String.format(" %s: %.2f",this.getClass().getSimpleName(),this.fuelLiters);
    }
}
