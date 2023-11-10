import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int K1 = userInput.nextInt();
        int D1 = userInput.nextInt();

        int K2 = userInput.nextInt();
        int D2 = userInput.nextInt();

        double surfaceAreaOne = K1 * Math.pow(D1 / 2.0, 2) * Math.PI;
        double surfaceAreaTwo = K2 * Math.pow(D2 / 2.0, 2) * Math.PI;

        if (surfaceAreaOne > surfaceAreaTwo) {
            System.out.println("Maguire's Pizza");
        } else if (surfaceAreaTwo > surfaceAreaOne) {
            System.out.println("Holland's Pizza");
        } else {
            System.out.println("Garfield's Lasagna");
        }

        userInput.close();
    }

}
