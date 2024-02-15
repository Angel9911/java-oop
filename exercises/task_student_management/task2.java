package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.CourseNotFoundException;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management.exceptions.StudentNotFoundException;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {

        SchoolClass school = new SchoolClass();

        Course course = new Course(1L,"Programming","Terry");
        Course course2 = new Course(15L,"Electricity","Bojidar");
        Course course3 = new Course(7L,"Architecture","David");

        school.addCourse(course);
        school.addCourse(course2);
        school.addCourse(course3);

        Student student = new Student(2L,"Angel",22);
        Student student2 = new Student(12L,"John",21);
        Student student3 = new Student(34L,"Michael",20);
        Student student4 = new Student(31L,"Michael",20);

        school.addStudent(student);
        school.addStudent(student2);
        school.addStudent(student3);

        student.addCourse(course2);
        student.addCourse(course);

        student2.addCourse(course3);
        student2.addCourse(course2);

        student3.addCourse(course3);
        student3.addCourse(course);


        course.addStudent(student);
        course.addStudent(student3);

        course2.addStudent(student);
        course2.addStudent(student2);

        course3.addStudent(student2);
        course3.addStudent(student3);

        try {
            school.storeStudentInCourse(student,course,5.5);
            school.storeStudentInCourse(student,course2,3.5);
            // school.storeStudentInCourse(student,course3,4.5); // throw CourseNotFoundException: Student Angel is not in Architecture course
            // school.storeStudentInCourse(student4,course3,4.5); // throw StudentNotFoundException: Student not found

        } catch (StudentNotFoundException | CourseNotFoundException e) {
            e.printStackTrace();
        }

        Map<Course, Double> studentCourses = school.getStudentCourses(student);

        studentCourses.forEach(Course::setGrade);

        Set<Course> newStudentCourses = new HashSet<>(studentCourses.keySet());

        newStudentCourses.forEach(student::addCourse);

        System.out.println("Student "+student.getName() + "has courses:");
        student.getCourses().forEach(System.out::println);
        System.out.println("And grade: "+school.calculateGrade(student));
        student.setAverageGrade(school.calculateGrade(student));

        school.getCourses().forEach(System.out::println);
        school.getStudents().forEach(System.out::println);

        System.out.println("Create for this student with name " + student.getName() + " report for his courses");

        WordReportFile wordReportFile = new WordReportFile();
        wordReportFile.setFileName("task2.word");
        wordReportFile.writeFile(student);

    }
}
