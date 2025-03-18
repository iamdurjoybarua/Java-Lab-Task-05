# Bangla Season Finder

This Java program determines the Bangla season corresponding to a given month (1-12).

## Description

This program prompts the user to enter a month number (1-12) and then uses a `switch` statement to determine the corresponding Bangla season. The Bangla seasons are:

* **Shit (Winter):** Poush and Magh (January and February)
* **Bashonto (Spring):** Falgun and Chaitra (March and April)
* **Grishmo (Summer):** Baishakh and Jaishtha (May and June)
* **Barsha (Monsoon):** Ashar and Srabon (July and August)
* **Shorot (Autumn):** Bhadro and Ashwin (September and October)
* **Hemonto (Late Autumn):** Kartik and Agrahayan (November and December)

If an invalid month number is entered, the program displays "Invalid month".

## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `BanglaSeason.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac BanglaSeason.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java BanglaSeason
        ```
4.  **Input:**
    * The program will prompt you to enter a month (1-12).
    * Enter the month number and press Enter.
5.  **Output:**
    * The program will display the corresponding Bangla season.

## Example

Enter a month (1-12): 3
The Bangla season for month 3 is: Bashonto (Spring)


Enter a month (1-12): 11
The Bangla season for month 11 is: Hemonto (Late Autumn)


Enter a month (1-12): 13
The Bangla season for month 13 is: Invalid month


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextInt()` method reads the month number as an integer.
* A `switch` statement is used to determine the Bangla season based on the month number.
* Each `case` corresponds to a month or a pair of months representing a Bangla season.
* The `default` case handles invalid month numbers.
* The `println()` method is used to display the result.
* The `input.close()` method closes the scanner to prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.