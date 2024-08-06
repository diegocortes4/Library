import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove a book
    public void removeBook(Book book) {
        books.remove(book);
    }

    // List all books
    public List<Book> listBooks() {
        return new ArrayList<>(books);
    }
}