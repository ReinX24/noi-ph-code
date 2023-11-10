import java.util.Scanner;

public class Peacekeeper {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int roundsPlayed = userInput.nextInt();

        System.out.println(roundsPlayed % 2 == 0 ? "EVENING SAVED" : "EVENING RUINED");

        userInput.close();

    }

}
