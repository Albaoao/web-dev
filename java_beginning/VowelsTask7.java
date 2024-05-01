import java.util.Scanner;
public class VowelsTask7 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        // Close the scanner after taking input
        scanner.close();
        // Use the countVowels method to get the number of vowels in the sentence
        int numberOfVowels = countVowels(inputSentence);
        // Output the result
        System.out.println("Number of vowels in the sentence: " + numberOfVowels);
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
