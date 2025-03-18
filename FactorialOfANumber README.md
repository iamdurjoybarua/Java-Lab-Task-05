# Factorial Calculator

This Java program calculates the factorial of a given non-negative integer.

## Description

This program prompts the user to enter a non-negative integer and then calculates its factorial. The factorial of a non-negative integer `n`, denoted by `n!`, is the product of all positive integers less than or equal to `n`. It handles the special case of 0! which is 1. It also displays an error message if the input is a negative number.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `FactorialOfANumber.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac FactorialOfANumber.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java FactorialOfANumber
        ```
4.  **Input:**
    * The program will prompt you to enter a number.
    * Enter a non-negative integer and press Enter.
5.  **Output:**
    * The program will display the factorial of the entered number.
    * If a negative number is entered, the program will display an error message.

## Example

Enter a number: 5
Factorial of 5 is: 120


Enter a number: 0
Factorial of 0 is: 1


Enter a number: -3
Factorial is not defined for negative numbers.


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the number as an integer.
* The program checks if the number is negative. If it is, an error message is displayed.
* If the number is non-negative, the factorial is calculated using a `for` loop.
* The `factorial` variable is initialized to 1 and is of type `long` to handle larger factorials.
* The loop iterates from 1 to the entered number, multiplying `factorial` by each `i`.
* The `println()` method is used to display the result.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.