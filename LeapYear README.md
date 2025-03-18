# Leap Year Checker

This Java program determines whether a given year is a leap year.

## Description

This program prompts the user to enter a year and then uses the standard leap year rules to determine if the year is a leap year. It then prints the result to the console.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `LeapYear.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac LeapYear.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java LeapYear
        ```
4.  **Input:**
    * The program will prompt you to enter a year.
    * Enter the year and press Enter.
5.  **Output:**
    * The program will display whether the entered year is a leap year or not.

## Example

Enter a year: 2024
2024 is a leap year.


Enter a year: 2023
2023 is not a leap year.


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the year as an integer.
* The leap year logic is implemented using nested `if` statements to check the following conditions:
    * If the year is divisible by 4.
    * If the year is divisible by 100 (and not 400).
    * If the year is divisible by 400.
* The result is stored in a boolean variable `isLeapYear`.
* The `println()` method is used to display the result.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.