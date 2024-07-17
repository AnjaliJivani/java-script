import java.util.Scanner;

public class Lab_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size + 1];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number to be inserted
        System.out.print("Enter the number to be inserted: ");
        int number = scanner.nextInt();

        // Insert the number in the sorted array
        insertInSortedArray(array, size, number);

        // Print the array after insertion
        System.out.println("Array after insertion:");
        for (int i = 0; i <= size; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }

    // Function to insert a number in a sorted array
    public static void insertInSortedArray(int[] array, int size, int number) {
        int i;
        for (i = size - 1; i >= 0 && array[i] > number; i--) {
            array[i + 1] = array[i];
        }
        array[i + 1] = number;
    }
}
