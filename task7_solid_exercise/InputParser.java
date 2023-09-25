package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise;

import java.util.Scanner;

public class InputParser {


    public String readLoggerInfo(Scanner scanner){
        int n =Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();

        while (n-- > 0){

            stringBuilder.append(scanner.nextLine()).append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
