import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year.
        System.out.print("Enter a year: ");

        // Read the year from the user.
        int year = input.nextInt();

        // Check if the year is a leap year.
        boolean isLeapYear = false;

        // Leap year conditions:
        // 1. If the year is evenly divisible by 4, it is a leap year,
        //    unless:
        // 2. If the year is evenly divisible by 100, it is NOT a leap year,
        //    unless:
        // 3. If the year is evenly divisible by 400, it IS a leap year.

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400, so it's a leap year
                } else {
                    isLeapYear = false; // Divisible by 100, but not 400, so it's not a leap year
                }
            } else {
                isLeapYear = true; // Divisible by 4, but not 100, so it's a leap year
            }
        } else {
            isLeapYear = false; // Not divisible by 4, so it's not a leap year
        }

        // Print the result.
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner.
        input.close();
    }
}