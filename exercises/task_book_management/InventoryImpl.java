package interview_tasks_paysafe.object_oriented.softuni.java_oop.exercises.task_book_management;

import java.util.*;

public class InventoryImpl implements Inventory{

    private final Map<String,List<Book>> authorBooks;

    public InventoryImpl() {
        this.authorBooks = new LinkedHashMap<>();
    }

    @Override
    public void addBook(Book book) {

        if(book!=null && book.getAuthor()!=null) {

            Author author = book.getAuthor();

            if(author.getFirstName()!=null && author.getLastName()!=null){

                String buildAuthorName = author.getFirstName() + " " + author.getLastName();

                if(authorBooks.containsKey(buildAuthorName)){
                    List<Book> existingBooks = authorBooks.get(buildAuthorName);
                    existingBooks.add(book);
                    authorBooks.put(buildAuthorName,existingBooks);
                }else{
                    List<Book> books = new ArrayList<>();
                    books.add(book);
                    authorBooks.put(buildAuthorName,books);

                }
            }
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        if(book != null && book.getAuthor() != null){

            String buildAuthorName = book.getAuthor().getFirstName() + " " +book.getAuthor().getLastName();

            if(authorBooks.containsKey(buildAuthorName) && !authorBooks.get(buildAuthorName).isEmpty()){

                List<Book> books = authorBooks.get(buildAuthorName);

                if(books.remove(book)){
                    authorBooks.put(buildAuthorName,books);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateBook(Book book, int quantities) {
       if(book != null && authorBooks.containsKey(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName())){

           String buildAuthorName = book.getAuthor().getFirstName() + " " +book.getAuthor().getLastName();

           List<Book> books = authorBooks.get(buildAuthorName);

           Optional<Book> isBookExists = books.stream()
                   .filter(b -> b.getISBN().equals(book.getISBN()))
                   .findFirst();

           if(isBookExists.isPresent()){

               Book getExistedBook = isBookExists.get();
               getExistedBook.setQuantity(quantities);
               return true;
           }
       }
       return false;
    }

    @Override
    public Book findBookByTitle(String title) {
        if(!title.isEmpty()){
            for(String key : authorBooks.keySet()){
                List<Book> books = authorBooks.get(key);
                for(Book book : books){
                    if(book.getTitle().equals(title)){
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Book findBookByISBN(String isbn) {
        if(!isbn.isEmpty()){
            for(String key : authorBooks.keySet()){
                List<Book> books = authorBooks.get(key);
                for(Book book : books){
                    if(book.getISBN().equals(isbn)){
                        return book;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(Author author) {
        if(author != null && authorBooks.containsKey(author.getFirstName()+ " " +author.getLastName())){
            return authorBooks.get(author.getFirstName()+ " " +author.getLastName());
        }
        return null;
    }

    @Override
    public boolean isBookAvailable(Book book) {
        if(book != null){
            for(String author : authorBooks.keySet()){
                List<Book> books = authorBooks.get(author);
                for(Book getBook : books){
                    if(getBook.getISBN().equals(book.getISBN()) && getBook.getQuantity() > 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorBooks() {
        return authorBooks;
    }
}
