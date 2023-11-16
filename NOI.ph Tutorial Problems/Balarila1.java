import java.util.Scanner;

public class Balarila1 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        StringBuilder resultStr = new StringBuilder();

        String userStr = userInput.nextLine();

        char firstChar = userStr.charAt(0);

        if (firstChar == 'd' || firstChar == 'l' || firstChar == 'r' || firstChar == 's' || firstChar == 't') {
            resultStr.append("pan");
        } else if (firstChar == 'p' || firstChar == 'b') {
            resultStr.append("pam");
        } else {
            resultStr.append("pang");
        }

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            resultStr.append("-");
        }

        resultStr.append(userStr);

        System.out.println(resultStr);

        userInput.close();

    }

}