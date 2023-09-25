package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.layouts;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class XmlLayout implements Layout {
    @Override
    public String format(String dateTime, String message, ReportLevel reportLevel) {
        return String.format("<log>%n <date>%s</date>%n <level>%s</level>%n <message>%s</message>%n </log>"
        ,dateTime
        ,reportLevel
        ,message);
    }
}
