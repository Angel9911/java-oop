package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces;

public interface Logger {
    void logInfo(String dateTime, String message);
    void logWarning(String dateTime, String message);
    void logError(String dateTime, String message);
    void logCritical(String dateTime, String message);
    void logFatal(String dateTime, String message);
}
