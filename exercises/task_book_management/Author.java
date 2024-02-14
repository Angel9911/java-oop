package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person{
    private final List<Book> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
