# Alternating Series Sum Calculator

This Java program calculates the sum of the alternating series: 1 - 2 + 3 - 4 + ... up to n terms.

## Description

This program prompts the user to enter the number of terms (n) and then calculates the sum of the series where odd terms are added and even terms are subtracted. The result is then printed to the console.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `AlternatingSeries.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac AlternatingSeries.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java AlternatingSeries
        ```
4.  **Input:**
    * The program will prompt you to enter the number of terms (n).
    * Enter the number and press Enter.
5.  **Output:**
    * The program will display the sum of the alternating series.

## Example

Enter the number of terms (n): 5
The sum of the series is: 3


(1 - 2 + 3 - 4 + 5 = 3)

Enter the number of terms (n): 6
The sum of the series is: -3


(1 - 2 + 3 - 4 + 5 - 6 = -3)

## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the number of terms (n) as an integer.
* The `sum` variable is initialized to 0 to store the sum of the series.
* A `for` loop iterates from 1 to `n` (inclusive) to calculate each term and update the sum.
* Inside the loop, the program checks if the current term `i` is even or odd using the modulo operator (`%`).
* If `i` is even, it is subtracted from the `sum`.
* If `i` is odd, it is added to the `sum`.
* The `println()` method is used to display the final sum.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.