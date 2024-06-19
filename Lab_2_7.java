public class Lab_2_7 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        // Find the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // Calculate the sum of the power of each digit
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}
