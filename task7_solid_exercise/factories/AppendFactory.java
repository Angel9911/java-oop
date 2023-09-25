package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.factories;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.appenders.ConsoleAppender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.appenders.FileAppender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Appender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Factory;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class AppendFactory implements Factory<Appender> {

    private Appender appender;

    @Override
    public Appender process(String input) {
        LayoutFactory layoutFactory = new LayoutFactory();
        String[] tokens = input.split(" ");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        appender = null;
        Layout layout = layoutFactory.process(layoutType);
        if(appenderType.equals("ConsoleAppender")){

            appender = new ConsoleAppender(layout);
        }else if(appenderType.equals("FileAppender")){

            appender = new FileAppender(layout);
        }
        if(tokens.length >= 3) {
            String reportLevel = tokens[2];
            if (!reportLevel.isEmpty()) {
                appender.setReportLevel(ReportLevel.valueOf(reportLevel));
            }
        }
        return appender;
    }
}
