import java.util.Scanner;

public class Lab_3_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements (n)
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[n];
        
        // Read n numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Initialize variables to find positions
        int smallestIndex = 0;
        int largestIndex = 0;
        
        // Find the positions of the smallest and largest numbers
        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[smallestIndex]) {
                smallestIndex = i;
            }
            if (numbers[i] > numbers[largestIndex]) {
                largestIndex = i;
            }
        }
        
        // Display the positions (1-based indexing for user-friendliness)
        System.out.println("The smallest number is at position: " + (smallestIndex + 1));
        System.out.println("The largest number is at position: " + (largestIndex + 1));
        
        // Close the scanner
        scanner.close();
    }
}
