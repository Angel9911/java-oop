package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

import java.util.List;

public class Order {
    private static Inventory inventory;
    private static Cart cart;

    public static void makeOrder(Customer customer, List<Book> orderedBooks){
        double totalPrice = 0.0;
        if(!orderedBooks.isEmpty()){
            for(Book book : orderedBooks){
                if(inventory.updateBook(book,book.getQuantity()-1)){
                    totalPrice += book.getPrice();
                }
            }
        }
        cart.clearAll();

        System.out.printf("The customer: %s %s with email %s and address %s made order: "+customer.getFirstName(), customer.getLastName(),customer.getEmail(),customer.getAddress());
        orderedBooks.forEach(System.out::println);
        System.out.println("And the total price is : "+totalPrice);
    }

}
