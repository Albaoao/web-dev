import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Enum representing different types of shipment
enum ShipmentType {
    REGULAR(0, 7),
    EXPRESS(0.02, 3),
    SUPER_EXPRESS(0.08, 1);

    private final double costPercentage;
    private final int deliveryDays;

    ShipmentType(double costPercentage, int deliveryDays) {
        this.costPercentage = costPercentage;
        this.deliveryDays = deliveryDays;
    }

    public double getCostPercentage() {
        return costPercentage;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }
}

// Abstract class representing a user
abstract class User {
    private Integer id;
    private String name;
    private String surname;
    private Double balance;
    private List<Order> orderHistory;

    public User(Integer id, String name, String surname, Double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.orderHistory = new ArrayList<>();
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

    public Double getBalance() {
        return balance;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void addToOrderHistory(Order order) {
        orderHistory.add(order);
    }

    public abstract Double getCashback();

    public abstract void updateStatus();
}

// Class representing an ordinary user
class OrdinaryUser extends User {
    private int orderCount;

    public OrdinaryUser(Integer id, String name, String surname, Double balance) {
        super(id, name, surname, balance);
        this.orderCount = 0;
    }

    @Override
    public Double getCashback() {
        return 0.0;
    }

    @Override
    public void updateStatus() {
        if (orderCount > 10) {
            orderCount = 0;
            System.out.println(getName() + " " + getSurname() + " has become a Prime User.");
        }
    }

    public void increaseOrderCount() {
        orderCount++;
        updateStatus();
    }
}

// Class representing a prime user
class PrimeUser extends User {
    private Double cashback;

    public PrimeUser(Integer id, String name, String surname, Double balance) {
        super(id, name, surname, balance);
        this.cashback = 0.0;
    }

    @Override
    public Double getCashback() {
        return cashback;
    }

    @Override
    public void updateStatus() {
        if (cashback > 40000) {
            System.out.println(getName() + " " + getSurname() + " has become a Loyal User.");
        }
    }

    public void addCashback(Double amount) {
        cashback += amount;
        updateStatus();
    }
}

// Class representing a loyal user
class LoyalUser extends User {
    private Double cashback;

    public LoyalUser(Integer id, String name, String surname, Double balance, Double cashback) {
        super(id, name, surname, balance);
        this.cashback = cashback;
    }

    @Override
    public Double getCashback() {
        return cashback;
    }

    @Override
    public void updateStatus() {
        // Loyal users cannot change their status
    }
}

// Class representing a product
class Product {
    private Integer id;
    private String name;
    private Integer quantity;
    private Double price;

    public Product(Integer id, String name, Integer quantity, Double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }
}

// Class representing an order
class Order {
    private Integer userId;
    private String productName;
    private Integer quantity;
    private ShipmentType shipmentType;

    public Order(Integer userId, String productName, Integer quantity, ShipmentType shipmentType) {
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
        this.shipmentType = shipmentType;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public ShipmentType getShipmentType() {
        return shipmentType;
    }
}

// Main class representing the sales management system
public class technosales {
    private List<Product> products; // List of products
    private List<User> users; // List of users
    private List<Order> orders; // List of orders
    private Map<Integer, Integer> productCounts; // Map to store product counts
    private Scanner scanner; // Scanner for user input

    // Constructor to initialize lists and scanner
    public technosales() {
        products = new ArrayList<>();
        users = new ArrayList<>();
        orders = new ArrayList<>();
        productCounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a product to the system
    public void addProduct(Product product) {
        products.add(product);
        productCounts.put(product.getId(), product.getQuantity());
    }

    // Method to add a user to the system
    public void addUser(User user) {
        users.add(user);
    }

    // Method to add an order to the system
    public void addOrder(Integer userId, Integer productId, Integer quantity, ShipmentType shipmentType) {
        Product product = products.stream()
                .filter(p -> p.getId().equals(productId))
                .findFirst()
                .orElse(null);

        if (product == null) {
            System.out.println("Product not found. Order canceled.");
            return;
        }

        if (product.getQuantity() <= 0) {
            System.out.println("Product is out of stock. Order canceled.");
            return;
        }

        User orderedUser = users.stream()
                .filter(u -> u.getId().equals(userId))
                .findFirst()
                .orElse(null);

        if (orderedUser == null) {
            System.out.println("User not found. Order canceled.");
            return;
        }

        double orderPrice = product.getPrice() * quantity;

        if (orderedUser.getBalance() < orderPrice) {
            System.out.println("Insufficient balance. Order canceled.");
            return;
        }

        if (orderedUser instanceof PrimeUser && quantity > 1) {
            orderPrice *= (1 - 0.05);
        }

        orders.add(new Order(userId, product.getName(), quantity, shipmentType));
        orderedUser.addToOrderHistory(new Order(userId, product.getName(), quantity, shipmentType));
        orderedUser.updateStatus();

        int remainingQuantity = product.getQuantity() - quantity;
        productCounts.put(productId, remainingQuantity);
    }

    // Method to get the list of products
    public List<Product> getProducts() {
        return products;
    }

    // Method to get the list of users
    public List<User> getUsers() {
        return users;
    }

    // Method to get the list of orders
    public List<Order> getOrders() {
        return orders;
    }

    // Method to display the current state of the system
    public void displayProgress() {
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.getId() + " - " + product.getName() + " - Quantity: " + product.getQuantity() +
                    " - Price: " + product.getPrice());
        }

        System.out.println("\nUsers:");
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName() + " " + user.getSurname() +
                    " - Balance: " + user.getBalance() + " - Cashback: " + user.getCashback());
        }

        System.out.println("\nOrders:");
        for (Order order : orders) {
            System.out.println("User ID: " + order.getUserId() + " - Product Name: " + order.getProductName() +
                    " - Quantity: " + order.getQuantity() + " - Shipment Type: " + order.getShipmentType());
        }
    }

    // Main method to run the sales management system
    public static void main(String[] args) {
        technosales system = new technosales();
        system.run();
    }

    // Method to handle the user interface
    public void run() {
        while (true) {
            System.out.println("\nSelect option:");
            System.out.println("1. Add User");
            System.out.println("2. Add Product");
            System.out.println("3. Add Order");
            System.out.println("4. Display Progress");
            System.out.println("5. Exit");

            int option;
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid option. Please try again.");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter user id: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter user surname: ");
                    String userSurname = scanner.nextLine();
                    System.out.print("Enter user balance: ");
                    double userBalance = scanner.nextDouble();
                    scanner.nextLine();

                    User user = new OrdinaryUser(userId, userName, userSurname, userBalance);
                    addUser(user);
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine();

                    Product product = new Product(productId, productName, productQuantity, productPrice);
                    addProduct(product);
                    break;
                case 3:
                    System.out.print("Enter user id: ");
                    int orderUserId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter product id: ");
                    int orderProductId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int orderQuantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Select shipment type:");
                    System.out.println("1. Regular");
                    System.out.println("2. Express");
                    System.out.println("3. Super Express");
                    int shipmentOption = scanner.nextInt();
                    ShipmentType shipmentType;
                    switch (shipmentOption) {
                        case 1:
                            shipmentType = ShipmentType.REGULAR;
                            break;
                        case 2:
                            shipmentType = ShipmentType.EXPRESS;
                            break;
                        case 3:
                            shipmentType = ShipmentType.SUPER_EXPRESS;
                            break;
                        default:
                            System.out.println("Invalid shipment type. Order canceled.");
                            continue;
                    }

                    addOrder(orderUserId, orderProductId, orderQuantity, shipmentType);
                    break;
                case 4:
                    displayProgress();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
