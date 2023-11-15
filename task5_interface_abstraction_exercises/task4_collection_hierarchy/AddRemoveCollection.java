package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.AddRemovable;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.Collection;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public String remove(String element) {
        int lastElement = super.getList().size()-1;
        super.getList().remove(lastElement);
        return element;
    }

    @Override
    public int add(String element) {
        super.getList().add(0,element);
        return 0;
    }
}
