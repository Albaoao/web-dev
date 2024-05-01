import java.util.Scanner;
import Loan.NationalBank;
import Loan.SecondTierBank;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creating necessary objects
        NationalBank nationalBank = new NationalBank();
        SecondTierBank secondTierBank = new SecondTierBank();

        System.out.println("Choose a bank: ");
        System.out.println("1. National Bank");
        System.out.println("2. Second Tier Bank");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //  National Bank
                System.out.println("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                System.out.println("Enter duration (in months): ");
                int duration = scanner.nextInt();
                System.out.println("Enter client type (individual/legalEntity): ");
                String clientType = scanner.next();
                double nationalDeposit = nationalBank.calculateDeposit(amount, duration, clientType);
                System.out.println("National Bank deposit reward: " + nationalDeposit);
                break;
            case 2:
                //  Second Tier Bank
                System.out.println("Enter deposit amount: ");
                double amount2 = scanner.nextDouble();
                System.out.println("Enter duration (in months): ");
                int duration2 = scanner.nextInt();
                System.out.println("Enter client type (individual/legalEntity): ");
                String clientType2 = scanner.next();
                double secondTierDeposit = secondTierBank.calculateDeposit(amount2, duration2, clientType2);
                System.out.println("Second Tier Bank deposit reward: " + secondTierDeposit);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
