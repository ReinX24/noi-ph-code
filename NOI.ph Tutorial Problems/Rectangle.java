import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int lengthInput = userInput.nextInt();
        int widthInput = userInput.nextInt();

        System.out.println(lengthInput * widthInput);

        userInput.close();

    }

}