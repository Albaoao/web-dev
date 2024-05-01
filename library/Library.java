import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Book {
    private String title;
    private String author;
    private String isbn;
    private Integer year;
    private Integer quantity;
    private boolean forChildren;

    public Book(String title, String author, String isbn, Integer year, Integer quantity, boolean forChildren) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
        this.forChildren = forChildren;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public boolean isForChildren() {
        return forChildren;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + year + ", Quantity: " + quantity + ", For Children: " + forChildren;
    }
}

class User {
    protected Integer id;
    protected String name;
    protected String surname;
    protected String group;

    public User(Integer id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

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

    public void check() {
        System.out.println("ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Group: " + group);
    }
}

class Student extends User {
    public Student(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    @Override
    public void check() {
        System.out.println("This is a student - ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Group: " + group);
    }
}

class Pupil extends User {
    public Pupil(Integer id, String name, String surname, String group) {
        super(id, name, surname, group);
    }

    @Override
    public void check() {
        System.out.println("This is a pupil - ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Group: " + group);
    }
}

class Library {
    ArrayList<Book> books;
    ArrayList<User> guests;
    private Map<User, ArrayList<Book>> assignments;

    public Library() {
        this.books = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.assignments = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addGuest(User user) {
        guests.add(user);
    }

    public void assignBookToUser(Book book, User user) {
        if (!assignments.containsKey(user)) {
            assignments.put(user, new ArrayList<>());
        }
        assignments.get(user).add(book);
    }

    public void removeBookFromUser(Book book, User user) {
        if (assignments.containsKey(user)) {
            assignments.get(user).remove(book);
        }
    }

    public void printAllBooksAndUsers() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nUsers in the library:");
        for (User user : guests) {
            user.check();
        }
    }

    public void printBooksAssignedToUser(User user) {
        if (assignments.containsKey(user)) {
            System.out.println("Books assigned to " + user.getName() + ":");
            for (Book book : assignments.get(user)) {
                System.out.println(book);
            }
        } else {
            System.out.println(user.getName() + " has not borrowed any books.");
        }
    }
}