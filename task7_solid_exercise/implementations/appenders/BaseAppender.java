package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.appenders;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.enums.ReportLevel;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Appender;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private static final ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;
    private ReportLevel reportLevel;
    private int messageCount = 0;
    protected Layout layout;

    public BaseAppender(Layout layout) {
        this(layout,DEFAULT_REPORT_LEVEL);
    }

    public BaseAppender(Layout layout, ReportLevel reportLevel){
        this.layout = layout;
        this.reportLevel = reportLevel;
        this.messageCount = 0;
    }

    public boolean canAppend(ReportLevel reportLevel){
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    public void increaseMessageCount(){
        this.messageCount++;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, reportLevel: %s, layout type: %s, message appender: %d"
        ,this.getClass().getSimpleName(),this.reportLevel, this.layout.getClass().getSimpleName(), this.messageCount);
    }
}
