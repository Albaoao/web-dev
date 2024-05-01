import java.util.ArrayList;

// User.java
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public User(Integer id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to assign a book to the user
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to print borrowed books
    public void printBorrowedBooks() {
        System.out.println("\nBooks borrowed by " + name + " " + surname + ":");
        if (!borrowedBooks.isEmpty()) {
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        } else {
            System.out.println("No books borrowed by this user.");
        }
    }

    // Method to check if the user is a student or pupil
    public void check() {
        if (id >=10000 && id <20000){
            System.out.println("This is pupil");
        }else if(id >= 20000){
            System.out.println("This is student");
        }else{
            System.out.println("Invalid ID");
        }
    }
}