package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.VehiclesExtension;

public class Bus extends VehicleImpl {
    private static final double AC_COND_CONSUMPTION = 1.4;
    private boolean isEmpty;

    public Bus(double fuelLiters, double fuelConsumption, int tankCapacity) {
        super(fuelLiters, fuelConsumption, tankCapacity);
        isEmpty = true;
    }

    public void setEmpty(boolean empty) {
        if(this.isEmpty && !empty){
            super.setFuelConsumption(super.getFuelConsumption() + AC_COND_CONSUMPTION);
        }
        if(!isEmpty && empty){
            super.setFuelConsumption(super.getFuelConsumption()-AC_COND_CONSUMPTION);
        }
        this.isEmpty = empty;
    }

//    @Override
//    public void setFuelConsumption(double fuelConsumption) {
//        if(!this.isEmpty){
//            super.setFuelConsumption(fuelConsumption+AC_COND_CONSUMPTION);
//        }
//    }
}
