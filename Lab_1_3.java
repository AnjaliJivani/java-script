import java.util.Scanner;

public class Lab_1_3 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Convert the character to lowercase to simplify the checks
        character = Character.toLowerCase(character);

        // Determine if the character is a vowel
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is not a vowel.");
        }

        // Close the scanner
        scanner.close();
    }
}
