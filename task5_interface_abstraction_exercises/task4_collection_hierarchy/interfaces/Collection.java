package interview_tasks_paysafe.object_oriented.softuni.java_oop.task5_interface_abstraction_exercises.task4_collection_hierarchy.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection{

    private int maxSize;

    private List<String> list;

    public Collection() {
        this.maxSize = 100;
        this.list = new ArrayList<>();
    }

    public List<String> getList() {
        return list;
    }
}
