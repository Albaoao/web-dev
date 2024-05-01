import java.util.Scanner;
public class MaximumTask3 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to keep track of the maximum and entered number
        int maxNumber = Integer.MIN_VALUE;
        int number;

        // Prompt user to enter an integer or 0 to exit
        System.out.println("Enter integer numbers. Enter 0 to finish:");

        do {
            // Read the entered number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            // Check if the entered number is greater than the current maximum
            if (number > maxNumber) {
                maxNumber = number;
            }
        } while (number != 0);

        // Close the scanner after taking input
        scanner.close();

        // Display the maximum number
        if (maxNumber != Integer.MIN_VALUE) {
            System.out.println("Maximum number entered: " + maxNumber);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}

