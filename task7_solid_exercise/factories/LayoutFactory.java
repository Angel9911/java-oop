package interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.factories;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.layouts.SimpleLayout;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.implementations.layouts.XmlLayout;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Factory;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task7_solid_exercise.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout process(String input) {
        Layout layout = null;
        if(input.equals("SimpleLayout")){
            layout = new SimpleLayout();
        }else if(input.equals("XmlLayout")){
            layout = new XmlLayout();
        }
        return layout;
    }
}
