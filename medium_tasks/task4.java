import java.util.*;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Select the base for arithmetic operations:");
        System.out.println("1. Decimal");
        System.out.println("2. Binary");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performArithmeticOperations(number1, number2, 10);
                break;
            case 2:
                performArithmeticOperations(number1, number2, 2);
                break;
            case 3:
                performArithmeticOperations(number1, number2, 8);
                break;
            case 4:
                performArithmeticOperations(number1, number2, 16);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    public static void performArithmeticOperations(int number1, int number2, int base) {
        List<String> conversions = new ArrayList<>();
        conversions.add(Integer.toString(number1 + number2, base));
        conversions.add(Integer.toString(number1 - number2, base));
        conversions.add(Integer.toString(number1 * number2, base));

        if (number2 != 0) {
            conversions.add(Integer.toString(number1 / number2, base));
        } else {
            conversions.add("Division by zero");
        }

        Set<String> uniqueConversions = new HashSet<>(conversions);
        System.out.println("Addition: " + uniqueConversions.toArray()[0]);
        System.out.println("Subtraction: " + uniqueConversions.toArray()[1]);
        System.out.println("Multiplication: " + uniqueConversions.toArray()[2]);
        System.out.println("Division: " + uniqueConversions.toArray()[3]);
    }
}
