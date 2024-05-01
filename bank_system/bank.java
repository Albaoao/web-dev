import java.util.*;

interface Payments {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, UserAccount recipient);
}

class UserAccount {
    private Integer id;
    private String name;
    private String surname;
    private Double balance;
    private Payments paymentType;
    private ArrayList<Transaction> transactionsHistory;

    public UserAccount(Integer id, String name, String surname, Double balance, Payments paymentType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.paymentType = paymentType;
        this.transactionsHistory = new ArrayList<>();
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

    public ArrayList<Transaction> getTransactionsHistory() {
        return transactionsHistory;
    }

    public void addTransaction(Transaction transaction) {
        transactionsHistory.add(transaction);
    }

    public void setPaymentType(Payments paymentType) {
        this.paymentType = paymentType;
    }

    public void processTransaction(String type, double amount, UserAccount recipient) {
        if (type.equals("deposit")) {
            paymentType.deposit(amount);
            balance += amount;
        } else if (type.equals("withdraw")) {
            paymentType.withdraw(amount);
            balance -= amount;
        } else if (type.equals("transfer")) {
            paymentType.transfer(amount, recipient);
            balance -= amount;
        }

        addTransaction(new Transaction(type, amount));
    }
}

class Transaction {
    private Integer id;
    private Date date;
    private String type;
    private Double amountOfMoney;

    public Transaction(String type, Double amountOfMoney) {
        this.date = new Date();
        this.type = type;
        this.amountOfMoney = amountOfMoney;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }
}

class DepositTransaction extends Transaction {
    public DepositTransaction(Double amountOfMoney) {
        super("deposit", amountOfMoney);
    }
}

class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(Double amountOfMoney) {
        super("withdraw", amountOfMoney);
    }
}

class TransferTransaction extends Transaction {
    private UserAccount recipient;

    public TransferTransaction(Double amountOfMoney, UserAccount recipient) {
        super("transfer", amountOfMoney);
        this.recipient = recipient;
    }
}

class PaymentManagement {
    private HashMap<Integer, UserAccount> accounts;
    private SortedSet<Transaction> transactions;

    public PaymentManagement() {
        this.accounts = new HashMap<>();
        this.transactions = new TreeSet<>(Comparator.comparing(Transaction::getDate));
    }

    public void addUser(UserAccount user) {
        accounts.put(user.getId(), user);
    }

    public void removeUser(Integer id) {
        accounts.remove(id);
    }

    public void logTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDate() + " - " + transaction.getType() + " - " + transaction.getAmountOfMoney());
        }
    }

    public void showUserTransactions(Integer id) {
        UserAccount user = accounts.get(id);
        if (user != null) {
            for (Transaction transaction : user.getTransactionsHistory()) {
                System.out.println(transaction.getDate() + " - " + transaction.getType() + " - " + transaction.getAmountOfMoney());
            }
        }
    }

    public void printStatement(Integer id) {
        UserAccount user = accounts.get(id);
        if (user != null) {
            System.out.println("Statement for " + user.getName() + " " + user.getSurname() + ":");
            for (Transaction transaction : user.getTransactionsHistory()) {
                System.out.println(transaction.getDate() + " - " + transaction.getType() + " - " + transaction.getAmountOfMoney());
            }
        }
    }

    public void checkTransactionValidity(Integer id, String type, double amount) {
        UserAccount user = accounts.get(id);
        if (user != null) {
            if (type.equals("withdraw") && user.getBalance() < amount) {
                System.out.println("Insufficient balance for withdrawal");
            }
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentManagement paymentManagement = new PaymentManagement();

        while (true) {
            System.out.println("1. Add user\n2. Log transaction\n3. Show user transactions\n4. Print statement\n5. Check transaction validity\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter user id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter user name: ");
                    String name = scanner.next();
                    System.out.print("Enter user surname: ");
                    String surname = scanner.next();
                    System.out.print("Enter user balance: ");
                    double balance = scanner.nextDouble();
                    paymentManagement.addUser(new UserAccount(id, name, surname, balance, null));
                    break;
                case 2:
                    // Log transaction
                    break;
                case 3:
                    // Show user transactions
                    break;
                case 4:
                    // Print statement
                    break;
                case 5:
                    // Check transaction validity
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

