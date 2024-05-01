import java.util.Scanner;
public class SumTask4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        // Close the scanner after taking input
        scanner.close();
        // Validate that N is a positive integer
        if (N <= 0) {
            System.out.println("Please enter a positive integer for N.");
        } else {
            // Compute the sum of the first N odd numbers
            int sum = computeSum(N);

            // Display the result
            System.out.println("Sum of the first " + N + " numbers from the sequence: " + sum);
        }
    }
    // Method to compute the sum of the first N odd numbers
    private static int computeSum(int N) {
        int sum = 0;
        int currentTerm = 1;
        for (int i = 0; i < N; i++) {
            sum += currentTerm;
            // Each term in the sequence is obtained by adding 2 to the previous term
            currentTerm += 2;
        }
        return sum;
    }
}

