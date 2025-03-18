# Ascending Array Sort

This Java program sorts an array of integers in ascending order.

## Description

This program prompts the user to enter the size of an array and then the elements of the array. It then sorts the array in ascending order using the `Arrays.sort()` method and prints the sorted array to the console.

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `AscendingSort.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac AscendingSort.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java AscendingSort
        ```
4.  **Input:**
    * The program will prompt you to enter the size of the array.
    * Enter the size and press Enter.
    * The program will then prompt you to enter the numbers.
    * Enter the numbers, one at a time, pressing Enter after each number.
5.  **Output:**
    * The program will display the sorted array in ascending order.

## Example

Enter the size of the array: 5
Enter the numbers:
5
2
8
1
9
Sorted array in ascending order:
1 2 5 8 9


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the size of the array and the array elements as integers.
* The `Arrays.sort(numbers)` method sorts the `numbers` array in ascending order.
* The program uses an enhanced `for` loop (`for (int number : numbers)`) to iterate through the sorted array and print each element, separated by spaces.
* `System.out.println()` is used to add a newline at the end of the output for better formatting.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull request