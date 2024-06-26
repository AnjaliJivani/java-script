import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of elements (n)
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        // Calculate the sum of the first n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Calculate the average
        double average = (double) sum / n;
        
        // Display the average
        System.out.println("The average of the first " + n + " numbers is: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
