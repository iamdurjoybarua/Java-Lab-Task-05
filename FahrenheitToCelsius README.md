# Fahrenheit to Celsius Converter


This Java program converts a temperature from Fahrenheit to Celsius.


## Description

This simple Java application prompts the user to input a temperature in Fahrenheit and then calculates and displays the equivalent temperature in Celsius. It uses the standard conversion formula:
Celsius = (Fahrenheit - 32) * 5/9


## How to Use

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed on your system.
2.  **Compilation:**
    * Save the `FahrenheitToCelsius.java` file.
    * Open a terminal or command prompt and navigate to the directory where you saved the file.
    * Compile the Java code using the following command:
        ```bash
        javac FahrenheitToCelsius.java
        ```
3.  **Execution:**
    * After successful compilation, run the program using:
        ```bash
        java FahrenheitToCelsius
        ```
4.  **Input:**
    * The program will prompt you to enter a temperature in Fahrenheit.
    * Enter the temperature and press Enter.
5.  **Output:**
    * The program will display the equivalent temperature in Celsius.


## Example

Input a degree in Fahrenheit: 212
212.0 degree Fahrenheit is equal to 100.0 in Celsius


## Code Explanation

* The program uses the `Scanner` class to read user input from the console.
* The `nextDouble()` method reads the Fahrenheit temperature as a double.
* The conversion formula is applied to calculate the Celsius temperature.
* The `println()` method is used to display the result.
* The `input.close()` method is used to close the scanner and prevent resource leaks.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.