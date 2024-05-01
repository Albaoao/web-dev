import java.util.Scanner;

public class StringTask9 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter text1
        System.out.print("Enter text1: ");
        String text1 = scanner.nextLine();
        // Prompt user to enter text2
        System.out.print("Enter text2: ");
        String text2 = scanner.nextLine();

        // Close the scanner after taking input
        scanner.close();

        // Use the containsText method to check if text1 contains text2
        String result = containsText(text1, text2);

        // Output the result
        System.out.println("Does '" + text1 + "' contain '" + text2 + "'? " + result);
    }

    // Method to check if text1 contains text2
    private static String containsText(String text1, String text2) {
        // Use the contains method to check if text1 contains text2
        if (text1.contains(text2)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

