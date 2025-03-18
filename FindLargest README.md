# Find Largest Number in Array

This Java program finds the largest number in an array of integers.

## Description

This program prompts the user to enter the size of an array and then the elements of the array. It then finds and prints the largest number in the array. If the array is empty, it prints an error message.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `FindLargest.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac FindLargest.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java FindLargest
        ```
4.  **Input:**
    * The program will prompt you to enter the size of the array.
    * Enter the size and press Enter.
    * The program will then prompt you to enter the numbers.
    * Enter the numbers, one at a time, pressing Enter after each number.
5.  **Output:**
    * The program will display the largest number in the array.
    * If the array is empty, it will display an error message.

## Example


Enter the size of the array: 5
Enter the numbers:
10
5
20
8
15
The largest number is: 20


Enter the size of the array: 0
Enter the numbers:
Array is empty.
The largest number is: -2147483648


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the size of the array and the array elements as integers.
* The `findLargestNumber()` method finds the largest number in the array:
    * It first checks if the array is empty. If it is, it prints an error message and returns `Integer.MIN_VALUE`.
    * It initializes the `largest` variable to the first element of the array.
    * It iterates through the array, comparing each element with the current `largest` value. If an element is greater than `largest`, it updates `largest`.
    * It returns the `largest` value.
* The `println()` method is used to display the result.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.