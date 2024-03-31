import java.util.*;
import java.util.Scanner;
public class Innovate_pro2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the reverseString method to reverse the input string
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Initialize two pointers, one pointing to the start and the other to the end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Iterate until the start pointer is less than the end pointer
        while (start < end) {
            // Swap characters at the start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
