import java.util.Scanner;
import java.util.Stack;

public class Induction {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Stack<String> recipeStack = new Stack<>();

        int inputCouter = 0;
        while (inputCouter < 5) {
            recipeStack.push(userInput.nextLine());
            inputCouter++;
        }

        while (!recipeStack.isEmpty()) {
            System.out.println(recipeStack.pop());
        }

        userInput.close();

    }

}
