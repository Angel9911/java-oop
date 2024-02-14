package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

public class Book {
    private String title;
    private Author author;
    private String ISBN;
    private Double price;
    private int quantity;

    public Book(String title, Author author, String isbn, Double price, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price ;
    }
}
