import java.util.Scanner;

public class Lab_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the starting number (m)
        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();
        
        // Ask the user for the ending number (n)
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        // Calculate the sum from m to n
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        
        // Display the sum
        System.out.println("The sum of numbers from " + m + " to " + n + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
