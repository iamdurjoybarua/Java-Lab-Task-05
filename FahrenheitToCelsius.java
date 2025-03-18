import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit.
        System.out.print("Input a degree in Fahrenheit: ");

        // Read the temperature in Fahrenheit from the user.
        double fahrenheit = input.nextDouble();

        // Calculate the temperature in Celsius using the formula:
        // Celsius = (Fahrenheit - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Print the result.
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        // Close the scanner to prevent resource leaks.
        input.close();
    }
}