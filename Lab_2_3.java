import java.util.Scanner;

public class Lab_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Input exponent number
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate power using loop
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Print the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
