import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array.
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create an array to store the numbers.
        int[] numbers = new int[size];

        // Prompt the user to enter the numbers.
        System.out.println("Enter the numbers:");

        // Read the numbers from the user and store them in the array.
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Sort the array in ascending order using Arrays.sort().
        Arrays.sort(numbers);

        // Print the sorted array.
        System.out.println("Sorted array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Add a newline for better formatting.

        // Close the scanner.
        input.close();
    }
}