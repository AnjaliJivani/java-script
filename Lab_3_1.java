import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[n];
        
        // Read n numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Display the numbers
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
