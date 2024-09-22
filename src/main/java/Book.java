public class Book {
    private String title;
    private String author;
    private String isbn;
    private String format;  // New field to track if it's hardcover or paperback

    // Constructor
    public Book(String title, String author, String isbn, String format) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.format = format;  // Set the book format (hardcover or paperback)
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getFormat() {  // New getter for the format
        return format;
    }

    // Override toString() to display book details, including the format
    @Override
    public String toString() {
        return "Book{" +
               "title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", isbn='" + isbn + '\'' +
               ", format='" + format + '\'' +  // Display format (hardcover or paperback)
               '}';
    }

    // Override equals() and hashCode() for comparison when removing
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return isbn != null ? isbn.equals(book.isbn) : book.isbn == null;
    }

    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }
}
