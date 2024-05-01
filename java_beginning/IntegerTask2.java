import java.util.Scanner;
public class IntegerTask2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Initialize variables to keep track of the sum, count, and entered number
        int sum = 0;
        int count = 0;
        int number;
        // Prompt user to enter an integer or 0 to exit
        System.out.println("Enter integer numbers. Enter 0 to finish:");
        do {
            // Read the entered number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            // Check if the entered number is not 0
            if (number != 0) {
                // Update sum and count
                sum += number;
                count++;
            }
        } while (number != 0);
        // Close the scanner after taking input
        scanner.close();
        // Display the overall amount of entered numbers
        System.out.println("Overall amount of entered numbers: " + count);
        // Calculate and display the average
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Average of entered numbers: %.2f%n", average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}

