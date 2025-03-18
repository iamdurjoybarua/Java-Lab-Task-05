import java.util.Scanner;

public class AlternatingSeries {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of terms.
        System.out.print("Enter the number of terms (n): ");

        // Read the number of terms from the user.
        int n = input.nextInt();

        // Initialize the sum to 0.
        int sum = 0;

        // Loop to calculate the sum of the series.
        for (int i = 1; i <= n; i++) {
            // Check if the current term is odd or even.
            if (i % 2 == 0) {
                // If even, subtract the term from the sum.
                sum -= i;
            } else {
                // If odd, add the term to the sum.
                sum += i;
            }
        }

        // Print the sum of the series.
        System.out.println("The sum of the series is: " + sum);

        // Close the scanner.
        input.close();
    }
}