package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy;

import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.Collection;
import interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces.MyList;

public class MyListImpl extends Collection implements MyList {
    @Override
    public String remove(String element) {
        return super.getList().remove(0);
    }

    @Override
    public int add(String element) {
        super.getList().add(0,element);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getList().size();
    }
}
