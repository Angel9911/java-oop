package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.factories;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.MessageLogger;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Appender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Factory;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Logger;

public class LoggerFactory implements Factory<Logger> {
    private AppendFactory appendFactory;
    public LoggerFactory() {
        this.appendFactory = new AppendFactory();
    }

    @Override
    public Logger process(String input) {
        String[] logMessages = input.split(System.lineSeparator());
        Appender[] appenders = new Appender[logMessages.length];

        for(int i=0;i<appenders.length;i++){
            appenders[i] = appendFactory.process(logMessages[i]);
        }

        return new MessageLogger(appenders);
    }
}
