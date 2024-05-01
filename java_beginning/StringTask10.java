import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        // Close the scanner after taking input
        scanner.close();
        // Use the checkPalindrome method to determine if the string is a palindrome
        String result = checkPalindrome(inputString);
        // Output the result
        System.out.println("Is '" + inputString + "' a palindrome? " + result);
    }
    // Method to check if a string is a palindrome
    private static String checkPalindrome(String input) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Use StringBuilder to reverse the string
        StringBuilder reversedInput = new StringBuilder(cleanedInput).reverse();

        // Compare the original string with the reversed string
        if (cleanedInput.equals(reversedInput.toString())) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
