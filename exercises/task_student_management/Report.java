package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.FileNotFoundException;

public interface Report {
    boolean writeFile(Student student);
    Student readFile(String fileName) throws FileNotFoundException;
}
