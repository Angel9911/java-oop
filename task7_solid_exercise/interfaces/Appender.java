package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;

public interface Appender {
    void append(String dateTime, String message, ReportLevel reportLevel);
    void setReportLevel(ReportLevel reportLevel);
}
