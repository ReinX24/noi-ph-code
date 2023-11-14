import java.util.Scanner;

public class ResistanceAaliyah {

    public static void main(String[] args) {

        // Creating a Scanner object to accept user input
        Scanner userInput = new Scanner(System.in);

        // Input Resistance 1 to 4 (R1 - R4)
        System.out.print("R1: ");
        double resistanceOne = userInput.nextInt();

        System.out.print("R2: ");
        double resistanceTwo = userInput.nextInt();

        System.out.print("R3: ");
        double resistanceThree = userInput.nextInt();

        System.out.print("R4: ");
        double resistanceFour = userInput.nextInt();

        // Adding the entered resistance values for our seriesTotal
        double seriesTotal = resistanceOne + resistanceTwo + resistanceThree + resistanceFour;

        // Finding using the resistors in paralell equation to find parallelTotal
        double parallelTotal = 1
                / ((1 / resistanceOne) + (1 / resistanceTwo) + (1 / resistanceThree) + (resistanceFour));

        // Printing our results
        System.out.println("Series total: " + seriesTotal);
        System.out.println("Parallel total: " + parallelTotal);

        // Closing our scanner object
        userInput.close();
    }

}