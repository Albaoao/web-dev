import java.util.Scanner;
public class Max3Task6 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter three integer numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        // Close the scanner after taking input
        scanner.close();
        // Use the findMax method to get the maximum among the three numbers
        int maxNumber = findMax(num1, num2, num3);
        // Output the result
        System.out.println("The maximum among " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNumber);
    }
    // Method to find the maximum among three numbers
    private static int findMax(int num1, int num2, int num3) {
        // Use the Math.max method to find the maximum of two numbers
        int maxOfFirstTwo = Math.max(num1, num2);
        // Use the Math.max method again to find the maximum of the result and the third number
        int maxNumber = Math.max(maxOfFirstTwo, num3);
        // Return the final maximum number
        return maxNumber;
    }
}

