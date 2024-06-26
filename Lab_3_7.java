public class Lab_3_7 {
    public static void main(String[] args) {
        int numRows = 10; // Number of rows for Pascal's Triangle
        printPascalTriangle(numRows);
    }

    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Printing spaces to make the triangle look centered
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
