package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.CourseNotFoundException;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.StudentNotFoundException;

import java.util.*;

public class SchoolClass extends AbstractSchool implements Enrollment,Grade{
    private final Map<Student, Map<Course,Double>> studentsCourses;

    public SchoolClass() {
        super();
        this.studentsCourses = new LinkedHashMap<>();
    }

    @Override
    public void storeStudentInCourse(Student student, Course course, double grade) throws StudentNotFoundException, CourseNotFoundException {
        if(this.findCourse(course)){
            if(this.findStudent(student)) {

                if (student.getCourses().contains(course) && course.getStudents().contains(student)) {
                    Map<Course, Double> courses = studentsCourses.getOrDefault(student, new LinkedHashMap<>());

                    if (!courses.containsKey(course)) {
                        courses.put(course, grade);
                        studentsCourses.put(student, courses);
                    }
                }else{
                    throw new CourseNotFoundException("Student "+student.getName()+" is not in "+ course.getName() +" course");
                }
            }else {
                throw new StudentNotFoundException("Student not found");
            }
        }else{
            throw new CourseNotFoundException("Course not found");
        }
    }

    @Override
    public Double calculateGrade(Student student) {

        if(studentsCourses.containsKey(student) && !studentsCourses.get(student).isEmpty()){

            Map<Course, Double> courses = studentsCourses.get(student);

            double sumAllGrades = courses.values().stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();

            return sumAllGrades/courses.size();
        }
        return null;
    }
}
