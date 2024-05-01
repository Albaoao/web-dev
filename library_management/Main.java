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
            System.out.println("3. Assign Book to Student");
            System.out.println("4. Remove Book from Student");
            System.out.println("5. Print All Books and Students");
            System.out.println("6. Print Books Assigned to Student");
            System.out.println("7. Exit");

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
                    library.addBook(new Book(title, author, isbn, year, quantity));
                    break;
                case 2:
                    System.out.println("Enter student ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter student surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Enter student group:");
                    String group = scanner.nextLine();
                    library.addStudent(new Student(id, name, surname, group));
                    break;
                case 3:
                    System.out.println("Enter student ID:");
                    int assignId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String assignIsbn = scanner.nextLine();
                    Student assignStudent = library.students.stream().filter(s -> s.getId() == assignId).findFirst().orElse(null);
                    Book assignBook = library.books.stream().filter(b -> b.getIsbn().equals(assignIsbn)).findFirst().orElse(null);
                    if (assignStudent == null || assignBook == null) {
                        System.out.println("Student or book not found.");
                        break;
                    }
                    library.assignBookToStudent(assignBook, assignStudent);
                    break;
                case 4:
                    System.out.println("Enter student ID:");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String removeIsbn = scanner.nextLine();
                    Student removeStudent = library.students.stream().filter(s -> s.getId() == removeId).findFirst().orElse(null);
                    Book removeBook = library.books.stream().filter(b -> b.getIsbn().equals(removeIsbn)).findFirst().orElse(null);
                    if (removeStudent == null || removeBook == null) {
                        System.out.println("Student or book not found.");
                        break;
                    }
                    library.removeBookFromStudent(removeBook, removeStudent);
                    break;
                case 5:
                    library.printAllBooksAndStudents();
                    break;
                case 6:
                    System.out.println("Enter student ID:");
                    int printId = scanner.nextInt();
                    scanner.nextLine();
                    Student printStudent = library.students.stream().filter(s -> s.getId() == printId).findFirst().orElse(null);
                    if (printStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    library.printBooksAssignedToStudent(printStudent);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
