import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base.
        System.out.print("Enter the base: ");

        // Read the base from the user.
        double base = input.nextDouble();

        // Prompt the user to enter the exponent.
        System.out.print("Enter the exponent: ");

        // Read the exponent from the user.
        int exponent = input.nextInt(); // Using int for integer exponents

        // Calculate the power.
        double result = calculatePower(base, exponent);

        // Print the result.
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner.
        input.close();
    }

    // Function to calculate the power of a base raised to an exponent.
    public static double calculatePower(double base, int exponent) {
        // Handle the case where the exponent is 0.
        if (exponent == 0) {
            return 1; // Any number raised to the power of 0 is 1.
        }

        // Handle the case where the exponent is positive.
        if (exponent > 0) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }

        // Handle the case where the exponent is negative.
        else {
            double result = 1;
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            return 1 / result; // base^-exponent = 1/base^exponent
        }

    }
}