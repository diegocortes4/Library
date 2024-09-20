import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String biography;
    private List<Book> books; // List to store the books by the author

    // Constructor
    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
        this.books = new ArrayList<>(); // Initialize the books list
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Book> getBooks() {
        return books;
    }

    // Method to add a book to the author's book list
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Method to remove a book from the author's book list
    public void removeBook(Book book) {
        this.books.remove(book);
    }

    // Method to display all books written by the author
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println(name + " has not written any books yet.");
        } else {
            System.out.println(name + "'s books:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    // Overriding toString to include author's details and books
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author: ").append(name).append("\n");
        sb.append("Biography: ").append(biography).append("\n");

        if (!books.isEmpty()) {
            sb.append("Books written: \n");
            for (Book book : books) {
                sb.append("- ").append(book.getTitle()).append("\n");
            }
        } else {
            sb.append("No books written yet.");
        }

        return sb.toString();
    }
}
