package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.CommandPattern;

import java.util.List;

public class TurnAllLampsOn implements Command{
    private final List<Lamp> lamps;

    public TurnAllLampsOn(List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for(Lamp lamp : lamps){
            lamp.on();
        }
    }
}
