import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");

        // Read the number from the user.
        int number = input.nextInt();

        // Check if the number is negative. Factorial is not defined for negative numbers.
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial.
            long factorial = 1; // Use long to handle larger factorials

            // Loop from 1 to the number to calculate the factorial.
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the factorial by the current number
            }

            // Print the factorial.
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner.
        input.close();
    }
}