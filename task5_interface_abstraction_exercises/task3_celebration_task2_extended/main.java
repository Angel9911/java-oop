package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task3_celebration_task2_extended;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> citizenPetList = new ArrayList<>();

        while(!input.equals("End")){
            String[] tokens = input.split(" ");

            String objectType = tokens[0];

            switch (objectType) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];
                    Citizen citizen = new Citizen(name,age,id,birthDate);
                    citizenPetList.add(citizen);
                    break;
                case "Pet":
                    String petName = tokens[1];
                    String petBirthDate = tokens[2];
                    Pet pet = new Pet(petName,petBirthDate);
                    citizenPetList.add(pet);
                    break;
                case "Robot":
                    String robotId = tokens[1];
                    String model = tokens[2];
                    Robot robot = new Robot(robotId,model);
            }

            String year = scanner.nextLine();

            for(Birthable getElement:citizenPetList){
                if(getElement.getBirthDay().endsWith(year)){
                    System.out.println(getElement.getBirthDay());
                }
            }
        }
    }
}
