package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Course implements Comparable<Course>, Serializable {
    private Long courseCode;
    private String name;
    private String instructor;
    private Set<Student> students;
    private double grade;

    public Course(Long courseCode, String name, String instructor) {
        this.courseCode = courseCode;
        this.name = name;
        this.instructor = instructor;
        this.students = new TreeSet<>();
    }

    public Long getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Long courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public int compareTo(Course o) {
        int compareNames = this.getName().compareTo(o.getName());

        if(compareNames == 0){
            return this.getCourseCode().compareTo(o.getCourseCode());
        }
        return compareNames;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode=" + courseCode +
                ", name='" + name + '\'' +
                ", instructor='" + instructor + '\'';
    }
}
