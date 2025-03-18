# Power Calculator

This Java program calculates the power of a given base raised to an exponent.

## Description

This program prompts the user to enter a base (which can be a decimal number) and an exponent (an integer). It then calculates and displays the result of raising the base to the power of the exponent. It handles positive, negative, and zero exponents.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `Power.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac Power.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java Power
        ```
4.  **Input:**
    * The program will prompt you to enter the base.
    * Enter the base and press Enter.
    * The program will then prompt you to enter the exponent.
    * Enter the exponent and press Enter.
5.  **Output:**
    * The program will display the result of the base raised to the power of the exponent.

## Example

Enter the base: 2
Enter the exponent: 3
2.0 raised to the power of 3 is: 8.0


Enter the base: 3
Enter the exponent: -2
3.0 raised to the power of -2 is: 0.1111111111111111


Enter the base: 5
Enter the exponent: 0
5.0 raised to the power of 0 is: 1.0


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextDouble()` method reads the base as a double.
* The `nextInt()` method reads the exponent as an integer.
* The `calculatePower()` method calculates the power.
    * If the exponent is 0, it returns 1.
    * If the exponent is positive, it uses a loop to multiply the base by itself exponent times.
    * If the exponent is negative, it calculates the power of the base raised to the absolute value of the exponent and returns the reciprocal.
* The `println()` method is used to display the result.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.