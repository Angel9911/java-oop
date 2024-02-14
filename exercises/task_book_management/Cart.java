package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

public interface Cart {
    void add(Book book);
    void remove(Book book);
    void clearAll();
    double getTotalPrice();
}
