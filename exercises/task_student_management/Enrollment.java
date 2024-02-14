package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.CourseNotFoundException;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.StudentNotFoundException;

public interface Enrollment {
    void storeStudentInCourse(Student student, Course course, double grade) throws StudentNotFoundException, CourseNotFoundException;
}
