package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Appender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Logger;

import java.util.Arrays;

public class MessageLogger implements Logger {

    private final Appender[] appender;


    public MessageLogger(Appender... appender) {
        this.appender = appender;
    }

    @Override
    public void logInfo(String dateTime, String message) {
        log(dateTime,message,ReportLevel.INFO);
    }

    @Override
    public void logWarning(String dateTime, String message) {
        log(dateTime,message,ReportLevel.WARNING);
    }

    @Override
    public void logError(String dateTime, String message) {
        log(dateTime,message,ReportLevel.ERROR);
    }

    @Override
    public void logCritical(String dateTime, String message) {
        log(dateTime,message,ReportLevel.CRITICAL);
    }

    @Override
    public void logFatal(String dateTime, String message) {
        log(dateTime,message,ReportLevel.FATAL);
    }

    private void log(String dateTime, String message,ReportLevel reportLevel){
        Arrays.stream(this.appender).forEach(appender -> appender.append(dateTime,message,reportLevel));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Logger info");

        for(Appender currentAppender : this.appender){
            stringBuilder.append(currentAppender.toString());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
