package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.CommandPattern;

public class LightOff implements Command{
    private final Lamp lamp;

    public LightOff(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.off();
    }
}
