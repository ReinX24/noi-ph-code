import java.util.Scanner;

public class Ordinals {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int userInteger = userInput.nextInt();

        StringBuilder userStr = new StringBuilder(String.valueOf(userInteger));

        String lastTwoChar = "";
        if (userStr.toString().length() >= 2) {
            lastTwoChar = userStr.substring(userStr.toString().length() - 2, userStr.toString().length());
        }

        char lastChar = userStr.charAt(userStr.length() - 1);

        if (lastTwoChar.toString().equals("11") || lastTwoChar.toString().equals("12")
                || lastTwoChar.toString().equals("13")) {
            userStr.append("th");
        } else if (lastChar == '1') {
            userStr.append("st");
        } else if (lastChar == '2') {
            userStr.append("nd");
        } else if (lastChar == '3') {
            userStr.append("rd");
        } else {
            userStr.append("th");
        }

        System.out.println(userStr);

        userInput.close();

    }

}
