package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.appenders;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {


    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String dateTime, String message, ReportLevel reportLevel) {
        if(this.canAppend(reportLevel)) {
            String format = layout.format(dateTime, message, reportLevel);
            this.increaseMessageCount();
            System.out.println(format);
        }
    }
}
