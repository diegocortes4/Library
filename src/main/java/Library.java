import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    // Sort books by title
    public List<Book> sortByTitle() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, Comparator.comparing(Book::getTitle));
        return sortedBooks;
    }

    // Sort books by author
    public List<Book> sortByAuthor() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, Comparator.comparing(Book::getAuthor));
        return sortedBooks;
    }

    // Sort books by publication year
    public List<Book> sortByYear() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, Comparator.comparingInt(Book::getPublicationYear));
        return sortedBooks;
    }
}
