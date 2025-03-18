import java.util.Scanner;

public class OddSquareSeries {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of terms.
        System.out.print("Enter the number of terms (n): ");

        // Read the number of terms from the user.
        int n = input.nextInt();

        // Initialize the sum to 0.
        int sum = 0;

        // Initialize the odd number to 1.
        int oddNumber = 1;

        // Loop to calculate the sum of the series.
        for (int i = 0; i < n; i++) {
            // Calculate the square of the odd number.
            int square = oddNumber * oddNumber;

            // Add the square to the sum.
            sum += square;

            // Increment the odd number by 2 to get the next odd number.
            oddNumber += 2;
        }

        // Print the sum of the series.
        System.out.println("The sum of the series is: " + sum);

        // Close the scanner.
        input.close();
    }
}