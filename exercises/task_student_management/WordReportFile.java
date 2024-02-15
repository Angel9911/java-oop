package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_student_management;

import java.io.*;

public class WordReportFile implements Report{
    private final String PATH_REPORTS;
    private String fileName;

    public WordReportFile() {
        this.PATH_REPORTS = "E:\\Programs\\SpringAngularProject\\angular7-springboot-crud-tutorial-master\\Interview-tasks\\src\\interview_tasks_paysafe\\object_oriented\\softuni\\java_oop\\exercises\\task_student_management\\reports\\";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean writeFile(Student student) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.PATH_REPORTS + fileName))){
            if(student != null && !student.getCourses().isEmpty()){
                bufferedWriter.write("      Student report \n");
                String studentData = String.format(" Student information: Student with name %s, age %d and id %d", student.getName(), student.getAge(), student.getId());
                bufferedWriter.write("Student Information: "+studentData + "\n\n");
                bufferedWriter.write("Courses ");
                bufferedWriter.write("Grades\n");
                student.getCourses().forEach(course -> {
                    try {
                        bufferedWriter.write(course.getName() + " ");
                        bufferedWriter.write(course.getGrade() + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                bufferedWriter.write("   And Average grade: "+student.getAverageGrade());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Student readFile(String fileName){
        if(!fileName.isEmpty()){

        }
        return null;
    }
}
