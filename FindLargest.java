import java.util.Scanner;

public class FindLargest {

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

        // Find the largest number in the array.
        int largest = findLargestNumber(numbers);

        // Print the largest number.
        System.out.println("The largest number is: " + largest);

        // Close the scanner.
        input.close();
    }

    // Function to find the largest number in an array.
    public static int findLargestNumber(int[] arr) {
        // Check if the array is empty.
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE; // Return the smallest possible integer value.
        }

        // Initialize the largest number to the first element of the array.
        int largest = arr[0];

        // Iterate through the array and update the largest number.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Return the largest number.
        return largest;
    }
}