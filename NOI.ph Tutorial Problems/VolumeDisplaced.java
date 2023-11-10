import java.util.Scanner;

public class VolumeDisplaced {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int x = userInput.nextInt();
        int y = userInput.nextInt();

        int volumeDisplaced = y - x;

        // Calculating the radius of a sphere
        // Cube root of (3 * volumeDisplaces) / (4 * Math.PI)
        double sphereRadius = Math.cbrt((3.0 * volumeDisplaced) / (4 * Math.PI));

        // Calculate the diameter
        double sphereDiameter = 2 * sphereRadius;

        // Round off result to 5 decimal places
        System.out.printf("%.5f", sphereDiameter);

        userInput.close();

    }

}
