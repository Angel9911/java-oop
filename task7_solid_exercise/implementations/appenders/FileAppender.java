package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.appenders;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.LogFile;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.File;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }
    /* public FileAppender(Layout layout, String fileName){
        this(layout);
        this.file = new LogFile(fileName);
    } */

    @Override
    public void append(String dateTime, String message, ReportLevel reportLevel) {
        if(this.canAppend(reportLevel)) {
            String out = this.layout.format(dateTime, message, reportLevel);
            this.increaseMessageCount();
            this.file.append(out);
        }
    }

    public void setFile(File file) {
        this.file = file;
    }
}
