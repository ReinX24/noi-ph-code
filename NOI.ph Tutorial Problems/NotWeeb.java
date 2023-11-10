import java.util.Scanner;

public class NotWeeb {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String firstName = userInput.nextLine();
        String lastName = userInput.nextLine();
        String personHonorific = userInput.nextLine();

        System.out.printf("%s, %s\n", lastName, firstName);
        System.out.printf("%s-%s", firstName, personHonorific);

        userInput.close();

    }

}