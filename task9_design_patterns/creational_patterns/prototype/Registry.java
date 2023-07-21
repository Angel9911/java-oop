package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> registryItems;

    public Registry() {
        this.registryItems = new HashMap<>();
        loadTypes();
    }

    public Item getItem(String type){
        try{
            return registryItems.get(type).clone();
        }catch (CloneNotSupportedException e){
            throw new IllegalStateException(e.getMessage());
        }
    }

    public void loadTypes(){
        Book book = new Book("Ivan Vazov","img/src",20.22);
        book.setTitle("Pod igoto");

        registryItems.put("Book", book);

        Music music = new Music("Chalga peperudki","music/src",20);
        music.setDuration(3.20);

        registryItems.put("Music",music);
    }
}
