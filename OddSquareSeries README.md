# Odd Square Series Sum Calculator

This Java program calculates the sum of the odd square series: 1² + 3² + 5² + ... up to n terms.

## Description

This program prompts the user to enter the number of terms (n) and then calculates the sum of the series where each term is the square of an odd number. The result is then printed to the console.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `OddSquareSeries.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac OddSquareSeries.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java OddSquareSeries
        ```
4.  **Input:**
    * The program will prompt you to enter the number of terms (n).
    * Enter the number and press Enter.
5.  **Output:**
    * The program will display the sum of the odd square series.

## Example

Enter the number of terms (n): 3
The sum of the series is: 35


(1² + 3² + 5² = 1 + 9 + 25 = 35)

Enter the number of terms (n): 5
The sum of the series is: 165


(1² + 3² + 5² + 7² + 9² = 1 + 9 + 25 + 49 + 81 = 165)

## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the number of terms (n) as an integer.
* The `sum` variable is initialized to 0 to store the sum of the series.
* The `oddNumber` variable is initialized to 1, representing the first odd number.
* A `for` loop iterates `n` times to calculate each term and add it to the sum.
* Inside the loop, the square of the current `oddNumber` is calculated and added to the `sum`.
* The `oddNumber` is incremented by 2 in each iteration to get the next odd number.
* The `println()` method is used to display the final sum.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.