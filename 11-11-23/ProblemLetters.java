import java.util.Scanner;

public class ProblemLetters {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int userChoice = userInput.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("A");
                break;

            case 2:
                System.out.println("B");
                break;

            case 3:
                System.out.println("K");
                break;

            case 4:
                System.out.println("D");
                break;
        }

        userInput.close();

    }

}