package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.CommandPattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        Swtich switchInvoker = new Swtich();

        switchInvoker.storeExecuteLamp(new LightOn(lamp));
        switchInvoker.storeExecuteLamp(new LightOff(lamp));

        switchInvoker.undoCommandExecute();
        // add new functionality
        System.out.println("turns all lamps on");
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();
        Lamp lamp3 = new Lamp();

        switchInvoker.storeExecuteLamp(new TurnAllLampsOn(Arrays.asList(lamp1,lamp2,lamp3)));
    }
}
