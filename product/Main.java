import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter barcode:");
            int barcode = scanner.nextInt();
            System.out.println("Enter regular price:");
            int price = scanner.nextInt();
            scanner.nextLine();
            if (i < 2) {
                System.out.println("Enter type of TV:");
                String typeTV = scanner.nextLine();
                System.out.println("Enter screen Size:");
                double screenSize = scanner.nextDouble();
                scanner.nextLine();
                products[i] = new TV(barcode, price, typeTV, screenSize);
            } else if (i < 4) {
                System.out.println("Enter title of Book:");
                String title = scanner.nextLine();
                System.out.println("Enter publisher:");
                String publisher = scanner.nextLine();
                System.out.println("Enter published year:");
                int yearPublished = scanner.nextInt();
                scanner.nextLine();
                products[i] = new Book(barcode, price, title, publisher, yearPublished);
            } else {
                System.out.println("Enter title of children Book:");
                String title = scanner.nextLine();
                System.out.println("Enter publisher:");
                String publisher = scanner.nextLine();
                System.out.println("Enter Published year:");
                int yearPublished = scanner.nextInt();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                scanner.nextLine();
                products[i] = new ChildrenBook(barcode, price, title, publisher, yearPublished, age);
            }
        }

        for (Product product : products) {
            System.out.println("Price: " + product.computeSalePrice() + ", Barcode: " + product.barcode);
        }

        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.computeSalePrice();
        }
        System.out.println("Total price of all products: " + totalPrice);

        int totalAge = 0;
        int childrenBooksCount = 0;
        for (Product product : products) {
            if (product instanceof ChildrenBook && ((ChildrenBook) product).age < 12) {
                totalAge += ((ChildrenBook) product).age;
                childrenBooksCount++;
            }
        }
        double averageAge = (double) totalAge / childrenBooksCount;
        System.out.println("Average age of children's books: " + averageAge);

        scanner.close();
    }
}
