package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.VehiclesExtension;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleExtensionMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] readConsole = scanner.nextLine().split(" ");

        double carFuelLiters = Double.parseDouble(readConsole[1]);
        double carConsumption = Double.parseDouble(readConsole[2]);
        int carCapacity = Integer.parseInt(readConsole[3]);

        Vehicle car = new Car(carFuelLiters,carConsumption,carCapacity);

        readConsole = scanner.nextLine().split(" ");

        double truckFuelLiters = Double.parseDouble(readConsole[1]);
        double truckConsumption = Double.parseDouble(readConsole[2]);
        int truckCapacity = Integer.parseInt(readConsole[3]);

        Vehicle truck = new Truck(truckFuelLiters,truckConsumption,truckCapacity);

        readConsole = scanner.nextLine().split(" ");

        double busFuelLiters = Double.parseDouble(readConsole[1]);
        double busConsumption = Double.parseDouble(readConsole[2]);
        int busCapacity = Integer.parseInt(readConsole[3]);

        Vehicle bus = new Bus(busFuelLiters,busConsumption,busCapacity);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car",car);
        vehicles.put("Truck",truck);
        vehicles.put("Bus",bus);

        int countCommands = Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=countCommands;i++) {

            String[] readCommands = scanner.nextLine().split(" ");

            String commandType = readCommands[0];
            String vehicleType = readCommands[1];
            Vehicle vehicle = vehicles.get(vehicleType);
            try {
                switch (commandType) {
                    case "Drive" -> {
                        double distance = Double.parseDouble(readCommands[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicle.drive(distance));
                    }
                    case "Refuel" -> {
                        double liters = Double.parseDouble(readCommands[2]);
                        vehicle.refuel(liters);
                    }
                    case "DriveEmpty" -> {
                        double driveEmptyBusDistance = Double.parseDouble(readCommands[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(true);
                        }
                        System.out.println(vehicle.drive(driveEmptyBusDistance));
                    }
                }
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
