package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

import java.util.List;
import java.util.Map;

public interface Inventory {

    void addBook(Book book);
    boolean deleteBook(Book book);
    boolean updateBook(Book book, int quantities);
    Book findBookByTitle(String title);
    Book findBookByISBN(String isbn);
    List<Book> findBooksByAuthor(Author author);
    boolean isBookAvailable(Book book);
    Map<String, List<Book>> getAuthorBooks();
}
