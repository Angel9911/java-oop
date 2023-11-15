package interview_tasks_paysafe.object_oriented.softuni.java_oop.task6_polymorphisum_exercises.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] readConsole = scanner.nextLine().split(" ");

        double carFuelLiters = Double.parseDouble(readConsole[1]);
        double carConsumption = Double.parseDouble(readConsole[2]);

        Vehicle car = new Car(carFuelLiters,carConsumption);

        readConsole = scanner.nextLine().split(" ");

        double truckFuelLiters = Double.parseDouble(readConsole[1]);
        double truckConsumption = Double.parseDouble(readConsole[2]);

        Vehicle truck = new Truck(truckFuelLiters,truckConsumption);

        Map<String,Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car",car);
        vehicles.put("Truck",truck);

        int countCommands = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<countCommands;i++){

            String[] readCommands = scanner.nextLine().split(" ");

            String commandType = readCommands[0];
            String vehicleType = readCommands[1];


            switch (commandType) {
                case "Drive" -> {
                    int distance = Integer.parseInt(readCommands[2]);
                    System.out.println(vehicles.get(vehicleType).drive(distance));
                }
                case "Refuel" -> {
                    double liters = Double.parseDouble(readCommands[2]);
                    vehicles.get(vehicleType).refuel(liters);
                }
            }
        }

        vehicles.values().forEach(System.out::println);
    }
}
