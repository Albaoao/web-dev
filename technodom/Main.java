import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private Integer id;
    private String productName;
    private Integer price;
    private Integer quantity;
    private String category;

    public Product(Integer id, String productName, Integer price, Integer quantity, String category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Device ID: " + id);
        System.out.println("Device Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
    }
}

class DiscountedProduct extends Product {
    private Integer discountPercentage;

    public DiscountedProduct(Integer id, String productName, Integer price, Integer quantity, String category, Integer discountPercentage) {
        super(id, productName, price, quantity, category);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Discount Percentage: " + discountPercentage + "%");
    }
}

class SalesManagementSystem {
    private List<Product> products;
    private List<DiscountedProduct> discountedProducts;

    public SalesManagementSystem() {
        this.products = new ArrayList<>();
        this.discountedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addDiscountedProduct(DiscountedProduct discountedProduct) {
        discountedProducts.add(discountedProduct);
    }

    public void displayAllProducts() {
        System.out.println("All Devices:");
        for (Product product : products) {
            product.displayInfo();
        }

        System.out.println("\nDiscounted Devices:");
        for (DiscountedProduct discountedProduct : discountedProducts) {
            discountedProduct.displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SalesManagementSystem salesManagementSystem = new SalesManagementSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Technodom!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Device");
            System.out.println("2. Add Discounted Device");
            System.out.println("3. Display All Devices");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter device ID:");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter device name:");
                    String productName = scanner.nextLine();
                    System.out.println("Enter price:");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter quantity:");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter category:");
                    String category = scanner.nextLine();

                    salesManagementSystem.addProduct(new Product(productId, productName, price, quantity, category));
                    break;
                case 2:
                    System.out.println("Enter device ID:");
                    int discountedProductId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter device name:");
                    String discountedProductName = scanner.nextLine();
                    System.out.println("Enter price:");
                    int discountedPrice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter quantity:");
                    int discountedQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter category:");
                    String discountedCategory = scanner.nextLine();
                    System.out.println("Enter discount percentage:");
                    int discountPercentage = scanner.nextInt();
                    scanner.nextLine();

                    salesManagementSystem.addDiscountedProduct(new DiscountedProduct(discountedProductId, discountedProductName, discountedPrice, discountedQuantity, discountedCategory, discountPercentage));
                    break;
                case 3:
                    salesManagementSystem.displayAllProducts();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option,please choose again:)");
            }
        }
    }
}


