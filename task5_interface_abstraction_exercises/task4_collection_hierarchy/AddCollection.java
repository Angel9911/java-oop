package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.Addable;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.Collection;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String element) {

        super.getList().add(element);

        return super.getList().indexOf(element);
    }
}
