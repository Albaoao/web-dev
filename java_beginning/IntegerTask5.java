import java.util.Scanner;
public class IntegerTask5 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Initialize variables for sum and entered number
        int sumOfOddNumbers = 0;
        int number;
        // Prompt user to enter an integer or 0 to exit
        System.out.println("Enter integer numbers. Enter 0 to finish:");
        do {
            // Read the entered number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            // Check if the entered number is not 0
            if (number != 0) {
                // Check if the entered number is odd
                if (number % 2 != 0) {
                    // Update the sum if the number is odd
                    sumOfOddNumbers += number;
                }
            }
        } while (number != 0);
        // Close the scanner after taking input
        scanner.close();
        // Display the sum of odd numbers
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
    }
}

