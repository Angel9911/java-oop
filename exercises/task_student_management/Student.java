package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student implements Comparable<Student>, Serializable {
    private Long id;
    private String name;
    private int age;
    private Set<Course> courses;

    private double averageGrade;

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new LinkedHashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public Set<Course> getCourses() {
        return courses;
    }

    @Override
    public int compareTo(Student o) {
        int compareNames = this.getName().compareTo(o.getName());

        if(compareNames == 0){
            return Long.compare(this.getId(),o.getId());
        }

        return compareNames;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age ;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
