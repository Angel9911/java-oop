package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.prototype;

public class Main {
    public static void main(String[] args)  {

        // Implementation of prototype pattern

        /*long start = System.currentTimeMillis();

        long end = System.currentTimeMillis();

        start = System.currentTimeMillis();

        end = System.currentTimeMillis(); */
        Registry register = new Registry();

        Item book = register.getItem("Book");
        book.setName("Change author");
        System.out.println(book);
    }
}
