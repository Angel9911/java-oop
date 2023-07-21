package interview_tasks_paysafe.object_oriented.softuni.java_oop.task9_design_patterns.creational_patterns.prototype;

public class Book extends Item{
    private String title;

    public Book(String name, String image, double price) {
        super(name, image, price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                " title='" + title + '\'' +
                '}';
    }
}

