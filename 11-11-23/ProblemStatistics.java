import java.util.Scanner;

public class ProblemStatistics {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int contestantCount = userInput.nextInt();
        userInput.nextLine(); // fix console error

        String[] problemsSolved = new String[contestantCount];

        int aSolved = 0;
        int bSolved = 0;
        int cSolved = 0;
        int dSolved = 0;

        for (int i = 0; i < problemsSolved.length; i++) {
            problemsSolved[i] = userInput.nextLine();
        }

        for (int i = 0; i < problemsSolved.length; i++) {
            for (int j = 0; j < problemsSolved[i].length(); j++) {

                switch (problemsSolved[i].charAt(j)) {
                    case 'A':
                        aSolved++;
                        break;

                    case 'B':
                        bSolved++;
                        break;

                    case 'K':
                        cSolved++;
                        break;

                    case 'D':
                        dSolved++;
                        break;
                }

            }
        }

        System.out.printf("%d %d %d %d", aSolved, bSolved, cSolved, dSolved);

        userInput.close();

    }

}
