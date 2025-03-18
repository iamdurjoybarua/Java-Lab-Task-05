import java.util.Scanner;

public class BanglaSeason {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a month (1-12).
        System.out.print("Enter a month (1-12): ");

        // Read the month from the user.
        int month = input.nextInt();

        // Find the Bangla season using a switch statement.
        String banglaSeason;

        switch (month) {
            case 1:
            case 2:
                banglaSeason = "Shit (Winter)"; // Poush and Magh
                break;
            case 3:
            case 4:
                banglaSeason = "Bashonto (Spring)"; // Falgun and Chaitra
                break;
            case 5:
            case 6:
                banglaSeason = "Grishmo (Summer)"; // Baishakh and Jaishtha
                break;
            case 7:
            case 8:
                banglaSeason = "Barsha (Monsoon)"; // Ashar and Srabon
                break;
            case 9:
            case 10:
                banglaSeason = "Shorot (Autumn)"; // Bhadro and Ashwin
                break;
            case 11:
            case 12:
                banglaSeason = "Hemonto (Late Autumn)"; // Kartik and Agrahayan
                break;
            default:
                banglaSeason = "Invalid month";
        }

        // Print the Bangla season.
        System.out.println("The Bangla season for month " + month + " is: " + banglaSeason);

        // Close the scanner.
        input.close();
    }
}