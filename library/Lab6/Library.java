import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // Methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void assignBookToUser(Book book, User user) {
        user.borrowBook(book);
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    public void printAllUsers() {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + " " + user.getSurname() + ", Group: " + user.getGroup());
        }
    }

    public void printBooksAssignedToUser(User user) {
        user.printBorrowedBooks();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
