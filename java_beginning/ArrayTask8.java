import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask8 {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of sentences
        System.out.print("Enter the number of sentences: ");
        int numSentences = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the sentences
        String[] inputArray = new String[numSentences];

        // Prompt user to enter each sentence
        for (int i = 0; i < numSentences; i++) {
            System.out.print("Enter sentence #" + (i + 1) + ": ");
            inputArray[i] = scanner.nextLine();
        }

        // Close the scanner after taking input
        scanner.close();

        // Use the filterStringsByVowels method to get sentences with more than 4 vowels
        String[] resultArray = filterStringsByVowels(inputArray);

        // Output the result
        System.out.println("Original Sentences: " + Arrays.toString(inputArray));
        System.out.println("Sentences with more than 4 vowels: " + Arrays.toString(resultArray));
    }

    // Method to filter sentences with more than 4 vowels
    private static String[] filterStringsByVowels(String[] inputArray) {
        return Arrays.stream(inputArray)
                .filter(s -> countVowels(s) > 4)
                .toArray(String[]::new);
    }

    // Method to count the number of vowels in a string
    private static int countVowels(String input) {
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        int vowelCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is a vowel
            if (isVowel(currentChar)) {
                vowelCount++;
            }
        }

        // Return the total count of vowels
        return vowelCount;
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        // Check if the character is one of the vowels (a, e, i, o, u)
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

