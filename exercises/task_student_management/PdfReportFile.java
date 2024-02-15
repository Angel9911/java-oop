package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

public class PdfReportFile implements Report{
    @Override
    public boolean writeFile(Student student) {
        return false;
    }

    @Override
    public Student readFile(String fileName) {
        return null;
    }
}
