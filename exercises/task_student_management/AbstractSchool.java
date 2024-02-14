package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import java.util.Set;
import java.util.TreeSet;

public abstract class AbstractSchool implements School{
    private final Set<Student> students;
    private final Set<Course> courses;

    public AbstractSchool() {
        this.students = new TreeSet<>();
        this.courses = new TreeSet<>();
    }

    @Override
    public void addStudent(Student student) {
        if(student != null){
            students.add(student);
        }
    }

    @Override
    public void addCourse(Course course) {
        if(course != null){
            courses.add(course);
        }
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public boolean findStudent(Student student) {
        return students.contains(student);
    }

    public boolean findCourse(Course course) {
        return courses.contains(course);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Course> getCourses() {
        return courses;
    }
}
