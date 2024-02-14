package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Cart{
    private double totalPrice;
    private final Inventory inventory;
    private final List<Book> temporaryBooks;

    public ShoppingCart() {
        this.temporaryBooks = new ArrayList<>();
        this.inventory = new InventoryImpl();
    }

    @Override
    public void add(Book book) {
        if(inventory.isBookAvailable(book)){
            temporaryBooks.add(book);
        }
    }

    @Override
    public void remove(Book book) {
        temporaryBooks.remove(book);
    }

    @Override
    public void clearAll() {
        this.temporaryBooks.clear();
    }

    @Override
    public double getTotalPrice() {
        if(!temporaryBooks.isEmpty()){

            this.totalPrice = temporaryBooks.stream()
                    .filter(book -> book.getPrice() != null)
                    .mapToDouble(Book::getPrice)
                    .sum();
        }
        return this.totalPrice;
    }
}
