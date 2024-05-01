import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add a book from the console
        System.out.println("Enter book details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Read newline after nextInt
        System.out.print("Is for children? (yes/no): ");
        String forChildren = scanner.nextLine();
        boolean isForChildren = forChildren.equalsIgnoreCase("yes");
        Book newBook = new Book(title, author, isbn, year, quantity, isForChildren);
        library.addBook(newBook);

        // Add a user from the console
        System.out.println("\nEnter user details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.print("ID (5 digits starting with 1 for pupil or 2 for student): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Read newline after nextInt
        System.out.print("Group: ");
        String group = scanner.nextLine();
        User newUser = createUserById(id, name, surname, group);
        if (newUser != null) {
            library.addUser(newUser);
        } else {
            System.out.println("Invalid user ID.");
            scanner.close();
            return;
        }

        // Assign a book to a user from the console
        System.out.println("\nAssign a book to a user:");
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Read newline after nextInt
        System.out.print("Enter book ISBN: ");
        String bookIsbn = scanner.nextLine();
        User user = findUserById(library, userId);
        Book book = findBookByIsbn(library, bookIsbn);
        if (user != null && book != null) {
            if (user instanceof Pupil && !book.isForChildren()) {
                System.out.println("Pupils can only borrow books labeled 'for children'.");
            } else {
                library.assignBookToUser(book, user);
                System.out.println("Book assigned to user.");
            }
        } else {
            System.out.println("User or book not found.");
        }

        // Print information about all books and users in the library
        System.out.println("\nInformation about all books in the library:");
        library.printAllBooks();
        System.out.println("\nInformation about all users in the library:");
        library.printAllUsers();

        // Print books assigned to a specific user
        System.out.print("\nEnter user ID to print their borrowed books: ");
        userId = scanner.nextInt();
        scanner.nextLine(); // Read newline after nextInt
        user = findUserById(library, userId);
        if (user != null) {
            library.printBooksAssignedToUser(user);
        } else {
            System.out.println("User not found.");
        }

        // Check if a user is a student or pupil
        System.out.print("\nEnter user ID to check if they are a student or pupil: ");
        userId = scanner.nextInt();
        scanner.nextLine(); // Read newline after nextInt
        user = findUserById(library, userId);
        if (user != null) {
            user.check();
        } else {
            System.out.println("User not found.");
        }

        scanner.close();
    }

    // Method to create user by ID
    private static User createUserById(int id, String name, String surname, String group) {
        if (id >= 20000) {
            return new Student(id, name, surname, group);
        } else if (id >= 10000 && id < 20000) {
            return new Pupil(id, name, surname, group);
        } else {
            return null;
        }
    }

    // Method to find a user by ID
    private static User findUserById(Library library, int id) {
        if (library != null && library.getUsers() != null) {
            for (User user : library.getUsers()) {
                if (user != null && user.getId() == id) {
                    return user;
                }
            }
        }
        return null;
    }

    // Method to find a book by ISBN
    private static Book findBookByIsbn(Library library, String isbn) {
        if (library != null && library.getBooks() != null) {
            for (Book book : library.getBooks()) {
                if (book != null && book.getIsbn().equals(isbn)) {
                    return book;
                }
            }
        }
        return null;
    }
}
