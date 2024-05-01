import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;
    private Integer year;
    private Integer quantity;

    public Book(String title, String author, String isbn, Integer year, Integer quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + year + ", Quantity: " + quantity;
    }
}

class Student {
    private Integer id;
    private String name;
    private String surname;
    private String group;
    private ArrayList<Book> borrowedBooks;

    public Student(Integer id, String name, String surname, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.borrowedBooks = new ArrayList<>();
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

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Group: " + group;
    }
}

class Library {
    ArrayList<Book> books;
    ArrayList<Student> students;
    private Map<Student, ArrayList<Book>> assignments;

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.assignments = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignBookToStudent(Book book, Student student) {
        if (!assignments.containsKey(student)) {
            assignments.put(student, new ArrayList<>());
        }
        assignments.get(student).add(book);
    }

    public void removeBookFromStudent(Book book, Student student) {
        if (assignments.containsKey(student)) {
            assignments.get(student).remove(book);
        }
    }

    public void printAllBooksAndStudents() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nStudents in the library:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printBooksAssignedToStudent(Student student) {
        if (assignments.containsKey(student)) {
            System.out.println("Books assigned to " + student.getName() + ":");
            for (Book book : assignments.get(student)) {
                System.out.println(book);
            }
        } else {
            System.out.println(student.getName() + " has not borrowed any books.");
        }
    }
}