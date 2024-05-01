public class Book {
    private String title;
    private String author;
    private String isbn;
    private Integer year;
    private Integer quantity;
    private boolean isForChildren;

    // Constructor
    public Book(String title, String author, String isbn, Integer year, Integer quantity, boolean isForChildren) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.isForChildren = isForChildren;
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

    public boolean isForChildren() {
        return isForChildren;
    }
}
