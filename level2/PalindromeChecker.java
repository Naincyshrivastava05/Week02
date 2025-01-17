// Class to check whether a given string is a palindrome
public class PalindromeChecker {
    String text; // Field to store the input text

    // Constructor to initialize the PalindromeChecker with a given string
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    public void IsPalindrom() {
        int n = text.length(); // Get the length of the string

        // Loop through the string to check if it reads the same forwards and backwards
        for (int i = 0; i < n / 2; i++) { // Only need to compare until halfway
            if (text.charAt(i) != text.charAt(n - i - 1)) {
                // If characters don't match, it's not a palindrome
                System.out.println("This is not a palindrome String");
                return; // Exit the method after determining it's not a palindrome
            }
        }

        // If the loop completes without finding a mismatch, it's a palindrome
        System.out.println("This is a palindrome String");
    }
}

// Main class to test the PalindromeChecker class
import java.util.Scanner; // Import Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.print("Enter String: ");
        String s = sc.next(); // Read the input string

        // Create a PalindromeChecker object with the input string
        PalindromeChecker pl = new PalindromeChecker(s);

        // Call the method to check if the string is a palindrome
        pl.IsPalindrom();

    }
}
