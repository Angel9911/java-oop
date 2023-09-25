package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.layouts;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class SimpleLayout implements Layout {
    @Override
    public String format(String dateTime, String message, ReportLevel reportLevel) {
        return String.format("%s - %s - %s",dateTime,reportLevel,message);
    }
}
