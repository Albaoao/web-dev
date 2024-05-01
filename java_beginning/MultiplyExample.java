import java.util.Scanner;
//This line imports the Scanner class from the java.util package
public class MultiplyExample {
    public static void main(String[] args) {
        //This line declares the main method, which serves as the entry point for the program.
        Scanner scanner = new Scanner(System.in);
        //This line creates a new Scanner object named "scanner" to read input from the keyboard.
        // Prompt user to enter the first number (A)
        System.out.print("Enter the first number (A): ");
        int A = scanner.nextInt();

        // Prompt user to enter the second number (B)
        System.out.print("Enter the second number (B): ");
        int B = scanner.nextInt();

        // Close the scanner after taking input
        scanner.close();

        // Initialize the result to 0
        int result = 0;

        // Use a loop to multiply A and B without *
        for (int i = 0; i < B; i++) {
            result += A;
        }

        // Print the result
        System.out.println("Multiplication of " + A + " and " + B + " is: " + result);
    }
}

