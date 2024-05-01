import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Student");
            System.out.println("3. Add Pupil");
            System.out.println("4. Assign Book to User");
            System.out.println("5. Remove Book from User");
            System.out.println("6. Print All Books and Users");
            System.out.println("7. Print Books Assigned to User");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter author name:");
                    String author = scanner.nextLine();
                    System.out.println("Enter ISBN:");
                    String isbn = scanner.nextLine();
                    System.out.println("Enter publication year:");
                    int year = scanner.nextInt();
                    System.out.println("Enter quantity:");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Is the book for children? (true/false):");
                    boolean forChildren = scanner.nextBoolean();
                    scanner.nextLine();
                    library.addBook(new Book(title, author, isbn, year, quantity, forChildren));
                    break;
                case 2:
                    System.out.println("Enter student ID:");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter student surname:");
                    String studentSurname = scanner.nextLine();
                    System.out.println("Enter student group:");
                    String studentGroup = scanner.nextLine();
                    library.addGuest(new Student(studentId, studentName, studentSurname, studentGroup));
                    break;
                case 3:
                    System.out.println("Enter pupil ID:");
                    int pupilId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter pupil name:");
                    String pupilName = scanner.nextLine();
                    System.out.println("Enter pupil surname:");
                    String pupilSurname = scanner.nextLine();
                    System.out.println("Enter pupil group:");
                    String pupilGroup = scanner.nextLine();
                    library.addGuest(new Pupil(pupilId, pupilName, pupilSurname, pupilGroup));
                    break;
                case 4:
                    System.out.println("Enter user ID:");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String bookIsbn = scanner.nextLine();
                    User assignUser = library.guests.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
                    Book assignBook = library.books.stream().filter(b -> b
                            .getIsbn().equals(bookIsbn)).findFirst().orElse(null);
                    if (assignUser == null || assignBook == null) {
                        System.out.println("User or book not found.");
                        break;
                    }
                    if (assignUser instanceof Pupil && !assignBook.isForChildren()) {
                        System.out.println("Pupils can only borrow books labeled for children.");
                        break;
                    }
                    library.assignBookToUser(assignBook, assignUser);
                    break;
                case 5:
                    System.out.println("Enter user ID:");
                    int removeUserId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String removeBookIsbn = scanner.nextLine();
                    User removeUser = library.guests.stream().filter(u -> u.getId() == removeUserId).findFirst().orElse(null);
                    Book removeBook = library.books.stream().filter(b -> b.getIsbn().equals(removeBookIsbn)).findFirst().orElse(null);
                    if (removeUser == null || removeBook == null) {
                        System.out.println("User or book not found.");
                        break;
                    }
                    library.removeBookFromUser(removeBook, removeUser);
                    break;
                case 6:
                    library.printAllBooksAndUsers();
                    break;
                case 7:
                    System.out.println("Enter user ID:");
                    int printUserId = scanner.nextInt();
                    scanner.nextLine();
                    User printUser = library.guests.stream().filter(u -> u.getId() == printUserId).findFirst().orElse(null);
                    if (printUser == null) {
                        System.out.println("User not found.");
                        break;
                    }
                    library.printBooksAssignedToUser(printUser);
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}