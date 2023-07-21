package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.behavioral_patterns.CommandPattern;

import java.util.ArrayDeque;

public class Swtich {
    private final ArrayDeque<Command> historyCommands ;

    public Swtich() {
        this.historyCommands = new ArrayDeque<>();
    }

    public void storeExecuteLamp(Command command){
        this.historyCommands.push(command);
        command.execute();
    }

    public void undoCommandExecute(){
        this.historyCommands.pop();
        Command command = this.historyCommands.peek();
        if(command!=null){
            command.execute();
        }
    }
}
